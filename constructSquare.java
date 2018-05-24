int constructSquare(String s) {
    int n = s.length(), a, index = 0;
    int [] diffCharArray = new int [10], diffNumArray;
    char [] sChars = s.toCharArray();
    Arrays.sort(sChars);
    String sSorted = new String(sChars);
    diffCharArray[0]++;
    for(int i = 1; i < n; i++) {
        if(sSorted.charAt(i) != sSorted.charAt(i - 1)) 
            index++;
        diffCharArray[index]++;
    }
    Arrays.sort(diffCharArray);
    for(int j = (int)Math.sqrt(Math.pow(10, n))%10==0?(int)Math.sqrt(Math.pow(10, n))-1:(int)Math.sqrt(Math.pow(10, n)); j>=((int)Math.sqrt(Math.pow(10, n - 1))%10==0?(int)Math.sqrt(Math.pow(10, n - 1)):(int)Math.sqrt(Math.pow(10, n - 1))+1);j--) {
        a = j * j;
        diffNumArray = new int [10];
        while(a > 0) {
            diffNumArray[a % 10]++;
            a /= 10;
        }
        Arrays.sort(diffNumArray);
        if(Arrays.equals(diffCharArray, diffNumArray))
            return j * j;
    }
    return -1;
}
