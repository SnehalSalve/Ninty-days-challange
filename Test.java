public class Test
{
    // All variables defined directly inside a class 
    // are member variables
    int a;
    private String b;
    void method1() {
      System.out.println("inside method 1");
    }
    int method2() {
      System.out.ptinln("inside method 2");
      return 0;
    }
  public static void main(String args[]){
  System.out.println("inside main function");
    Test object = new Test();
    obejct.method1();
    object.method2();
  }
}
