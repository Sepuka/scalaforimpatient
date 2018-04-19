package com.scalaforcompatient.chapter_02

/**
  * Write a Scala equivalent for the Java loop
  * for (int i = 10; i >= 0; i--) System.out.println(i);
  */
object ex_04 extends App {
  def classicLoop() {
    var i: Int = 10
    while (i > 0) {
      i = i - 1
      println(i)
    }
  }

  def reversedRange() {
    (1 to 10).reverse.foreach(println)
  }

  def asFor() {
    for (i <- 10 to (0, -1)) println(i)
  }

  classicLoop()
  reversedRange()
  asFor()
}
