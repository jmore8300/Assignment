#include <stdio.h>

int EvenFactorial(int iNo)
{
    int iCnt = 0, iFact = 1;

    if (iNo < 0)
        iNo = -iNo;

    for (iCnt = 2; iCnt <= iNo; iCnt += 2)
    {
        iFact = iFact * iCnt;
    }
    return iFact;
}

int OddFactorial(int iNo)
{
    int iCnt = 0, iFact = 1;

    if (iNo < 0)
        iNo = -iNo;

    for (iCnt = 1; iCnt <= iNo; iCnt += 2)
    {
        iFact = iFact * iCnt;
    }
    return iFact;
}

int FactorialDiff(int iNo)
{
    int iEvenFact = 0, iOddFact = 0;
    int iDiff = 0;

    iEvenFact = EvenFactorial(iNo);
    iOddFact = OddFactorial(iNo);

    iDiff = iEvenFact - iOddFact;

    return iDiff;
}

int main()
{
    int iValue = 0, iRet = 0;

    printf("Enter number: ");
    scanf("%d", &iValue);

    iRet = FactorialDiff(iValue);

    printf("Factorial difference is %d\n", iRet);

    return 0;
}