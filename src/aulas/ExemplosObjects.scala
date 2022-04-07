package aulas

import scala.io.Source

object ExemplosObjects extends App {
  /**
   * List.empty é um método do objectList que cria um objeto da classe List
   *
   * São dois elementos distintos
   * Object List
   * Classe List
   */
  val listaVazia = List.empty;
  println(listaVazia)

  /**
   * Outro Exemplo interessante é o Range aqui a baixo eu pego todos os números do 1 ao 10
   */
  val numeros = List.range(1, 10)
  println(numeros)

  /**
   * o próprio range possui outro auxiliar onde no exemplo eu coloco o número 2, dizendo que eu quero que
   * pule de dois em dois
   * Então reforçando a ideia do exemplo anterios é
   * O range é um método do object List que cria um objeto da classe List com os valores informados
   */
  val numeros2 = List.range(1, 10, 2)
  println(numeros2)


  /**
   * Outro exemplo é a classe Source diferente do List se faz necessário a importação dela
   * possui diversos métodos interessantes...
   * no exemplo abaixo irei ler uma página...
   * o fromURL é um método do Source e o getLines é um método resultante dessa chamada que retorna
   * todas as linhas lidas o qual será atribuido ao objeto linhas
   * ai abaixo eu aplico um filter que irá contar todas as linhas que contenha a palavra "da"
   */
  var linhas =  Source.fromURL("http://www.folhadoabc.com.br/index.php/secoes/negocios/item/15716-dois-em-cada-dez-sites-de-e-commerce-nao-estao-protegidos-para-compras").getLines;
  for (i <- linhas.filter(_.contains("da")))
    println(i)

}
