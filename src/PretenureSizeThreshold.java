class PretenureSizeThreshold{
  private static final int _1MB = 1024 * 1024;

  /**
    * VM 参数 : -verbose:gc -Xms20M -Xmx=10M -XX:+printGCDetails -XX:SurvivorRatio=8 -XX:pretenureSizeThreshold=3145728
    * 
    */
  public static void testPretenureSizeThreshold(){
    byte[] allocation;
    allocation = new byte[4 * _1MB]; //直接分配在老年代
  }

  public static void main(String args[]){
    testPretenureSizeThreshold();
  }
}
