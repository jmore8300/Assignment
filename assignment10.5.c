#include <stdio.h>

double SquareMeter(int iValue)
{
    double dSqMeter = 0.0;
    dSqMeter = iValue * 0.0929;  // 1 square foot = 0.0929 square meter
    return dSqMeter;
}

int main()
{
    int iValue = 0;
    double dRet = 0.0;

    printf("Enter area in square feet: ");
    scanf("%d", &iValue);

    dRet = SquareMeter(iValue);

    printf("Area in square meter is: %.6lf\n", dRet);

    return 0;
}