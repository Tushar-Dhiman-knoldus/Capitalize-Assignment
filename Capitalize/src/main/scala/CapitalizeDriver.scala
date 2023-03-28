package com.knoldus.capitalize

import Capitalize.capitalizeTheLetterA

object CapitalizeDriver extends App{
  val inputList = List("My", "name", "is", "Michael", "Scott")
  private val ExceptionInputList = List("My", "name", null, "Michael", "Scott")

  println(capitalizeTheLetterA(inputList))
  try {
    val capitalizedList = Capitalize.capitalizeTheLetterA(ExceptionInputList)
    println(capitalizedList)
  } catch {
    case _: NoSuchElementException => println("An exception occurred while processing the list.")
  }

}
