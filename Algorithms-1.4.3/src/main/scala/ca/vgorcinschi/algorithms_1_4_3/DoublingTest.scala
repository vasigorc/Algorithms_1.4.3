package ca.vgorcinschi.algorithms_1_4_3

import ca.vgorcinschi.algorithms_1_4_3.helper._
import ca.vgorcinschi.algotithms_1_4_3.helper.StdRandom;
import ca.vgorcinschi.algotithms_1_4_3.helper.StdDraw

object DoublingTest extends App {

  def timeTrial(N: Int) = {
    val MAX: Int = 1000000
    val a = new Array[Int](N)
    for (i <- 0 until N)
      a(i) = StdRandom.uniform(-MAX, +MAX)
    val timer = new Stopwatch
    val count = ThreeSum.count(a)
    timer.elapsedTime()
  }

  //set up the scale of the canvas
  StdDraw.setXscale(250, 16000)
  StdDraw.setYscale(0, 70)
  var previousX = 0
  var previousY = 0.0
  var j: Int = 250
  for (N <- Iterator.iterate(j)(_ * 2) takeWhile (_ < 16001)) {
    val time = timeTrial(N)
//    println(f"$N%7d $time%5.1f")
    StdDraw.line(previousX, previousY, N, time)
    previousX = N
    previousY = time
  }
}