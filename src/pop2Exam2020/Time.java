//candidate number T110805
//student number 12915798

package pop2Exam2020;

public class Time {
    
    private int hour;
    private int minute;
    private int second;
    
    
    Time(int h, int m, int s) {
        hour = h;
        minute = m;
        second = s;
        normalise();
        
    }
    
    
    // helper method brings the values of seconds, minutes below 60 and ensures hour does not exceed value of 24
    // uses helper methods for minutes and hour normalisation
    void normalise() {
        this.hour += this.minute / 60;
        if (this.hour > 23) {
            normaliseH();
        }
        
        this.minute += this.second / 60;
        
        if (this.minute > 59) {
            normaliseM();
        }
        
        this.second %= 60;
        
    }
    
    
    // helper method to ensure hour does not exceed value of 24
    private void normaliseH() {
        this.hour %= 24;
    }
    
    
    // helper method brings the value of minutes below 60
    private void normaliseM() {
        this.minute %= 60;
    }
    
    
    Time(Time t, int secs) {
        hour = t.hour;
        minute = t.minute;
        second = (t.second + secs);
        normalise();
    }
    
    
    public static void main(String[] args) {
        
        Time a = new Time(23, 59, 4);
        System.out.println(a);
        Time b = new Time(a, 57);
        System.out.println(b);
        Time c = new Time(b, 3660);
        System.out.println(c);
    }
    
    
    public String toString() {
        String hourStr = String.valueOf(hour);
        String minStr = String.valueOf(minute);
        String secStr = String.valueOf(second);
        
        if (hourStr.length() < 2) hourStr = "0" + hour;
        if (minStr.length() < 2) minStr = "0" + minute;
        if (secStr.length() < 2) secStr = "0" + second;
        
        return ("" + hourStr + ":" + minStr + ":" + secStr);
    }
    
}