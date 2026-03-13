class CamelCase {
    public int getNumberOfWords(String s){
        int numberOfWords = 0;
        if(s == null || s.isEmpty()){
            return numberOfWords;
        }

        for (int index = 0; index < s.length(); index++) {
            if(index == 0){
                numberOfWords++;
            } else if (s.charAt(index) >= 'A' && s.charAt(index) <= 'Z') {
                numberOfWords++;
            }
        }

        return numberOfWords;


    }
}
