import scala.collection.mutable

object Solution {
    def majorityElement(nums: Array[Int]): Int = {
 
        val map = mutable.Map[Int, Int]()
        for (num <- nums) {
            if (map.contains(num)) {
                map(num) += 1
            } else {
                map(num) = 1
            }
        }

        var majority = 0
        var majorityCount = 0
        for ((key, value) <- map) {
            if (value > majorityCount) {
                majority = key
                majorityCount = value
            }
        }
        majority

  }
}