class Solution {
    public String toHex(int num) {
        char[] hex = "0123456789abcdef".toCharArray();

        StringBuilder result = new StringBuilder();
        if(num == 0) return "0";

        while(num != 0){
            int remainder = num & 15;
            result.append(hex[remainder]);
            num >>>= 4;
        }
        return result.reverse().toString();
    }
}