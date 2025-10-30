import java.util.Scanner;

class Jack 
{
    int countTwo(int num) 
    {
        int count = 0;
        while (num != 0) 
        {
            int digit = num % 10;
            if (digit == 2)
                count++;
            num = num / 10;
        }
        return count;
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
        int result = obj.countTwo(no);
        System.out.println("Frequency of 2: " + result);
    }
}