class Solution {
    public String solution(String str, int n) {
        String answer = "";
        int len = str.length();
        for(int i = len - n; i < len; i++) {
            answer += str.charAt(i);
        }
        return answer;
    }
}