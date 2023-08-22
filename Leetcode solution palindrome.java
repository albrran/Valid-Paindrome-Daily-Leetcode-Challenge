class Solution {
    public boolean isPalindrome(String s) {
        if(s.equals(" ")) {
            return true;
        }
        String pali = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        char tempArray[] = pali.toCharArray();
        
        for(int i = 0; i < tempArray.length; i++) {
            if(tempArray[i] != tempArray[(tempArray.length - 1) - i]) {
                return false;
            }
        }
        return true;
    }
}