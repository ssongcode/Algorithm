import java.util.*;

class Solution {
    public int[] solution(int[] num, int n) {
        // 0, 0+n, 0+2n
        int len = num.length;
        List<Integer> list = new ArrayList<Integer>();
        for(int i = 0; i<len; i+=n) {
            list.add(num[i]);
        }
        int[] answer = new int[list.size()];
        for(int i = 0; i<list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}