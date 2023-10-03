package strings;

public class Panagram {

    public static boolean isPanagram(String str){
        if(str.length() < 26)
            return false;

        for(char ch = 'a'; ch <= 'z'; ch++){
            if (str.indexOf(ch) < 0){
                return false;
            }
        }
        return true;
    }
}
