//1. Accept N numbers from user and return frequency of even numbers.

import java.util.*;

class Logic 
{
   
    public int countEven(int Arr[]) 
    {
        int iEvenCnt = 0;
        
        
        for (int element : Arr) 
        {
          
            if (element % 2 == 0) 
            {
                iEvenCnt++;
            }
        }
        return iEvenCnt;
    }
}

class assignment221
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
        
        int iRet = lobj.countEven(arr);
        
        System.out.println("Result (Frequency of Even Numbers) is: " + iRet);
        
        sobj.close();
    }
}
