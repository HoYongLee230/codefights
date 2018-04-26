int[] switchLights(int[] a) {
    int [] result = new int [a.length];
    boolean flip = false;
    for(int i = a.length - 1; i >= 0; i--) {
        flip = a[i] == 1?!flip:flip;
        result[i] = flip?a[i] == 1?0:1:a[i] == 1?1:0;
    }
    return result;
}
