class Jack 
{
    void findFactorial(int num) 
    {
        int fact = 1;
        for (int i = 1; i <= num; i++) 
        {
            fact *= i;
        }
        System.out.println("Factorial of " + num + " = " + fact);
    }
}

class Assignment16
{
    public static void main(String args[]) 
    {
        Jack obj = new Jack();
        obj.findFactorial(5);
    }
}