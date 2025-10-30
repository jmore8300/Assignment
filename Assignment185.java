import java.util.Scanner;

class Jack 
{
    void displayFactors(int num) 
    {
        for (int i = 1; i <= num / 2; i++) 
        {
            if (num % i == 0)
                System.out.print(i + " ");
        }
    }
}

class Assignment185 
{
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int no = sc.nextInt();

        Jack obj = new Jack();
        obj.displayFactors(no);
    }
}