#include <stdio.h>

float Percentage(int iTotal, int iObtain)
{
    float fResult = 0.0;

    // Handle the condition if total is 0
    if (iTotal == 0)
    {
        printf("Total marks cannot be zero.\n");
        return 0.0;
    }

    fResult = ((float)iObtain / (float)iTotal) * 100;

    return fResult;
}

int main()
{
    int iValue1 = 0, iValue2 = 0;
    float fRet = 0.0;

    printf("Please enter total marks: ");
    scanf("%d", &iValue1);

    printf("Please enter obtained marks: ");
    scanf("%d", &iValue2);

    fRet = Percentage(iValue1, iValue2);

    printf("Percentage is : %.2f%%", fRet);

    return 0;
}