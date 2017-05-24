import net.sf.cglib.proxy.*;
import java.lang.reflect.*;

/**
  * wget http://central.maven.org/maven2/cglib/cglib/2.2.2/cglib-2.2.2.jar
  * <!-- https://mvnrepository.com/artifact/cglib/cglib -->
  * <dependency>
  *   <groupId>cglib</groupId>
  *   <artifactId>cglib</artifactId>
  *   <version>2.2.2</version>
  * </dependency>
  *
  * javac -classpath cglib-2.2.2.jar JavaMethodAreaOOM.java
  *
  * VM args: -XX:PermSize=10M -XX:MaxPermSize=10M
  *
  */

public class JavaMethodAreaOOM {
  public static void main(String args[]) {
    while (true) {
      Enhancer enhancer = new Enhancer();
      enhancer.setSuperclass(OOMObject.class);
      enhancer.setUseCache(false);
      enhancer.setCallback(new MethodInterceptor() {
        public Object intercept(Object obj, Method method, 
                                Object[] args, MethodProxy proxy) throws Throwable {
          return proxy.invokeSuper(obj, args);
        }
      });
      enhancer.create();
    }
  }

  static class OOMObject {

  }
}
