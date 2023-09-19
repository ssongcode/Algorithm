class Solution {
    public int solution(int price) {
        double tmpPrice = 0;
        if (price >= 500000) tmpPrice = price * 0.8;
        else if(price >= 300000) tmpPrice = price * 0.9;
        else if(price >= 100000) tmpPrice = price * 0.95;
        else tmpPrice = price;
        return (int)tmpPrice;
    }
}