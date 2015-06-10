object GetUrlContent extends App {

  val url = "http://nootrino.com"
  val result = scala.io.Source.fromURL(url).mkString
  println(result)

}
