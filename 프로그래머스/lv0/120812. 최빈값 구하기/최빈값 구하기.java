class Solution {
    public int solution(int[] array) {
        int[] cnt = new int[1000];
        for(int i = 0; i < array.length; i++) {
            cnt[array[i]]++;
        }
        int max = 0;
        for(int i = 0; i < cnt.length; i++) {
            if(cnt[i] > max) max = cnt[i];
        }
        int answer = 0;
        int count = 0;
        for(int i = 0; i < cnt.length; i++) {
            if(cnt[i] == max) {
                answer = i;
                count++;
            }
        }
        if (count > 1) answer = -1;
        
        return answer;
    }
}