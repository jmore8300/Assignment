import java.util.Scanner;

class Buff 
{
    int minDigit(int num) 
    {
        int min = 9;
        while (num != 0) 
        {
            int digit = num % 10;
            if (digit < min)
                min = digit;
            num = num / 10;
        }
        return min;
    }
}

class Assignmenr17 
{
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int no = sc.nextInt();

        Buff obj = new Buff();
        int result = obj.minDigit(no);
        System.out.println("Minimum digit: " + result);
    }
}