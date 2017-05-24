import java.util.*;

public class JavaRuntimeConstantPoolOOM{
  public static void main(String args[]){

    String str1 = new StringBuilder("计算机").append("软件").toString();
    System.out.println(str1.intern() == str1);
    System.out.println("intern= " + str1.intern()); 
    System.out.println("str1= " + str1);
    System.out.println("hashCode= " + str1.hashCode());

    String str2 = new StringBuilder("ja").append("va").toString();
    System.out.println(str2.intern() == str2);
    System.out.println("intern= " + str2.intern()); 
    System.out.println("str2= " + str2);
    System.out.println("hashCode= " + str2.hashCode());

    String a = "1";
    Integer b = 1;
    System.out.println(a.equals(b));

  }
}
