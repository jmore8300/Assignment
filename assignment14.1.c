#include <stdio.h>

void DisplayDigit(int iNo)
{
    int iDigit = 0;

    if (iNo < 0) // Handle negative numbers
    {
        iNo = -iNo;
    }

    while (iNo != 0)
    {
        iDigit = iNo % 10;     // Extract last digit
        printf("%d\n", iDigit);
        iNo = iNo / 10;        // Remove last digit
    }
}

int main()
{
    int iValue = 0;

    printf("Enter number: ");
    scanf("%d", &iValue);

    DisplayDigit(iValue);

    return 0;
}