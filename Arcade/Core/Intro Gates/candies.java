int candies(int n, int m) {
    
    Double sharing = new Double(m / n);
    return sharing.intValue() * n;
}