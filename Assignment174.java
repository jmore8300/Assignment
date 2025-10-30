import java.util.Scanner;

class Jam 
{
    int maxDigit(int num) 
    {
        int max = 0;
        while (num != 0) 
        {
            int digit = num % 10;
            if (digit > max)
                max = digit;
            num = num / 10;
        }
        return max;
    }
}

class Assignmenr17 
{
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int no = sc.nextInt();

        Jam obj = new Jam();
        int result = obj.maxDigit(no);
        System.out.println("Maximum digit: " + result);
    }
}