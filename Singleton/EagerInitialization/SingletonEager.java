public class SingletonEager {
  // Eager initialization
  private static SingletonEager eagerInstance = new SingletonEager();
  //private constructor to avoid client applications to use constructor
  private SingletonEager() {}
  //public static method to provide global access to singleton
  public static SingletonEager getEagerInstance(){
    return eagerInstance;
  }
}