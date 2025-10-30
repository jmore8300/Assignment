#include <stdio.h>

int sum_even_numbers(int limit)
{
    int i = 0, sum = 0;
    for (i = 2; i <= limit * 2; i += 2)
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
    printf("Sum of first %d even numbers = %d\n", limit, sum_even_numbers(limit));
    return 0;
}