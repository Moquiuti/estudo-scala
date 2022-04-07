package aulas

import aulas.model.Pessoa
import aulas.model.singleton.Util

object POOPessoa extends App {
  println("Data atual: " + Util.anoVigente)
  val pessoa = new Pessoa("Leandro", "Moquiuti", 32)
  println("Meu nome completo é: " + pessoa.nome)
  println("Tenho : " + pessoa.idade + " anos")
}
