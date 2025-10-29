#include <stdio.h>

int FactDiff(int iNo)
{
    int iCnt = 0;
    int iSumFact = 0;
    int iSumNonFact = 0;

    for (iCnt = 1; iCnt < iNo; iCnt++)
    {
        if (iNo % iCnt == 0)
        {
            iSumFact = iSumFact + iCnt;     // Sum of factors
        }
        else
        {
            iSumNonFact = iSumNonFact + iCnt; // Sum of non-factors
        }
    }

    return iSumFact - iSumNonFact;  // Difference
}

int main()
{
    int iValue = 0;
    int iRet = 0;

    printf("Enter number: ");
    scanf("%d", &iValue);

    iRet = FactDiff(iValue);

    printf("Difference between sum of factors and non-factors: %d\n", iRet);

    return 0;
}