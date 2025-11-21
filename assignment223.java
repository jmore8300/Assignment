//3. Accept N numbers from user and check whether that number contains 11 in it.

import java.util.Scanner;

class Logic 
{
  
    public boolean check(int Arr[]) 
    {
        
        for (int element : Arr) 
        {
          
            if (element == 11) 
            {
                return true; 
            }
        }
        
        return false; 
    }
}

class assignment223 
{
    public static void main(String args[]) 
    {
        Scanner sobj = new Scanner(System.in);
        Logic lobj = new Logic();
        
        System.out.println("Enter number of elements:");
        int iSize = sobj.nextInt();
        
        int[] arr = new int[iSize]; 
        
        System.out.println("Enter " + iSize + " elements:");
        for (int i = 0; i < iSize; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = sobj.nextInt();
        }
        
        boolean bRet = lobj.check(arr);
        
       
        if (bRet == true) 
        {
            System.out.println("Output: 11 is present");
        } 
        else 
        {
            System.out.println("Output: 11 is absent");
        }
        
        sobj.close();
}
}