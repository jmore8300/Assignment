import java.util.Scanner;

class Jam 
{
    void displayTable(int num) 
    {
        for (int i = 1; i <= 10; i++) 
        {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }
}

class Assignment184 
{
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int no = sc.nextInt();

        Jam obj = new Jam();
        obj.displayTable(no);
    }
}