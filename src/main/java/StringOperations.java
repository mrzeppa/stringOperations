import java.util.ArrayList;
import java.util.List;

public class StringOperations {

    public String reverse(String a) {
        List<String> tempArray = new ArrayList<String> (a.length());
        for (int i=0; i< a.length(); i++) {
            tempArray.add(a.substring(i, i+1));
        }
        StringBuilder reversedString = new StringBuilder(a.length());
        for (int i = tempArray.size()-1; i>=0; i--) {
            reversedString.append(tempArray.get(i));
        }
        return reversedString.toString();
    }

    public String concat(String a, String b) {
        String retVal = null;
        if (a != null && a.length() > 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(a);
            if (b != null) {
                sb.append(b);
            }
            retVal = sb.toString();
        }
        return retVal;
    }

    public boolean isPalindrome(String text) {
        int length = text.length();
        if(length == 0)
            throw new IllegalArgumentException();
        int forward = 0;
        int backward = length - 1;
        while (backward > forward) {
            char forwardChar = text.charAt(forward++);
            char backwardChar = text.charAt(backward--);
            if (forwardChar != backwardChar)
                return false;
        }
        return true;
    }

}