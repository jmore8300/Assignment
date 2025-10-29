#include <stdio.h>

int KMtoMeter(int iNo)
{
    int iMeter = 0;
    iMeter = iNo * 1000;   // 1 kilometre = 1000 meter
    return iMeter;
}

int main()
{
    int iValue = 0, iRet = 0;

    printf("Enter distance in kilometre: ");
    scanf("%d", &iValue);

    iRet = KMtoMeter(iValue);

    printf("Distance in meter is: %d\n", iRet);

    return 0;
}