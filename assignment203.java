// 3. Check whether a number is a Perfect Number

class Logic
{
    void checkPerfect(int num)
    {
        int sum = 0;

        // Find proper divisors
        for(int i = 1; i <= num / 2; i++)
        {
            if(num % i == 0)
            {
                sum += i;
            }
        }

        // Check perfect number
        if(sum == num)
        {
            System.out.println(num + " is a Perfect Number");
        }
        else
        {
            System.out.println(num + " is NOT a Perfect Number");
        }
    }
}

class assignment203
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.checkPerfect(6);   // You can change number here
        }
}