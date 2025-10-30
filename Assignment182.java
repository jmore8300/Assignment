import java.util.Scanner;

class Jam 
{
    int countOdd(int num) 
    {
        int count = 0;
        while (num != 0) 
        {
            int digit = num % 10;
            if (digit % 2 != 0)
                count++;
            num = num / 10;
        }
        return count;
    }
}

class Assignment182 
{
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int no = sc.nextInt();

        Jam obj = new Jam();
        int result = obj.countOdd(no);
        System.out.println("Count of odd digits: " + result);
    }
}