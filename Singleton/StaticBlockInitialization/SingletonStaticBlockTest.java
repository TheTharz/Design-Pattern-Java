public class SingletonStaticBlockTest {

  public static void main(String[] args) {
    SingletonStaticBlock staticBlockInstance1 = SingletonStaticBlock.getStaticBlockInstance();
    SingletonStaticBlock staticBlockInstance2 = SingletonStaticBlock.getStaticBlockInstance();

    // Check if staticBlockInstance1 and staticBlockInstance2 are the same instance
    if (staticBlockInstance1 == staticBlockInstance2) {
      System.out.println("staticBlockInstance1 and staticBlockInstance2 are the same instance");
    } else {
      System.out.println("staticBlockInstance1 and staticBlockInstance2 are different instances");
    }
  }
  
}
