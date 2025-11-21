// 4. Print each digit of a number separately

class Logic
{
    void printDigits(int num)
    {
        int temp = num;
        int rev = 0;

        // Reverse number first
        while (temp != 0)
        {
            rev = rev * 10 + temp % 10;
            temp /= 10;
        }

        // Print digits in correct order
        while (rev != 0)
        {
            System.out.println(rev % 10);
            rev /= 10;
        }
    }
}

class assignment194
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.printDigits(9876);}
}