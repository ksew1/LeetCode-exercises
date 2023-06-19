object Solution {
  def largestAltitude(gain: Array[Int]): Int = {
    findHighest(gain, 0, 0, 0)
  }


  def findHighest(gain: Array[Int], i: Int, high: Int, curr: Int): Int = i match {
    case i if (i < gain.length) => {
      val newCurr = curr + gain(i)
      findHighest(gain, i + 1, high.max(newCurr), newCurr)
    }
    case _ => high
  }
}