package com.scalaforcompatient.chapter_01

import scala.util.Random
import scala.math.BigInt.probablePrime

object ex_08 extends App {
  val rnd:BigInt = probablePrime(100, Random)
  println(rnd.toString(36))
}
