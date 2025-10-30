import java.util.Scanner;

class Jem 
{
    void displayReverse(int num) 
    {
        while (num != 0) 
        {
            int digit = num % 10;
            System.out.print(digit + " ");
            num = num / 10;
        }
    }
}

class Assignmenr17 
{
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int no = sc.nextInt();

        Jem obj = new Jem();
        obj.displayReverse(no);
    }
}