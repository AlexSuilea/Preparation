package strings;

public class Palindrome {

    public static boolean isPalindrome(Object obj) {

        if(obj instanceof Integer) {
            int num = (Integer) obj;
            if(num < 0) return false;

            int reversed = 0, original = num;
            while(num != 0) {
                reversed = reversed * 10 + num % 10;
                num /= 10;
            }

            return reversed == original;

        } else if(obj instanceof String) {
            String str = obj.toString().toLowerCase();
            int left = 0, right = str.length() - 1;

            while(left < right) {
                if(str.charAt(left) != str.charAt(right)) {
                    return false;
                }
                left++;
                right--;
            }
            return true;
        }
        return false;
    }
}
