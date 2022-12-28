//import java.util.Random;
public class ex1_2_19{
   public static void main(String[] args) {
    
 // store the command-line arguments in their respective variables, min and max
    int min = Integer.parseInt(args[0]);
    int max = Integer.parseInt(args[1]);
    double random_value = Math.random();
    System.out.println("The random value is " + random_value);
    System.out.println(random_value);
    System.out.println("The calculation of (Math.random() * ((max - min) + 1)) is "+ (random_value * ((max - min) + 1)));
    System.out.println("The calculation for ((Math.random() * ((max - min) + 1)) + min) is " + ((random_value * ((max - min) + 1)) + min) );
    System.out.println("The random number between " + min + " and " + max + " inclusive is " + ((int)(random_value * ((max - min) + 1)) + min));
    
}
}