/**
  Represent a date
 */
public class Date implements Comparable{
    private int y,m,d;
    

    // -------- previously-written code --------
    // constructor
    public Date( int y, int m, int d) {
        this.y = y;
        this.m = m;
        this.d = d;
    }
    
    /**
      @return a string representation of this instance
     */
    public String toString() {
        // ISO 8601 rules!
        return String.format("%4d-%02d-%02d",y, m, d);
    }
    
    public int compareTo( Object otherObj){
        if (y > ((Date)otherObj).gety()) return 1;
        else if (y < ((Date)otherObj).gety()) return -1;
        else if (m > ((Date)otherObj).getm()) return 1;
        else if (m < ((Date)otherObj).getm()) return -1;
        else if (d > ((Date)otherObj).getd()) return 1;
        else if (d < ((Date)otherObj).getd()) return -1;
        else return 0;
    }
    
    public int gety() {
    	return y;
    }
    
    public int getm() {
    	return m;
    }
    
    public int getd() {
    	return d;
    }

}