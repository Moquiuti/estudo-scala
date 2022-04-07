package aulas.model

/**
 * Para que os valores sejam definidos como parametros necessário adicional o val a frente dos mesmos.
 * @param nome
 * @param idade
 */
class Pessoa(val nome: String,val idade: Int) {
  /**
   * Declarando novos contrutores conforme a necessidade...
   * se faz necessário o construtor principal da classe conforme ilustra o código abaixo
   */
  def this(nome: String, sobrenome: String, idade: Int) = this(nome + " " + sobrenome, idade)
}
