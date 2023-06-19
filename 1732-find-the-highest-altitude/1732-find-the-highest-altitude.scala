object Solution {
    def largestAltitude(gain: Array[Int]): Int = {
        var highestAltitude = 0
        var currentAltitude = 0
        for (g <- gain) {
            currentAltitude += g
            highestAltitude = highestAltitude.max(currentAltitude)
        }
        highestAltitude
    }
}