int mirrorBits(int a) {
    
    int revA = 0;
    while (a > 0) {
        revA = (revA << 1) | (a & 1);
        a = a >> 1;
    }
    
    return revA;
}