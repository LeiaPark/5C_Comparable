/**
  exercise Comparable types
 */

public class UserOfComparability {

    public static void main(String[] commandLine) {
        System.out.println( System.lineSeparator()
                          + "Point comparisons");

        // Point vs. itself
        Point p0 = new Point( 3., 4.);
        reportRelationship( "Point vs. itself", p0, p0, "0");

         // Point vs. its reflection about y = x
         reportRelationship( "Point vs. its reflection about y = x"
                           , p0, new Point( 4., 3.), "0");

         // Point vs. point closer to origin
         reportRelationship( "Point vs. point closer to origin", p0
                           , new Point( 1., 2.), "positive int");

         // Point vs. distant point
         reportRelationship( "Point vs. distant point", p0
                           , new Point( 100., 2.), "negative int");
         System.out.println( "---- end of Point comparisons ----");
        
         System.out.println( System.lineSeparator()
                           + "Date comparisons");
         
         // Date vs. itself
         Date d0 = new Date( 2018, 4, 4);
         reportRelationship( "Date vs. itself", d0, d0, "0");
         
         Date d1 = new Date( 2020, 4, 4);
         reportRelationship( "Date vs. itself", d0, d1, "-1");
         
         Date d2 = new Date( 2018, 4, 1);
         reportRelationship( "Date vs. itself", d0, d2, "1");
         
//         System.out.println( System.lineSeparator()
//                 + "Dog comparisons");
//         
//         IncomparableDog id0 = new IncomparableDog();
//         reportRelationship( "Dog vs. itself", id0, id0, "nothing");

         /**
          * Error Message:
          * UserOfComparability.java:45: error: incompatible types: IncomparableDog cannot be converted to Comparable
          * reportRelationship( "Dog vs. itself", id0, id0, "nothing");
          */
         
         System.out.println( System.lineSeparator()
               + "Point & Date comparisons");
       
       reportRelationship( "Point vs. Date", p0, d0, "nothing");

    }


    /**
      Print the results of comparing two entities.
     */
    private static void reportRelationship 
      ( String description
      , Comparable a
      , Comparable b
      , String expect
      ) {
        System.out.println( description);

        // check 
        System.out.println(
            a + " compareTo " + b + ": "
          + a.compareTo( b)
            /* eventually expecting a compiler warning: 
              warning: [unchecked] unchecked call to compareTo(T) as a member of the raw type Comparable
              where T is a type-variable:
                T extends Object declared in interface Comparable
             */
          
          + " ...expecting " + expect
          + System.lineSeparator());
     }
}