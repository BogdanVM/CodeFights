int largestNumber(int n) {
    
    Double powerOf10 = Math.pow(10, n);
    return powerOf10.intValue() - 1;
}