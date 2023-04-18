object Solution {
    def mergeAlternately(word1: String, word2: String): String = {
        val n = word1.length.max(word2.length)
        val s = new StringBuilder()
        for(i <- 0 until n) {
            if (i < word1.length) {
                s += word1(i)
            }
            if (i < word2.length) {
                s += word2(i)
            }
            
        }
            
        s.toString
    }
}