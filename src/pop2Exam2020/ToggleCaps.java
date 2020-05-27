//candidate number T110805
//student number 12915798

package pop2Exam2020;

public class ToggleCaps {
    
    public static void main(String[] args) {
        String t = toggleCaps("this is A Test.");
        System.out.println(t);
    }
    
    
    private static String toggleCaps(String s) {
        
        char[] chars = s.toCharArray();
        StringBuilder newStr = new StringBuilder();
        
        if (isLetter(chars[0])) chars[0] = swapCase(chars[0]);
        newStr.append(chars[0]);
        
        for (int i = 1; i < chars.length; i++) {
            if (isLetter(chars[i])) {
                if ((chars[i - 1] == ' ') || (!isLetter(chars[i - 1]))) chars[i] = swapCase(chars[i]);
            }
            
            newStr.append(chars[i]);
        }
        
        return String.valueOf(newStr);
    }
    
    
    //    helper method takes char as parameter
    //    it checks if a letter value with a use of helper methods
    //    it returns a boolean to confirm if the value lower or upper case letter a > z A > Z
    private static boolean isLetter(char aChar) {
        return isLowerCase(aChar) || isUpperCase(aChar);
    }
    
    
    //    helper method takes char as parameter
    //    it checks if lower and upper case char and converts accordingly lower to upper and upper to lower
    //    it returns a char
    private static char swapCase(char aChar) {
        if (isLowerCase(aChar)) return Character.toUpperCase(aChar);
        else return Character.toLowerCase(aChar);
    }
    
    
    //    helper method takes char as parameter
    //    it returns a boolean to confirm if the value lower case letter in range a > z
    private static boolean isLowerCase(char aChar) {
        return (aChar >= 'a' && aChar <= 'z');
    }
    
    //    helper method takes char as parameter
    //    it returns a boolean to confirm if the value upper case letter in range A > Z
    private static boolean isUpperCase(char aChar) {
        return (aChar >= 'A' && aChar <= 'Z');
    }
    
    
}

