#include <stdio.h>

int OddFactorial(int iNo)
{
    int iCnt = 0;
    int iFact = 1;

    if (iNo < 0)          // handle negative numbers
        iNo = -iNo;

    for (iCnt = 1; iCnt <= iNo; iCnt += 2)
    {
        iFact = iFact * iCnt;
    }

    return iFact;
}

int main()
{
    int iValue = 0, iRet = 0;

    printf("Enter number: ");
    scanf("%d", &iValue);

    iRet = OddFactorial(iValue);

    printf("Odd Factorial of number is %d\n", iRet);

    return 0;
}