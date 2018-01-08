public class Homework2d {
    public static void main (String args[])
    {
        String A = "We make work HUMAN.\n";
        String B = "Unlick full potential. Celebrate postitive moments.\n";
        String C = "Every day.\n";

        String A1 = A.toLowerCase() ;
        String B1 = B.toLowerCase() ;
        String C1 = C.toLowerCase() ;

        System.out.print(A1+B1+C1.toUpperCase().charAt(0)+C1.substring(1) );
    }
}
