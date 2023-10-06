package twopointers;

public class ValidPalindrome {
    public static boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;

        while(i<j){
            char start = s.charAt(i);
            char end = s.charAt(j);

            if(!isAlphaNumeric(start)) i++;
            else if(!isAlphaNumeric(end)) j--;
            else {
                if(Character.toLowerCase(start) != Character.toLowerCase(end)) {
                    return false;
                } else {
                    i++;
                    j--;
                }
            }
        }
        return true;
    }

    private static boolean isAlphaNumeric(char ch){
        return (ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z') || (ch >= '0' && ch <= '9');
    }
}
