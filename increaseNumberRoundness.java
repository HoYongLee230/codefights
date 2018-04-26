boolean increaseNumberRoundness(int n) {
    String a = Integer.toString(n);
    boolean foundZero = false;
    for(int i = 0; i < a.length(); i++) {
        if(a.charAt(i) != '0' && foundZero)
            return true;
        if(a.charAt(i) == '0')
            foundZero = true;
    }
    return false;
}
