import java.util.Scanner;

class Jack 
{
    boolean isPalindrome(int num) 
    {
        int temp = num;
        int rev = 0;
        while (num != 0) 
        {
            int digit = num % 10;
            rev = rev * 10 + digit;
            num = num / 10;
        }
        return temp == rev;
    }
}

class Assignment183 
{
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int no = sc.nextInt();

        Jack obj = new Jack();
        if (obj.isPalindrome(no))
            System.out.println("Palindrome Number");
        else
            System.out.println("Not Palindrome");
    }
}