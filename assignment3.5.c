#include <stdio.h>

void DisplayFactor(int iNo)
{
    int i = 0;

    if(iNo <= 0)
    {
        iNo = -iNo;   // Convert negative number to positive
    }

    for(i = 1; i <= iNo/2; i++)
    {
        if((iNo % i == 0) && (i % 2 == 0))   // Check even factors
        {
            printf("%d\t", i);
        }
    }
}

int main()
{
    int iValue = 0;

    printf("Enter number:\n");
    scanf("%d", &iValue);

    DisplayFactor(iValue);

    return 0;
}