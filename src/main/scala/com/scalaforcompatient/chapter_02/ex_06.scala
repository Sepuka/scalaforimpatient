package com.scalaforcompatient.chapter_02

/**
  * Write a for loop for computing the product of the Unicode codes of all letters in a string. For
  * example, the product of the characters in "Hello" is 9415087488L
  */
object ex_06 extends App {
  def mult(data: String): Long = {
    var result:Long = data(0).toInt
    for (ch <- data.drop(1)) {
      result *= ch.toInt
    }
    result
  }

  val result:BigInt = mult("Hello")
  println(result)
  assert(result == 9415087488L)
}
