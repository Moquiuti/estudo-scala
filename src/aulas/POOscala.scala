package aulas

import collection.mutable.MutableList

object POOscala extends App {

  println("Iniciado esteira de testes!");
  val primeiroValor: Int = 9;
  val segundoValor: Int = 18;

  val resultadoSoma = soma(primeiroValor, segundoValor);
  println("A soma dos valores é: " + resultadoSoma);

  val fibonati = fib(primeiroValor);
  println("O fibonatti do valor é: " + fibonati);

  val raizQuadrada = raiz(primeiroValor);
  println("A raiz quadrada do valor é: " + raizQuadrada);

  var minimo = min(primeiroValor, segundoValor);
  println("O menor valor dentre eles é: " + minimo);

  var maximoDivisorComum = mdc(primeiroValor, segundoValor);
  println("O máximo divisor comum dos valores é: " + maximoDivisorComum);

  var mes = mesNome(1);
  println("O mês traduzido é: " + mes);

  var primeiraFuncao = f1(1);
  println("Valor da primeira função é: " + primeiraFuncao);

  var segundaFuncao = f2(4)
  println("Valor da segunda função é: " + segundaFuncao);

  var terceiraFuncao = f3(-1);
  println("Valor da terceira função é: " + terceiraFuncao);


  println("O fatorial do valor é: " + fatorial(primeiroValor));
  println("O que é isso: " + oqEhIsso(List(1, 2, 3)));
  println(oqEhIsso2("Scala"));
  println("Tratando Exceção: " + converter("-2"));
  println("Tratando Exceção: " + converter("oi"));
  println("Tratando Exceção: " + converterInt("1"));
  println("Tratando Exceção: " + converterInt("Scala"));

  def soma(a: Int, b: Int): Int = return a + b;

  def fib(x: Int): Int = if (x == 1 || x == 2) 1 else fib(x - 1) + fib(x - 2)

  def raiz(a: Double) = Math.sqrt(a);

  def fatorial(x: Int): Int = if (x == 1) 1 else x * fatorial(x - 1)

  def min(a: Int, b: Int) = if (a > b) b else a

  def mdc(a: Int, b: Int) = {
    var minimo = min(a, b);
    while (!(a % minimo == 0 && b % minimo == 0)) {
      minimo = minimo - 1;
    }
    minimo;
  }

  def mesNome(x: Int): String = x match {
    case 1 => "Janeiro"
    case 2 => "Fevereiro";
    case 3 => "Março";
    case 4 => "Abril";
    case 5 => "Maio";
    case 6 => "Junho";
    case 7 => "Julho";
    case 8 => "Agosto";
    case 9 => "Setembro";
    case 10 => "Outubro";
    case 11 => "Novembro";
    case 12 => "Dezembro";
    case _ => "Informe um mês válido!";
  }

  def oqEhIsso(algo: Any): String = algo match {
    case 1 => "É o número 1"
    case "Oi" => "É uma saudação";
    case List(_, _, _) => "É uma lista de 3 elementos";
  }

  def oqEhIsso2(algo: Any): String = algo match {
    case algo: Int => "O número " + algo
    case algo: String => "A String " + algo;
    case List(a, b, c) => "Uma lista com elementos " + a + " " + b + " " + c;
    case _ => "Qualquer coisa";
  }

  def f1(x: Double): Double = x match {
    case x if (x >= 2) => x - 2;
    case x if (x >= -2 && x < 2) => x * x - 4;
    case x if (x < -2) => 3;
  }

  def f2(x: Double): Double = x match {
    case x if (x < 4) => x + 2;
    case 4 => 3;
    case x if (x >= 4) => 6 - x;
  }

  def f3(x: Double): Double = x match {
    case x if (x <= -1) => x + 2;
    case x if (x > -1) => x * x;
  }

  def converter(n: String): Int = try {
    n.toInt
  } catch {
    case e: NumberFormatException => 0;
    case _ => -1;
  }

  def converterInt(s: String): Option[Int] = try {
    Some(s.toInt)
  } catch {
    case e: NumberFormatException => None;
  }

  val original = List(1, 2, 3);
  /**
   * Ambas abaixo representam a mesma ação, somente formas diferentes de serem feitas.
   */
  val transformed1 = new MutableList[Int];
  for (i: Int <- 0 until original.size) transformed1 += original(i) * 2
  println(transformed1)

  val transformed2 = new MutableList[Int];
  for (i <- original) transformed2 += i * 2
  println(transformed2)

  /**
   * Produto cartesiano
   * Aqui embaixo também tratan-se do mesmo método escrito de maneiras diferentes.
   */
  println(for (i <- List(1, 2, 3); j <- List(4, 5, 6)) yield i * j);
  println(for {
    i <- List(1, 2, 3)
    j <- List(4, 5, 6)
    produto = i * j;
    if produto % 2 == 0} //Esse if é a representação de uma ação chamada gard em Scala, o que trabalhando juntamente com o yeld tratan-se de algo poderoso na linguagem
  yield produto);

  caixaAlta( Array ("oi", "td bem", "com vc") )
  def caixaAlta(args: Array[String]) {
    for (a <- args) yield println(a.toUpperCase)
  }
}
