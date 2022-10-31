class Solution {
    public int romanToInt(String s) {
        Map<String, Integer> map = new HashMap<>();
        map.put("I", 1);
        map.put("V", 5);
        map.put("X", 10);
        map.put("L", 50);
        map.put("C", 100);
        map.put("D", 500);
        map.put("M", 1000);
        int ans = 0;
        String cur = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            cur = s.charAt(i) + "";
            if ((cur.equals("V") || cur.equals("X")) && i != 0)
                ans += (s.charAt(i - 1) == 'I')? map.get(cur) - map.get(s.charAt(--i) + "") : map.get(cur);
            else if ((cur.equals("L") || cur.equals("C")) && i != 0)
                ans += (s.charAt(i - 1) == 'X')? map.get(cur) - map.get(s.charAt(--i) + "") : map.get(cur);
            else if ((cur.equals("D") || cur.equals("M")) && i != 0)
                ans += (s.charAt(i - 1) == 'C')? map.get(cur) - map.get(s.charAt(--i) + "") : map.get(cur);
            else ans += map.get(s.charAt(i) + "");
        }
        return ans;
    }
}
