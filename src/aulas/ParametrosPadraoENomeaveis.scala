package aulas

import aulas.model.{URL, URL2}

object ParametrosPadraoENomeaveis extends App {
  new URL().connect("prod",9000)
  new URL().connect()

  /**
   * Agora um exemplo com parametro nomeado seria
   */
  new URL().connect(port = 8282)

  /**
   * Uma melhor forma de escrever
   */
  new URL2(port = 7070).connect()
}
