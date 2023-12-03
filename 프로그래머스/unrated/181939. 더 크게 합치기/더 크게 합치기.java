class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        answer = cal(String.valueOf(a),String.valueOf(b));
        return answer;
    }
    
    public int cal(String a, String b) {
        int aCalB = Integer.parseInt(a+b);
        int bCalA = Integer.parseInt(b+a);
        if(aCalB >= bCalA) 
            return aCalB;
        else 
            return bCalA;
    }
}