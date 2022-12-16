public class LeapYear
{
    public static void main(String[] args)
    {
        // variable 'year' of type int is initialized with a string to int converter that converts
        // the string argument in the command line to one of type int.
        int year = Integer.parseInt(args[0]);

        // a boolean type variable is declared without being initialized at the same time
        boolean isLeapYear;

        // the boolean type variable, 'isLeapYear' is initialized with a boolean expression that basically 
        // checks if the command line argument is perfectly divisible by 4
        isLeapYear = (year % 4 == 0);

        // the same boolean type variable stores the boolean expression that checks if 'isLeapYear' now is
        // also not divisible by 100 using an 'and' operation.
        isLeapYear = isLeapYear && (year % 100 != 0);

        // alongside the previous boolean condition of 'isLeapYear', we also check if the command line argument
        // stored in year, which is of type int is also divisible by 400.
        
        isLeapYear = isLeapYear || (year % 400 == 0);

        System.out.println("The year " + year + " is a leap year: " + isLeapYear);
    }
}