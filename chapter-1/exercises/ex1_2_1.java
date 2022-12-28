public class ex1_2_1
{
    public static void main(String[] args)
    {
        int a = 0;
        int b = 0;
        int t = a;
        b = t;
        a = b;
        System.out.println(a);
    }
}

// An error occurs. Depending on where you are starting from, it could be from undeclared or 
// uninitialized variables. But that could easily be fixed, of which i did.