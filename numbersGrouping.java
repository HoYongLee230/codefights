int numbersGrouping(int[] a) {
    Arrays.sort(a);
    int count = 0, start = 0;
    for(int i = 0; i < a.length; i++) {
        if(a[i] > start * 10000) {
            start = (a[i] - 1)/10000 + 1;
            count++;
        }
    }
    return count + a.length;
}
