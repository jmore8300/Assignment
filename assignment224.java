//4. Accept N numbers from user and return frequency of number 11 form it.

import java.util.*;

class Logic 
{
 
    public int frequency(int Arr[]) 
    {
        int iCount = 0;
        
        
        for (int element : Arr) 
        {
            
            if (element == 11) 
            {
                iCount++; 
            }
        }
        
        return iCount;
    }
}

class assignment224 
{
    public static void main(String args[]) 
    {
        Scanner sobj = new Scanner(System.in);
        Logic lobj = new Logic();
        
        System.out.println("Enter number of elements:");
        int iSize = sobj.nextInt();
        
        int[] arr = new int[iSize]; 
        
        System.out.println("Enter " + iSize + " elements:");
        for (int i = 0; i < iSize; i++) 
        {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = sobj.nextInt();
        }
        
        int iRet = lobj.frequency(arr);
        
        System.out.println("Output (Frequency of 11): " + iRet);
        
        sobj.close();
}
}