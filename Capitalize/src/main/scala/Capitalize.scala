package com.knoldus.capitalize

import scala.util.{Failure, Success, Try}

object Capitalize {

  // Function to convert all the 'a' to capital 'A' in all strings in the list.
  def capitalizeTheLetterA(list: List[String]): List[String] = {

    list.map { string =>
      Try {
        string.map { character =>
          if (character == 'a') character.toUpper
          else character
        }
      } match {
        case Success(value) => value
        case Failure(exception) => throw new NoSuchElementException()
          string
      }
    }
  }
}
