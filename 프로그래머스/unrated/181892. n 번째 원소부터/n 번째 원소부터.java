class Solution {
    public int[] solution(int[] num, int n) {
        int len = num.length - n + 1;
        int[] answer = new int[len];
        int idx = n - 1;
        for(int i = 0; i < len; i++) {
            answer[i] = num[idx];
            idx++;
        }
        return answer;
    }
}