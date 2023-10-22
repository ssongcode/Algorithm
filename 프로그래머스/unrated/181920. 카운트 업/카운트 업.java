class Solution {
    public int[] solution(int start, int end) {
        int len = end - start + 1;
        int[] answer = new int[len];
        int num = start;
        for(int i = 0; i < len; i++) {
            answer[i] = num;
            num++;
        }
        return answer;
    }
}