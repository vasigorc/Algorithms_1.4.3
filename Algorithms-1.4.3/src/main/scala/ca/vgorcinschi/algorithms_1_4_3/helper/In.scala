package ca.vgorcinschi.algorithms_1_4_3.helper

import java.io.FileNotFoundException

class In(val fileName: String) {

  def allInts() = {
    var all = Option(getClass.getResourceAsStream("/" + fileName))
      .map(scala.io.Source.fromInputStream)
      .getOrElse(throw new FileNotFoundException(fileName)).mkString
    //method chaining on different instances of String
    val result = all.replaceAll(" ", "").split("\n").map(_ toInt)
    result
  }
}