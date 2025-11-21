//1. Write a program to calculate the product of digits of a number.

class Logic 
{
    void productOfDigits(int iNo) 
    {
       
        if (iNo < 0) 
        {
            iNo = -iNo;
        }

        if (iNo == 0) 
        {
            System.out.println("Product of digits is: 0");
            return;
        }
        
        int iProduct = 1;
        int iDigit = 0;

        while (iNo != 0) 
        {
            iDigit = iNo % 10;
           
            iProduct = iProduct * iDigit; 
            iNo = iNo / 10;
        }
        System.out.println("Product of digits is: " + iProduct);
    }
}

class assignment211
{
    public static void main(String args[]) 
    {
        Logic obj = new Logic();
        obj.productOfDigits(234); // Output: Product of digits is: 24
}
}