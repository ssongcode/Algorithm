import java.util.*;

class Solution {
    public int[] solution(int[] num_list) {
        int len = num_list.length - 5;
        Arrays.sort(num_list);
        int[] answer = new int[len];
        for(int i = 0; i < len; i++){
            answer[i] = num_list[i+5];
        }
        return answer;
    }
}