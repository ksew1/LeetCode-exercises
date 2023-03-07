class Solution {
    private String s;
    private Boolean[][] p;
    public String longestPalindrome(String s) {
        this.s = s;
        this.p = new Boolean[s.length()][s.length()];
        
        int start = 0;
        int end = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < s.length(); j++) {
                if ( end - start < j - i  && P(i, j)) {
                    end = j;
                    start = i;
                }
            }
        }
        return s.substring(start, end+1);
        
    }
    private boolean P(int i, int j) {
        
        if(p[i][j] != null) {
            return p[i][j];
        }
        
        if (i == j) {
            p[i][j] = true;
            return true;
        }
        if (i == j + 1 || i == j -1) {
            p[i][j] = (s.charAt(i) == s.charAt(j));
            return p[i][j];
        }
        return (s.charAt(i) == s.charAt(j)) && P(i+1, j-1);
    }
}