class Solution {
    public int solution(int n, String control) {
        int answer = n;
        int len = control.length();
        for(int i = 0; i<len; i++) {
           answer = cal(answer, control.charAt(i));
        }

        return answer;
    }
    
    public int cal(int num, char ch) {
        switch(ch) {
            case 'w':
                num += 1;
                break;
            case 's':
                num -= 1;
                break;
            case 'd':
                num += 10;
                break;
            case 'a':
                num -= 10;
                break;
        }
        return num;
    }
}