#include <stdio.h>

int sum_natural_numbers(int limit)
{
    int i = 0, sum = 0;
    for (i = 1; i <= limit; i++)
    {
        sum = sum + i;
    }
    return sum;
}

int main()
{
    int limit;
    printf("Enter number : ");
    scanf("%d", &limit);
    printf("Sum = %d\n", sum_natural_numbers(limit));
    return 0;
}