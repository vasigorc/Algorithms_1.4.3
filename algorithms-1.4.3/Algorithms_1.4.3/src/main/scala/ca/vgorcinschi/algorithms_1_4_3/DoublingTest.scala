package ca.vgorcinschi.algorithms_1_4_3

import ca.vgorcinschi.algorithms_1_4_3.helper._
import java.awt.Color

object DoublingTest extends App{
  
  def timeTrial(N:Int) = {
    val MAX:Int = 1000000
    val a = new Array[Int](N)
    for(i <- 0 until N)
      a(i) = StdRandom.uniform(-MAX, MAX)
    val timer = new Stopwatch
    val cnt = ThreeSum.count(a)
    timer.elapsedTime()
  }
  
  //start program here
  var previousX:Double = 0
  var previousY:Double = 0
  //configure canvas
  StdDraw.setXscale(250, 16000)
  StdDraw.setYscale(0, 240)
  StdDraw.setPenColor(Color.BLUE)
  for(N <- Iterator.iterate(250)(_ * 2) takeWhile (_ < 16001)){
    val time = timeTrial(N)
    println(f"$N%7d $time%5.1f")
    StdDraw.line(previousX, previousY, N, time)
    previousX = N
    previousY = time
  }
}