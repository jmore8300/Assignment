//Problem 2: Find the Smallest Number (C Code)

#include <stdio.h>
#include <stdlib.h>


int Minimum(int Arr[], int iLength) 
{
    if (Arr == NULL || iLength == 0) 
    {
        return -1; 
    }

    int iMin = Arr[0]; 

    
    for (int i = 1; i < iLength; i++) {
     
        if (Arr[i] < iMin) {
            iMin = Arr[i];
        }
    }
    return iMin;
}

int main() 
{
    int iSize = 0, iRet = 0, iCnt = 0;
    int *p = NULL; 

 
    printf("Enter number of elements:\n");
    scanf("%d", &iSize);


    p = (int *)malloc(iSize * sizeof(int));
    
    
    if (p == NULL) {
        printf("Unable to allocate memory.\n");
        return -1; 
    }

    
    printf("Enter %d elements:\n", iSize);
    for (iCnt = 0; iCnt < iSize; iCnt++) {
        printf("Enter element %d: ", iCnt + 1);
        scanf("%d", &p[iCnt]);
    }

    
    iRet = Minimum(p, iSize);


    printf("\nSmallest number is %d\n", iRet);

  
    free(p);
    
    return 0; 
}