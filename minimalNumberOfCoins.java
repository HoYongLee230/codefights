int minimalNumberOfCoins(int[] coins, int price) {
    int result = 0;
    for(int i = coins.length - 1; i >= 0 && price > 0; i--) {
        result += price / coins[i];
        price %= coins[i]; 
    }
    return result;
}
