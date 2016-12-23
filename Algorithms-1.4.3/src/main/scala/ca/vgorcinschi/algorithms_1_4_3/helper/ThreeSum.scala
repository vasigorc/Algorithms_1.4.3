package ca.vgorcinschi.algorithms_1_4_3.helper

object ThreeSum extends App {

  def count(a: Array[Int]) = {
    var cnt: Int = 0

    val N: Int = a.length

    for (i <- 0 until N)
      for (j <- i + 1 until N)
        for (k <- j + 1 until N)
          if (a(i) + a(j) + a(k) == 0) {
            cnt = cnt + 1
          }
    cnt
  }

  //start of the program
  val in = new In("1Kints.txt")
  val array = in.allInts
  val timer = new Stopwatch
  println(count(array) + " triples " + timer.elapsedTime() + " seconds")
}