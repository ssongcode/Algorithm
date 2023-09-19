class Solution {
    public int solution(int n, int k) {
        // n인분, k개
        int cost = 12000 * n + 2000 * k;
        int tmp = n / 10;
        cost -= 2000 * tmp;
        return cost;
    }
}