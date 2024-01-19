public class SingletonThreadSafe {
  private static SingletonThreadSafe threadSafeInstance;
  private SingletonThreadSafe() {}
  public static SingletonThreadSafe getThreadSafeInstance(){
    synchronized(SingletonThreadSafe.class) {
      if (threadSafeInstance == null) {
        threadSafeInstance = new SingletonThreadSafe();
      }
    }
    return threadSafeInstance;
  }
}
