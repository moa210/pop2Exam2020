//candidate number T110805
//student number 12915798

package pop2Exam2020;

public class InsertSpaces {
    
    
    public static void main(String[] args) {
        
        String w = "World";
        String w2 = insertSpaces(w);
        System.out.println(w2);
        System.out.println(w2.length());
    }
    
    
    private static String insertSpaces(String w) {
        char[] chars = w.toCharArray();
        String newStr = "";
        for (int i = 0; i < chars.length - 1; i++) {
            newStr += chars[i];
            newStr += ' ';
        }
        newStr += chars[chars.length - 1];
        return newStr;
        
    }
    
    
}
