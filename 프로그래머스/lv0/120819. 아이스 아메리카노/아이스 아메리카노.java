class Solution {
    public int[] solution(int money) {
        int cnt = money / 5500;
        int mod = money % 5500;
        int[] answer = {cnt, mod};
        return answer;
    }
}