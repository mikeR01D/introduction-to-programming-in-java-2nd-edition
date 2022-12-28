public class ex1_2_20{
    public static void main(String[] args) {
        // min and max values of the range of random numbers are stored in int variables min and max
        int min = 1;
        int max = 6;
        // store the two random values in their respective variables, r1 and r2
        int r1 = ((int)(Math.random() * ((max - min) + 1)) + min);
        int r2 = ((int)(Math.random() * ((max - min) + 1)) + min);
        System.out.println("The sum of the two random values " + r1 + " and " + r2 + " is " + (r1 + r2));

    }
}