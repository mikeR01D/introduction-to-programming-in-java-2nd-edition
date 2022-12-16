public class Quadratic
{
    public static void main(String[] args)
    {
        /*This program calculates the solutions of a quadratic equation. */

        // you know what happens here.
        double a = Double.parseDouble(args[0]);

        // declare a double variable 'b' and initialize it with a Double literal equivalent of the first
        // string argument in the command line
        double b = Double.parseDouble(args[1]);

        // declare a double variable 'c' and initialize it with the Double literal equivant of the second 
        // string argument in the command line
        double c = Double.parseDouble(args[2]);

        // a variable 'discriminant' of type double is initialized with what you see
        double discriminant = b * b - a * c;


        double d = Math.sqrt(discriminant);
        System.out.println("The first solution is " + (-b + d) / 2.0);
        System.out.println("The second solution is " + (-b - d) / 2.0);

        // michael, you heard the boss! put in the hours to understand what you are doing

    }
}