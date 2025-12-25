class Solution {
    public int countPartitions(int[]a , int mid) {
        int n = a.length;
        int partitions = 1;
        int partitionsSum = 0;

        for(int i=0;i<n;i++) {
            if(partitionsSum + a[i] <= mid) {
                partitionsSum+=a[i];
                
            } else {
                partitions++;
                partitionsSum = a[i];
            }
        }
        return partitions;
    }

    public int splitArray(int[] a, int k) {
     int n = a.length;
     int low = a[0];
     int high = 0;

     for(int i=0;i<n;i++) {
        low = Math.max(low,a[i]);
        high+=a[i];
     }

     while (low <= high) {
        int mid = low + (high-low)/2;

        int partitions = countPartitions(a,mid);

        if(partitions > k) {
            low = mid+1;
        } else {
            high = mid-1;
        }
     }
     return low;
    }
}
