package ca.vgorcinschi.algorithms_1_4_3.helper

class Stopwatch(private val start: Long = System.currentTimeMillis()) {

  def elapsedTime(): Double = {
    val now = System.currentTimeMillis()
    (now - start) / 1000
  }
}