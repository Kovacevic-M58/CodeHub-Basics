class Methods {
    /**
     * Check whether the given word is a palindrome.
     * Comparasion is done using uppercase letters so
     * the result is case insensitive
     * @param word the word that will be checked
     * @return returning a string which indicates if the word is a palindrome
     */
    public String isPalindrome(String word){
        String upper = word.toUpperCase();

        for (int i = 0; i < upper.length()/2; i++) {
            if(upper.charAt(i) != upper.charAt(upper.length() - i - 1)){
                    return "No, word isn't palindrome.";
            }
        }

        return "Yes, word is palindrome!";
    }
}
