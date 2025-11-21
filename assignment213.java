//3. Write a program to display all factors of a given number.

class Logic 
{
    void displayFactors(int iNo) 
    {
        if (iNo == 0) 
        {
            System.out.println("Factors of 0 are infinite.");
            return;
        }
       
        if (iNo < 0) 
        {
            iNo = -iNo;
        }
        
        System.out.print("Factors of " + iNo + " are: ");
        
      
        for (int i = 1; i <= iNo / 2; i++) 
        {
            if (iNo % i == 0) 
            {
                System.out.print(i + " ");
            }
        }
        
      
        System.out.println(iNo); 
    }
}
class assignment213
{
    public static void main(String args[]) 
    {
        Logic obj = new Logic();
        obj.displayFactors(12); // Output: Factors of 12 are: 1 2 3 4 6 12
}
}
