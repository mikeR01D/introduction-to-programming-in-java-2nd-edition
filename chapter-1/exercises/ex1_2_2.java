public class ex1_2_2
{
    public static void main(String[] args)
    {
    // read in the command line argument
    double radian = Double.parseDouble(args[0]);
    
    // compute the sin and cos using the Math library and store them in their respective variables
    double sine = Math.sin(radian);
    double cosine = Math.cos(radian);
    // sum the square of both variables and output the result
    double sum_of_squares = Math.pow(sine, 2) + Math.pow(cosine, 2);
    System.out.println(sum_of_squares);
    }
}

// The reason why the final result is not really one is because the calculations are made using 
// type Double, and not type Int.
