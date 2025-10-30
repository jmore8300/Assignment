import java.util.Scanner;

class Jack 
{
    int countEven(int num) 
    {
        int count = 0;
        while (num != 0) 
        {
            int digit = num % 10;
            if (digit % 2 == 0)
                count++;
            num = num / 10;
        }
        return count;
    }
}

class Assignment181 
{
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int no = sc.nextInt();

        Jack obj = new Jack();
        int result = obj.countEven(no);
        System.out.println("Count of even digits: " + result);
    }
}