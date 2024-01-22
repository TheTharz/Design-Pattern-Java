public class Lazy {
  private static Lazy lazyInstance;//meka mulinma null
  private Lazy() {}

  //object eka hdenne method eka call unama wtrai
  public static Lazy getLazyInstance() {
    if (lazyInstance == null) {
      //danata lazyinstance ekak nathnm
      lazyInstance = new Lazy();
    }
    //tyenwa nm meka
    return lazyInstance;
  }
}
