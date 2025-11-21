//2. Accept N numbers from user and return difference between frequency of even and odd numbers

import java.util.Scanner;

class Logic 
{
  
    public int frequency(int Arr[]) 
    {
        int iEvenCount = 0;
        int iOddCount = 0;
        
       
        for (int element : Arr) 
        {
            if (element % 2 == 0) 
            {
                iEvenCount++;
            } else 
            {
                iOddCount++; 
            }
        }
        
        
        return iEvenCount - iOddCount;
    }
}

class assignment222
{
    public static void main(String A[]) 
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
        
        System.out.println("Result (Even Frequency - Odd Frequency) is: " + iRet);
        
        sobj.close();
    }
}
