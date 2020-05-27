//candidate number T110805
//student number 12915798

package pop2Exam2020;

import java.util.HashMap;

public class SecondLowest {
    
    public static void main(String[] args) {
    
        int b[] = { 4, 3, 1, 1, 2 };
        System.out.println( secondLowest( b ));
        int c[] = { 4, 3, 1, 1, 2, 2 };
        System.out.println( secondLowest( c ));
        int d[] = { 4, 3, 1, 2 };
        System.out.println( secondLowest( d ));
    }
    
    
    private static int secondLowest(int[] b) {
        int scndLowest = 1;
        HashMap<Integer, Integer> intMap = new HashMap<Integer, Integer>();
        int[] c = b.clone();
        int keyVal = 1;
        for (int value : b) {
            for (int j = 0; j < b.length; j++) {
                if (intMap.containsValue(value)) {
                    keyVal++;
                    intMap.replace(keyVal, value);
                } else intMap.put(1, value);
            }
        }
        
        return scndLowest;
    }
    
    
}
