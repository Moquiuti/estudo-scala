package aulas.model

class URL {
  def connect(host: String = "localhost", port: Int = 8080) = {
    println(s"$host - $port")
  }
}
