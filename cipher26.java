String cipher26(String message) {
    String res =  String.valueOf(message.charAt(0));
    int sum = message.charAt(0) - 97;
    for(int i = 1; i < message.length(); i++) {
        sum %= 26;
        int a = (message.charAt(i) - 97 - sum + 26) % 26;
        res += (char)(a + 97);
        sum += a;
    }
    return res;
}
