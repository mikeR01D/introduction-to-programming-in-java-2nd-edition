public class ex1_2_21 {
    public static void main(String[] args) {
        // initialize a variable t, of type double with the double equivalent of the string command-line argument
        double t = Double.parseDouble(args[0]);
        // print out "sin(2t) + sin(3t)
        System.out.println(Math.sin(2 * t) + Math.sin(3 * t));
    }
}
