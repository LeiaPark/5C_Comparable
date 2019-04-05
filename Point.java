/**
  Represent a point, using Cartesian coordinates
 */
public class Point implements Comparable{
    private double xcor;
    private double ycor;
    private double distance;
    
    /**
      @return  a negative integer, zero, or a positive integer
      depending on whether this Point is closer, 
      equidistant, or farther than the Point referred to
      by the parameter.
     */
    public int compareTo( Object otherObj){
        /* Use the Pythagorean theorem.
           Double.compare helped me.
           If the math is a problem, use a simpler
           relationship, like "higher is bigger"
           and change the tests accordingly */
    	// double distance = Math.sqrt(Math.pow(xcor,2) + Math.pow(ycor, 2));
    	
    	
    	
    	if (distance == ((Point)otherObj).getdistance())
    		return 0; // temp: all Points are One
    	else if (distance > ((Point)otherObj).getdistance())
    		return 1;
    	else return -1;
    }

    // -------- previously-written code ----------
    // constructor
    public Point( double xcor, double ycor) {
        this.xcor = xcor;
        this.ycor = ycor;
        distance = Math.sqrt(Math.pow(xcor,2) + Math.pow(ycor, 2));
    }
    
    public double getdistance() {
    	return distance;
    }
    
    /**
      @return a string representation of this instance
     */
    public String toString() {
        return "(" + xcor + "," + ycor + ")"; 
    }

}