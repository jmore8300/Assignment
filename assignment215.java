//5. Write a program to print all numbers from 1 to N that are divisible by both 2 and 3.

class Logic 
{
    void printDivisibleBy2and3(int iN) 
    {
        if (iN < 1) 
        {
            System.out.println("Range must start from 1 or greater.");
            return;
        }
        
        System.out.print("Numbers from 1 to " + iN + " divisible by both 2 and 3 are: ");
        
        
        for (int i = 1; i <= iN; i++) 
        {
           
            if ((i % 2 == 0) && (i % 3 == 0)) 
            {
               
                System.out.print(i + " ");
            }
        }
        System.out.println(); 
    }
}

class assignment215
{
    public static void main(String args[]) 
    {
        Logic obj = new Logic();
        obj.printDivisibleBy2and3(30); // Output: Numbers from 1 to 30 divisible by both 2 and 3 are: 6 12 18 24 30
}
}