
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/micha/Documents/GitHub/SDevCA1/play-java-seed/conf/routes
// @DATE:Tue Feb 27 14:03:47 GMT 2018


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
