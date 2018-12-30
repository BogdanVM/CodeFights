int countSumOfTwoRepresentations2(int n, int l, int r) {
    int ways = 0;
    for (int A = l; A <= r; ++A) {
        int B = n - A;
        if (B >= A && B <= r) {
            ways++;
        } 
    }
    
    return ways;
}