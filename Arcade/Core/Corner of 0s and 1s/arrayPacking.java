int arrayPacking(int[] a) {
    int M = 0;
    
    for (int i = a.length - 1; i >= 0; --i) {
        M = (M << 8) | a[i];
    }
    
    return M;
}