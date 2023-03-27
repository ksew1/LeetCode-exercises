import scala.collection.mutable

object Solution {
    def majorityElement(nums: Array[Int]): Int = {
        var count = 0
        var candidate = -1
        for (num <- nums) {
            if (count <= 0) {
                candidate = num
            }
            count += (if (candidate == num) 1 else -1)
            
        }
        candidate
  }
}