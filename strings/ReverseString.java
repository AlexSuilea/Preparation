package strings;

public class ReverseString {

    public static String reverseStringWithStringBuilder(String str){
        return new StringBuilder(str).reverse().toString();
    }

    public static String reverseStringManually(String str){
        StringBuilder newString = new StringBuilder();

        for(int i=str.length()-1; i>=0; i--){
            newString.append(str.charAt(i));
        }
        return newString.toString();
    }
}
