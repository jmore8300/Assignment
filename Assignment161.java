class Jack
 {
    void calculateSum(int n) 
    {
        int sum = 0;
        for (int i = 1; i <= n; i++) 
        {
            sum += i;
        }
        System.out.println("Sum of first " + n + " natural numbers = " + sum);
    }
}

class Assignment16
 {
    public static void main(String args[]) 
    {
        Jack obj = new Jack();
        obj.calculateSum(10);
    }
}