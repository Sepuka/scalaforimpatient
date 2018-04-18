package com.scalaforcompatient.chapter_02

/**
  * Come up with one situation where the assignment x = y = 1 is valid in Scala. (Hint: Pick a
  * suitable type for x.)
  */
object ex_03 extends App {
  var y:Int = 0
  var x:Unit = y = 1
}
