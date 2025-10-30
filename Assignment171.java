import java.util.Scanner;

class Jack 
{
    int sumDigits(int num) 
    {
        int sum = 0;
        while (num != 0) 
        {
            sum = sum + (num % 10);
            num = num / 10;
        }
        return sum;
    }
}

class Assignmenr17
{
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int no = sc.nextInt();

        Jack obj = new Jack();
        int result = obj.sumDigits(no);
        System.out.println("Sum of digits: " + result);
    }
}