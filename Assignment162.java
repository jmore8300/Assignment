class Jack
 {
    void checkEvenOdd(int num) 
    {
        if (num % 2 == 0)
            System.out.println(num + " is Even");
        else
            System.out.println(num + " is Odd");
    }
}

class Assignment16
{
    public static void main(String args[]) 
    {
        Jack obj = new Jack();
        obj.checkEvenOdd(7);
    }
}