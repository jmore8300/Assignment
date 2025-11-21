//Problem 5: Summation of Digits (C Code)

#include <stdio.h>
#include <stdlib.h> 


void DigitsSum(int Arr[], int iLength) {
    if (Arr == NULL || iLength == 0) {
        printf("Array is empty or NULL.\n");
        return;
    }

    printf("\nSummation of digits for each number:\n");
    
   
    for (int i = 0; i < iLength; i++) 
    {
        int iNo = Arr[i];     
        int iDigit = 0;        
        int iSum = 0;         
        
       
        if (iNo < 0) {
            iNo = -iNo;
        }

       
        while (iNo != 0) 
        {
            iDigit = iNo % 10;
            iSum = iSum + iDigit; 
            iNo = iNo / 10;  
        }
        
      
        printf("%d\t", iSum);
    }
    printf("\n"); 
}

int main() 
{
    int iSize = 0, iCnt = 0;
    int *p = NULL; 

   
    printf("Enter number of elements: ");
    scanf("%d", &iSize);

   
    p = (int *)malloc(iSize * sizeof(int));
    
    
    if (p == NULL) 
    {
        printf("Unable to allocate memory.\n");
        return -1; 
    }

  
    printf("Enter %d elements:\n", iSize);
    for (iCnt = 0; iCnt < iSize; iCnt++) {
        printf("Enter element %d: ", iCnt + 1);
        scanf("%d", &p[iCnt]);
    }

    
    DigitsSum(p, iSize);

    
    free(p);
    
    return 0; 
}