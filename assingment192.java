// Check whether a given year is a leap year



class Logic
{
    void checkLeapYear(int year)
    {
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
        {
            System.out.println(year + " is a leap year");
        }
        else
        {
            System.out.println(year + " is NOT a leap year");
        }
    }
}

class assingment192
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.checkLeapYear(2024);}
}