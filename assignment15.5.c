#include <stdio.h>

int CountDiff(int iNo)
{
    int iDigit = 0;
    int iSumEven = 0, iSumOdd = 0;

    if (iNo < 0)
    {
        iNo = -iNo;
    }

    while (iNo != 0)
    {
        iDigit = iNo % 10;

        if (iDigit % 2 == 0)
        {
            iSumEven = iSumEven + iDigit;
        }
        else
        {
            iSumOdd = iSumOdd + iDigit;
        }

        iNo = iNo / 10;
    }

    return (iSumEven - iSumOdd);
}

int main()
{
    int iValue = 0;
    int iRet = 0;

    printf("Enter number: ");
    scanf("%d", &iValue);

    iRet = CountDiff(iValue);

    printf("Difference between even and odd digit sums: %d\n", iRet);

    return 0;
}