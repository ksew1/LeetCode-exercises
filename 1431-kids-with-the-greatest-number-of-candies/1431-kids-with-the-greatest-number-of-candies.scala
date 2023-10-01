object Solution {
    def kidsWithCandies(candies: Array[Int], extraCandies: Int): List[Boolean] = {
        val max = candies.max
        candies.map(_ + extraCandies >= max).toList
  }
}