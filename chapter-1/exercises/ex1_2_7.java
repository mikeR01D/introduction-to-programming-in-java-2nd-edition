import javax.sound.sampled.SourceDataLine;

public class ex1_2_7 {
    public static void main(String[] args) {
        System.out.println(2 + "bc");
        // the numericals are computed first then converted to string
        System.out.println(2 + 3 + "bc");
        // the expression in parenthesis is given precedence
        System.out.println((2 + 3) + "bc");
        // the expression in the parenthesis is computed first then implicitly converted to string
        System.out.println("bc" + (2 + 3));
        // it converts everything to string
        System.out.println("bc" + 2 + 3);
    }
}
