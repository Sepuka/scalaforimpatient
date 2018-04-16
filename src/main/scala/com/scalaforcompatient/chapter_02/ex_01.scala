package com.scalaforcompatient.chapter_02

object ex_01 extends App {
  def signum(x: Integer): Integer = {
    if (x == 0) {
      0
    } else {
      if (x < 0) -1 else 1
    }
  }

  println("signum by 0 is " + signum(0))
  println("signum by 1 is " + signum(1))
  println("signum by 2 is " + signum(2))
  println("signum by -1 is " + signum(-1))
  println("signum by -2 is " + signum(-2))
}