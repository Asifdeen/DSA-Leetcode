class Solution {
    public double pow(double x, long n) {
          if(n==0) {
            return 1.0;
          }
          if (n == 1) return x;

          if(n%2 == 1) {
            return x * pow(x, n-1);
          }
          return pow(x*x, n/2);
    }
    public double myPow(double x, int n) {
          double X = x;
          long N = n;
          if(N<0) {
            N = -N;
            X = 1/X;
          }
          return pow(X,N);

    }
}