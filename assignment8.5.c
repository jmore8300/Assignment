#include <stdio.h>

void TableRev(int iNo)
{
    int iCnt = 0;
    if (iNo < 0)
        iNo = -iNo;

    for (iCnt = 10; iCnt >= 1; iCnt--)
    {
        printf("%d ", iNo * iCnt);
    }
}

int main()
{
    int iValue = 0;
    printf("Enter number: ");
    scanf("%d", &iValue);
    TableRev(iValue);
    return 0;
}