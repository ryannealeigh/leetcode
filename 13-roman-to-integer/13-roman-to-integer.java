class Solution {
    static Map<Character, Integer> values = new HashMap<>();

    static {
        values.put('M', 1000);
        values.put('D', 500);
        values.put('C', 100);
        values.put('L', 50);
        values.put('X', 10);
        values.put('V', 5);
        values.put('I', 1);
    }

    public int romanToInt(String s) {
        int lastValue = values.get(s.charAt(s.length() - 1));
        int total = lastValue;

        for (int i = s.length() - 2; i >= 0; i--) {
            char c = s.charAt(i);
            int currentValue = values.get(c);
            if (currentValue < lastValue) total -= currentValue; else total += currentValue;
            lastValue = currentValue;
        }

        return total;
    }
}
