//4. Write a program to count total number of factors of a given number.

class Logic 
{
    int countFactors(int iNum) 
    {
        if (iNum == 0) 
        {
            return 0; // Or handle as an error/infinite
        }
        // Handle negative input
        if (iNum < 0) 
        {
            iNum = -iNum;
        }
        
        int iCount = 0;

        // Check up to iNum/2 (i.e., less than or equal to iNum/2)
        for (int i = 1; i <= iNum / 2; i++) 
        {
            if (iNum % i == 0) 
            {
                iCount++;
            }
        }
        
        // Add 1 for the number itself (iNum)
        iCount++;
        
        System.out.println("Total number of factors for " + iNum + " is: " + iCount);
        return iCount;
    }
}

class assignment214
{
    public static void main(String args[]) {
        Logic obj = new Logic();
        obj.countFactors(28); // Output: Total number of factors for 28 is: 6 (1, 2, 4, 7, 14, 28)
}
}