class Solution {
    public int[] solution(int[] arr) {
        int len = arr.length;
        int[] answer = new int[len + 1];
        for(int i = 0; i < len; i++){
            answer[i] = arr[i];
        }
        if(arr[len-1] > arr[len-2]) answer[len] = arr[len-1] - arr[len-2];
        else answer[len] = arr[len-1] * 2;
        return answer;
    }
}