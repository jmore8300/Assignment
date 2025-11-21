//. Accept N numbers from user and accept one another number as NO, return frequency of NO form it.

import java.util.Scanner;

class Logic 
{

    public int frequency(int Arr[], int iLength, int iNO) 
    {
        int iCount = 0;
        
       
        for (int element : Arr) 
        {
            
            if (element == iNO) 
            {
                iCount++; 
            }
        }
        
        return iCount; 
    }
}

class  assignment225 {
    public static void main(String args[]) {
        Scanner sobj = new Scanner(System.in);
        Logic lobj = new Logic();
        
        // 1. Accept N (number of elements)
        System.out.println("Enter number of elements:");
        int iSize = sobj.nextInt();
        
        // 2. Accept NO (the number to search for)
        System.out.println("Enter the number (NO) to find frequency for:");
        int iValue = sobj.nextInt();
        
        // Array allocation
        int[] arr = new int[iSize]; 
        
        // 3. Accept N elements
        System.out.println("Enter " + iSize + " elements:");
        for (int i = 0; i < iSize; i++) 
        {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = sobj.nextInt();
        }
        
        // Call the logic function
        int iRet = lobj.frequency(arr, iSize, iValue);
        
        System.out.println("Output (Frequency of " + iValue + "): " + iRet);
        
        sobj.close();
}
}