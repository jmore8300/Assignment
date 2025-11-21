//5. Calculate power of a number using loops

class Logic
{
    void calculatePower(int base, int exp)
    {
        int result = 1;

        for (int i = 1; i <= exp; i++)
        {
            result *= base;
        }

        System.out.println(base + " raised to " + exp + " is " + result);
    }
}

class assignment195
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.calculatePower(2,5);}
}