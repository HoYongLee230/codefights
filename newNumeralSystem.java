String[] newNumeralSystem(char number) {
    int n = (int)((number) - 63) /2;
    char x = 'A';
    String [] result = new String[n];
    for(int i = 0; i < n; i++) 
        result[i] = x++ + " + " + number--;
    return result;
}
