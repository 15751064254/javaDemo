import java.util.*;
import java.lang.*;

public class MemoryLeak{
  public static void main(String args[]) throws Exception{
    System.out.println("start main");

    Vector v = new Vector();
    for(int i=0; i<100; i++){
      Object o = new Object();
      v.add(o);
      o = null;
      Thread.sleep(1000);
      System.out.println("i=" + i);
    }
  }
}
