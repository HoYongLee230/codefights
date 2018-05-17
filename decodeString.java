String decodeString(String s) {
    String r = "";
    int k = 0, num = 0;
	for(int i = 0; i < s.length(); i++) {
        if(s.charAt(i) >= 48 && s.charAt(i) <= 57) {
            num = 0;
            while(s.charAt(i) >= 48 && s.charAt(i) <= 57) {
                num *= 10;
                num += Character.getNumericValue(s.charAt(i));
                i++;
            }
            String x = "";
            Stack<Character> st = new Stack<>();
            for(k = i; k < s.length(); k++) {
                if(s.charAt(k) == '[')
                    st.push(s.charAt(k));
                else if (s.charAt(k) == ']')
                    st.pop();
                if(st.empty())
                    break;
            }
            for(int j = 0; j < num; j++)
                x += s.substring(i + 1, k);
            return r + decodeString(x) + decodeString(s.substring(k + 1));
        }       
        else
            r += s.charAt(i);
    }
    return r;
}
