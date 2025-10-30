class Jack
 {
    void countDigits(int num)
     {
        int count = 0;
        while (num != 0) 
        {
            count++;
            num /= 10;
        }
        System.out.println("Number of digits = " + count);
    }
}

class Assignment16
{
    public static void main(String args[]) 
    {
        Logic obj = new Logic();
        obj.countDigits(7865);
    }
}