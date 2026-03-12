class Methods {
    public int getNumberOfWords(String s){
        int numberOfWords = 1;

        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) > 64 && s.charAt(i) < 91){
                numberOfWords++;
            }
        }

        return numberOfWords;


    }
}
