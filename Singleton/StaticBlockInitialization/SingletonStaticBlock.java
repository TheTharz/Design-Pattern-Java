public class SingletonStaticBlock{

  // Static block initialization
  private static SingletonStaticBlock staticBlockInstance;

  // Static block is used to initialize static data members.
  // It is executed before main method at the time of classloading.
  //It executed only once
  static {
    staticBlockInstance = new SingletonStaticBlock();
  }

  //private constructor to avoid client applications to use constructor
  private SingletonStaticBlock() {}

  //public static method to provide global access to singleton
  public static SingletonStaticBlock getStaticBlockInstance() {
    return staticBlockInstance;
  }

  //This is differ from lazy initialization because here the class is created before the main method loading
  //In lazy initialization instance is created when it is requested

  //However this is thread safe because the instance is created during the class loading
  //Class loading is inherently synchronized in java
  //So no need to worry about thread safety
}