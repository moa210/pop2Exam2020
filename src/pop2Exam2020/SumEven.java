//candidate number T110805
//student number 12915798

package pop2Exam2020;

public class SumEven {
    
    public static void main(String[] args) {
        
        System.out.println(sumEven(-3, 8));
        System.out.println(sumEven(8, -3));
    }
    
    
    private static int sumEven(int b, int c) {
        int startNum = Math.min(b, c);
        int endNum = Math.max(b, c);
        int sum = 0;
        for (int i = startNum; i <= endNum; i++)
            if (i % 2 == 0) sum += i;
        return sum;
    }
    
    
}
