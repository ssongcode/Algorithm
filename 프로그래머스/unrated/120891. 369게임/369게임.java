class Solution {
    public int solution(int order) {
        int answer = 0;
        while(true) {
            if (order == 0) break;
            if(order % 10 == 3) answer++;
            else if(order % 10 == 6) answer++;
            else if(order % 10 == 9) answer++;
            order /= 10;
        }
        
        // String num = String.valueOf(order);
        // for(int i = 0; i < num.length(); i++){
        //     if(num.charAt(i) == '3' || num.charAt(i) == '6' || num.charAt(i) == "9")
        //         answer++;
        // }
        return answer;
    }
}