int mostFrequentDigitSum(int n) {
    Map<Integer, Integer> hm = new HashMap<>();
    int a, b, res = 0, max = 0;
    while(n > 0) {
        a = n; 
        b = 0;
        while(a > 0) {
            b += a % 10;
            a /= 10;
        }
        hm.put(b, hm.containsKey(b)?hm.get(b) + 1:1);
        n -= b;
    }
    for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {
        if(entry.getValue() >= max) {
            res = entry.getValue() == max?Math.max(res, entry.getKey()):entry.getKey();
            max = entry.getValue();
        }
    }
    return res;
}
