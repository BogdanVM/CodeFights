int[][] rotateImage(int[][] a) {
    
    
    int n = a.length;
    int[][] aux = new int[n][n];
    
    for (int j = 0; j < n; ++j) {
        
        int x = n - 1;
        for (int i = 0; i < n; ++i) {
            
            aux[j][x--] = a[i][j];
            
        }
    }
    
    return aux;
}