class Solution {
public:
    int addDigits(int num) {
        
            int sum = 0;
            int temp = num;
            while(temp>0){
                sum+= temp%10;
                temp = floor(temp/10);
            }
            
            return sum<10 ? sum : addDigits(sum);
            
    }
};