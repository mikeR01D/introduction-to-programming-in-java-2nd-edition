public class RandomInt
{
    // 
    int n = Integer.parseInt(args[0]);
    double r = Math.random();
    int value = (int) (r * n);
    System.out.println(value);
}