import java.math.BigInteger;

class Solution {
    public String addBinary(String a, String b) {
    	BigInteger num1 = new BigInteger(a, 2);
    	BigInteger num2 = new BigInteger(b, 2);
    	BigInteger res = num1.add(num2);
    	return res.toString(2);
    }
    
    /*  大整数不行
    public String addBinary(String a, String b) {
        int res = Integer.valueOf(a, 2) + Integer.valueOf(b, 2);
        return Integer.toBinaryString(res);
    }*/
}