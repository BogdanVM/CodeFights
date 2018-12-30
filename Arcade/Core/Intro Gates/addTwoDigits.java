int addTwoDigits(int n) {
    
    if (n < 10)
        return n;
    
    return n % 10 + addTwoDigits(n / 10);
}