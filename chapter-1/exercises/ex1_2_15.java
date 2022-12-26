public class ex1_2_15 {
    public static void main(String[] args) {
        // declare int variables and initialize it with command-line arguments that have been converted to their integer equivalents
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
        // print out true if the an argument is less than the sum of the other two arguments, or if false otherwise, i.e. 
        // it is greater than or equal to.
        System.out.println((a < (b + c) && (b < (a + c)) && (c < (a + b))));

    }
}
