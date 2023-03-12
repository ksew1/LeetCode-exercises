class Solution {
    public int romanToInt(String s) {
        int number = 0;
        Map<String, Integer> map = new HashMap<>();
        map.put("I", 1);
        map.put("V", 5);
        map.put("X", 10);
        map.put("L", 50);
        map.put("C", 100);
        map.put("D", 500);
        map.put("M", 1000);

        int lastVal = 0;
        int currVal = 0;

        for(int i=s.length()-1; i >= 0; i--) { 
            String c = Character.toString(s.charAt(i));
            currVal = map.get(c);
            if (currVal < lastVal) {
                number -= currVal;
            } else {
                number += currVal;
            }
            lastVal = currVal;

        }
        return number;     
    }
}