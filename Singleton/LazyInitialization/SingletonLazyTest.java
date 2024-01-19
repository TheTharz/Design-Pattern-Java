public class SingletonLazyTest {

  public static void main(String[] args) {
    Lazy lazyInstance1 = Lazy.getLazyInstance();
    Lazy lazyInstance2 = Lazy.getLazyInstance();

    // Check if lazyInstance1 and lazyInstance2 are the same instance
    if (lazyInstance1 == lazyInstance2) {
      System.out.println("lazyInstance1 and lazyInstance2 are the same instance");
    } else {
      System.out.println("lazyInstance1 and lazyInstance2 are different instances");
    }
  }
  
}
