#include <stdio.h>

int RangeSumEven(int iStart, int iEnd)
{
    int iCnt = 0, iSum = 0;

    if (iStart < 0 || iEnd < 0)
    {
        printf("Invalid range (positive numbers only)\n");
        return 0;
    }

    if (iStart > iEnd)
    {
        printf("Invalid range\n");
        return 0;
    }

    for (iCnt = iStart; iCnt <= iEnd; iCnt++)
    {
        if (iCnt % 2 == 0)
        {
            iSum = iSum + iCnt;
        }
    }

    return iSum;
}

int main()
{
    int iValue1 = 0, iValue2 = 0, iRet = 0;

    printf("Enter starting point: ");
    scanf("%d", &iValue1);

    printf("Enter ending point: ");
    scanf("%d", &iValue2);

    iRet = RangeSumEven(iValue1, iValue2);

    if (iRet != 0)
    {
        printf("Addition is %d\n", iRet);
    }

    return 0;
}