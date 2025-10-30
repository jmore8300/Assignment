#include <stdio.h>

void print_odd_numbers(int limit)
{
    int i = 0;
    for (i = 1; i <= limit; i += 2)
    {
        printf("%d\t", i);
    }
}

int main()
{
    int limit;
    printf("Enter number : ");
    scanf("%d", &limit);
    print_odd_numbers(limit);
    return 0;
}