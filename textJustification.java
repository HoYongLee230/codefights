String[] textJustification(String[] words, int l) {
    List <String> wordList = new ArrayList<>();
    List <String> textList = new ArrayList<>();
    int wLength = 0, wCount = 0;
    String lWord = "";
    for(int i = 0; i < words.length; i++) {
        if(words[i].length() + wLength <= l) {
            wCount++;
            wordList.add(words[i]);
            wLength += words[i].length() + 1;
        }
        else {
            int spaces = wCount > 1?(l - wLength + wCount)/(wCount - 1):l - wLength - 1;
            int remainderSpaces =  wCount > 1?(l - wLength + wCount)%(wCount - 1):0;
            for(int j = 0; j < wordList.size() - 1; j++) {
                lWord += wordList.get(j);
                for(int k = 0; k < spaces; k++) {
                    lWord += " ";
                    if(remainderSpaces > 0) {
                        lWord += " ";
                        remainderSpaces--;
                    }
                }
            }
            lWord += wordList.get(wordList.size() - 1);
            int spacesLast = l - lWord.length();
            if(spacesLast > 0) {
                for(int m = 0; m < spacesLast; m++) 
                    lWord += " ";
            }
            textList.add(lWord);
            lWord = "";
            wordList = new ArrayList<>();
            wordList.add(words[i]);
            wLength = words[i].length() + 1;
            wCount = 1;
        }
    }
    if (wordList.size() > 0){
        for(int j = 0; j < wordList.size() - 1; j++) 
            lWord += wordList.get(j) + " ";
        lWord += wordList.get(wordList.size() - 1);
        int spacesLast = l - lWord.length();
        if(spacesLast > 0) {
            for(int m = 0; m < spacesLast; m++) 
                lWord += " ";
        }
        textList.add(lWord);
    }
    return textList.toArray(new String[0]);
}
