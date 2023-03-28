package com.knoldus.capitalize
import org.scalatest.flatspec.AnyFlatSpec

class CapitalizeSpec extends AnyFlatSpec {

  "capitalizeTheLetterA" should "return a list of capitalized strings with letter 'a' capitalized" in {
    val inputList = List("My", "name", "is", "Michael", "Scott")
    val expectedOutput = List("My", "nAme", "is", "MichAel", "Scott")
    assert(Capitalize.capitalizeTheLetterA(inputList) == expectedOutput)
  }

  it should "return the same list for an empty list" in {
    val inputList = List.empty[String]
    val expectedOutput = List.empty[String]
    assert(Capitalize.capitalizeTheLetterA(inputList) == expectedOutput)
  }

  it should "return the same list for a list with null elements" in {
    val inputList = List("My", "name", null, "Michael", "Scott")
    val expectedOutput = List("My", "nAme", null, "MichAel", "Scott")
    assertThrows[NoSuchElementException](Capitalize.capitalizeTheLetterA(inputList))
  }
}
