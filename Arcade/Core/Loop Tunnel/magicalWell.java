int magicalWell(int a, int b, int n) {
    int amount = 0;
    for (int i = 0; i < n; ++i) {
        amount += a++ * b++;
    }
    
    return amount;
}