class Solution {
public:
    int commonFactors(int a, int b) {
        int count =0;
        if(a==1 && b == 1){
            count++;
        }
        else{
            if(a%b == 0){
                count++;
            }
            int min_val = min(a,b);
            for(int i=1;i<=min_val/2;i++){
                if(a%i == 0 && b%i ==0){
                    count++;
                }
            }
        }
        
        return count;
    }
};