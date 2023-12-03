class Solution {
    public String solution(String str, int k) {
        String answer = "";
        int len = str.length();
        for(int i = 0; i < k; i++) {
            for(int j = 0; j < len; j++) {
                answer += str.charAt(j);
            }
        }
        
        return answer;
    }
}