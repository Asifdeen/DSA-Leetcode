class Solution {

    public int sqSum(int num) {
        int sum =0;
        while(num>0) {
            int n = num%10;
            num = num/10;
            sum+= n*n;
        }
        return sum;
    }
    public boolean isHappy(int n) {
        int slow = n;
        int fast = n;

        while( fast != 1) {
            slow = sqSum(slow);
            fast = sqSum(fast);
            fast = sqSum(fast);

            if(slow == fast && slow != 1) {
                return false;
            }
        }
        return true;
    }
}