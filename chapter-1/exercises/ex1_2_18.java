public class ex1_2_18 {
    public static void main(String[] args) {
        // store the first two command-line arguments as integers
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);

        // the formula for euclidean distance is:
        double length_between_points = Math.sqrt(y * y + x * x);
        System.out.println(length_between_points);
        System.out.println(Math.random(1.0, 5.0));

    }
}
