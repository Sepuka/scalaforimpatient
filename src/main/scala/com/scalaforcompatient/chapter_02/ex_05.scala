package com.scalaforcompatient.chapter_02

/**
  * Write a procedure countdown(n: Int) that prints the numbers from n to 0.
  */
object ex_05 extends App {
  def printer(i: Int): Unit = {
    assert(i > 0)

    var j = i
    while (j >= 0) {
      print(j + " ")
      j = j - 1
    }
  }

  printer(10)
}
