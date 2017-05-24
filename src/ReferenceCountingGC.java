/**
  * testGC()方法执行后, objA 和 objB 会不会被 GC 呢?
  * java -XX:+PrintGC -XX:+PrintGCDetails ReferenceCountingGC
  */
public class ReferenceCountingGC {
  public Object instance = null;
  private static final int _1MB = 1024 * 1024;

  private byte[] bigSize = new byte[2 * _1MB];

  public static void testGC() {
    ReferenceCountingGC objA = new ReferenceCountingGC();
    ReferenceCountingGC objB = new ReferenceCountingGC();
    objA.instance = objB;
    objB.instance = objA;

    objA = null;
    objB = null;

    //假如在这里发生 GC, objA 和 objB 是否能被回收?
    System.gc();
  }

  public static void main(String args[]) {
    testGC();
  }
}
