public class Quicksort {

public static void main(String[] args) 
{

    int a[] = {99,88,5,4,3,2,1,0,12,3,7,9,8,3,4,5,7};
       quicksort(a, 0, a.length-1);
}

static int partition(int[] a, int low , int hi)
{
    int pivot = hi;
    int i =low;
    int j = hi;
    while(i<j)
    {
        if(a[i]<=a[pivot])
        {
            i++;
        }
        if(a[i]>a[pivot])
        {   
        if((a[i]>a[pivot]) && (a[j]<=a[pivot]))
        {
            int temp= a[i];
            a[i]=a[j];
            a[j]=temp;
            i++;    
        }
        if(a[j]>a[pivot])
        {
            j--;
        }
        }
    }
    int temp= a[i];
    a[i]=a[pivot];
    a[pivot]=temp;
    return i;
}
static void quicksort(int[] a, int low, int hi)
{
    if(low>=hi)
    {
        return;
    }
    int split = partition(a, low, hi);
    quicksort(a, low, split-1);
    quicksort(a, split+1, hi);
}
}