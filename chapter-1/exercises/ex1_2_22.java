public class ex1_2_22 {
    public static void main(String[] args) {
        double x0 = Double.parseDouble(args[0]);
        double v0 = Double.parseDouble(args[1]);
        double t = Double.parseDouble(args[2]);
        double g = 9.80665;
        double displacement = x0 + (v0 * t) - (g * t * t) / 2;
        System.out.println("The displacement is " + displacement);
                
    }
}
