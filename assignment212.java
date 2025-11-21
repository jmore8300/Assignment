//2. Write a program to count how many even and odd numbers are present between 1 and N.

class Logic 
{
    void countEvenOddInRange(int iN) 
    {
        if (iN < 1) 
        {
            System.out.println("Range should be 1 or greater.");
            return;
        }
        
        int iEvenCount = 0;
        int iOddCount = 0;

        // Iterate from 1 up to N (inclusive)
        for (int i = 1; i <= iN; i++) 
        {
            if (i % 2 == 0) 
            {
                iEvenCount++;
            } 
            else 
            {
                iOddCount++;
            }
        }
        
        System.out.println("In the range 1 to " + iN + ":");
        System.out.println("Even numbers count: " + iEvenCount);
        System.out.println("Odd numbers count: " + iOddCount);
        
      
    }
}

class assignment212
{
    public static void main(String args[]) 
    {
        Logic obj = new Logic();
        obj.countEvenOddInRange(50); // Output: Even: 25, Odd: 25
}
}