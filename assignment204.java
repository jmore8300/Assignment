// 4. Find the Largest Digit in a Given Number

class Logic
{
    void findLargestDigit(int num)
    {
        int max = 0;

        while(num != 0)
        {
            int digit = num % 10;

            if(digit > max)
            {
                max = digit;
            }

            num = num / 10;
        }

        System.out.println("Largest digit is: " + max);
    }
}

class assignment204
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.findLargestDigit(83429);   // You can change number here
}
}