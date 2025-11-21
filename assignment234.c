//4 Display elements from a given range

#include <stdio.h>
#include <stdlib.h> 


void Range(int Arr[], int iLength, int iStart, int iEnd)
{
    int iCnt = 0;
    
    printf("Elements in the range [%d, %d]:\n", iStart, iEnd);

    for(iCnt = 0; iCnt < iLength; iCnt++)
    {
        if((Arr[iCnt] >= iStart) && (Arr[iCnt] <= iEnd))
        {
            printf("%d\t", Arr[iCnt]);
        }
    }
    printf("\n");
}

int main()
{
    int iSize = 0, iCnt = 0;
    int iStart = 0, iEnd = 0;
    int *p = NULL;
    
    printf("Enter number of elements:\n");
    scanf("%d", &iSize);

    printf("Enter the starting point (Start):\n");
    scanf("%d", &iStart);
    
    printf("Enter the ending point (End):\n");
    scanf("%d", &iEnd);
    
    p = (int *)malloc(iSize * sizeof(int));
    
    if(p == NULL)
    {
        printf("Unable to allocate memory\n");
        return -1;
    }
    
    printf("Enter %d elements:\n", iSize);
    for(iCnt = 0; iCnt < iSize; iCnt++)
    {
        printf("Enter element %d:\n", iCnt + 1);
        scanf("%d", &p[iCnt]);
    }

    Range(p, iSize, iStart, iEnd);
    
    free(p);
    
    return 0;
}