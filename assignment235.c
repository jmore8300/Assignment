//5. Return product of all odd elements

#include <stdio.h>
#include <stdlib.h> 


int Product(int Arr[], int iLength)
{
    int iCnt = 0;
    long int iProduct = 1; 
    int iOddCount = 0;
    
    
    for(iCnt = 0; iCnt < iLength; iCnt++)
    {
        if((Arr[iCnt] % 2) != 0)
        {
            iProduct = iProduct * Arr[iCnt];
            iOddCount++;
        }
    }
    
    if (iOddCount == 0)
    {
        return 0; 
    }
    else
    {
        return (int)iProduct; 
    }
}

int main()
{
    int iSize = 0, iCnt = 0;
    int *p = NULL;
    int iRetProd = 0;

    printf("Enter number of elements:\n");
    scanf("%d", &iSize);
    
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

    iRetProd = Product(p, iSize);
    
    printf("Product is %d\n", iRetProd);

    free(p);
    
    return 0;
}