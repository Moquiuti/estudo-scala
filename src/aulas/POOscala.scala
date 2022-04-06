package aulas

object POOscala extends App {

  println("Praticando com métodos de calculos!");
  println(soma(9, 9));
  println(fib(9));
  println(raiz(9));
  println(fatorial(9));

  def soma(a: Int, b: Int): Int = return a + b;

  def fib(x: Int): Int = if (x == 1 || x == 2) 1 else fib(x - 1) + fib(x - 2)

  def raiz(a: Double) = Math.sqrt(a);

  def fatorial(x: Int): Int = if (x == 1) 1 else x * fatorial(x - 1)


}
