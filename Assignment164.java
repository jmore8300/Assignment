class Jack 
{
    void reverseNumber(int num)
     {
        int rev = 0;
        while (num != 0) 
        {
            int digit = num % 10;
            rev = rev * 10 + digit;
            num /= 10;
        }
        System.out.println("Reversed number = " + rev);
    }
}

class Assignment16 
{
    public static void main(String args[])
    {
        Jack obj = new Jack();
        obj.reverseNumber(1234);
    }
}