class Solution {
    public int[] solution(int[] number) {
        int len = number.length;
        int[] answer = new int[len];
        for(int i = 0; i < len; i++) {
            answer[i] = number[len-1 - i];
        }
        return answer;
    }
}