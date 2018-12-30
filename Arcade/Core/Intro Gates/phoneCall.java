int phoneCall(int min1, int min2_10, int min11, int s) {
    if (s < min1)
        return 0;
    
    int minutes = 1;
    s -= min1;
    if (s == 0) {
        return minutes;
    }
    
    for (int i = 2; i <= 10; ++i) {
        if (s - min2_10 < 0) {
            return minutes;
        }
        
        minutes++;
        s -= min2_10;
    }
    
    while (s > 0) {
        if (s - min11 < 0) {
            return minutes;
        }
        
        minutes++;
        s -= min11;
    }
    
    return minutes;
}