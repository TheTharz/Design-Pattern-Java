public class SingletonThreadSafeTest {
  public static void main(String[] args) {
    SingletonThreadSafe singletonThreadSafe = SingletonThreadSafe.getThreadSafeInstance();
    SingletonThreadSafe singletonThreadSafe2 = SingletonThreadSafe.getThreadSafeInstance();
    if(singletonThreadSafe == singletonThreadSafe2) {
      System.out.println("singletonThreadSafe and singletonThreadSafe2 are the same instance");
    } else {
      System.out.println("singletonThreadSafe and singletonThreadSafe2 are not the same instance");
    }
  }
}
