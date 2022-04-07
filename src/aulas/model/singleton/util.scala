package aulas.model.singleton

import java.time.Instant

/**
 * em Scala não existe a escrita static, porém quando houver a necessidade de criar uma classe
 * que não precisa ser instanciada é assim que deve-se ser feito "object"
 * conceito de Singleton
 */
object Util {
  val anoVigente = Instant.now()
}
