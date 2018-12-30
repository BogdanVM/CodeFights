int rangeBitCount(int a, int b) {
    int numberOf1s = 0;
    for (int i = a; i <= b; ++i) {
        
        int temp = i;
        while (temp > 0) {
            int lastBit = temp & 1;
            
            if (lastBit == 1) {
                numberOf1s++;
            }
            temp = temp >> 1;
        }
    }
    
    return numberOf1s;
}