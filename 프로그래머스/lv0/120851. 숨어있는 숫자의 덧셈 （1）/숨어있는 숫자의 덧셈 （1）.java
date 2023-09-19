class Solution {
    public int solution(String str) {
        int sum = 0;
        for(int i = 0; i < str.length(); i++) {
            int tmp = str.charAt(i)-'0';
            if(0 <= tmp && tmp <=9) sum += tmp;
        }
        return sum;
    }
}