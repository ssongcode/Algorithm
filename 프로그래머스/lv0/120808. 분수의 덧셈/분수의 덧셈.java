class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        
        int lcm = denom1 * denom2 / gcd(denom1, denom2);
        int tmp = lcm / denom1 * numer1 + lcm / denom2 * numer2;
        int[] answer = {tmp, lcm};
        int gcd = gcd(answer[0], answer[1]);
        answer[0] /= gcd;
        answer[1] /= gcd;
        return answer;  
        
        
    }
    
    public int gcd(int num1, int num2) {
        if(num1 % num2 == 0) return num2;
        return gcd(num2, num1 % num2);
    }
}