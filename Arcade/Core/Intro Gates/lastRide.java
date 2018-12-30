int lateRide(int n) {
    
    int hours = 0;
    while (n >= 60) {
        hours++;
        n -= 60;
    }
    
    int sum = 0;
    while (hours > 0) {
        sum += hours % 10;
        hours /= 10;
    }
    
    while (n > 0) {
        sum += n % 10;
        n /= 10;
    }
    
    return sum;
}
