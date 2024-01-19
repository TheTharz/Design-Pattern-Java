public class Lazy {
  private static Lazy lazyInstance;
  private Lazy() {}

  public static Lazy getLazyInstance() {
    if (lazyInstance == null) {
      lazyInstance = new Lazy();
    }
    return lazyInstance;
  }
}
