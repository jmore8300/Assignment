//5. Display Elements which are Multiples of 11


#include <stdio.h>
#include <stdlib.h>

// Function to display elements which are multiples of 11
void Display(int Arr[], int iLength)
{
    int iCnt = 0;
    printf("Elements which are multiples of 11 are:\n");

    for (iCnt = 0; iCnt < iLength; iCnt++)
    {
        // Check if the remainder when divided by 11 is 0
        if ((Arr[iCnt] % 11) == 0)
        {
            printf("%d\n", Arr[iCnt]);
        }
    }
}

int main()
{
    int iSize = 0;
    int iCnt = 0;
    int *p = NULL;

    printf("Enter number of elements:\n");
    scanf("%d", &iSize);

    p = (int *)malloc(iSize * sizeof(int));

    if (p == NULL)
    {
        printf("Unable to allocate memory\n");
        return -1;
    }

    printf("Enter %d elements\n", iSize);
    for (iCnt = 0; iCnt < iSize; iCnt++)
    {
        printf("Enter element %d:\n", iCnt + 1);
        scanf("%d", &p[iCnt]);
    }

    // Call the function
    Display(p, iSize);

    free(p);
    return 0;
}