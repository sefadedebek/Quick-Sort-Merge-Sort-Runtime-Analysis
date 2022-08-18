package Quick-Sort-Merge-Sort-Runtime-Analysis;
import java.util.Arrays;


public class Quick-Sort-Merge-Sort-Runtime-Analysis {

	
	
    public static void main(String[] args)
    {
    	
    	
    	int[] a = {10,12,25,13,14,99,34,7,6,17,56};
       

		System.out.println();
		

        System.out.print("S�ralanmam�� Dizi:");
        for (int x = 0; x < a.length; x++)
        {
        	System.out.print(a[x]);
            if (x <= a.length - 2) System.out.print(",");
        }

        int[] B = Arrays.copyOf(a, a.length);
        int[] C = Arrays.copyOf(a, a.length);
        
        System.out.println();
        
        long startTime = System.nanoTime();

        
        mergesort(a,0, a.length-1);
        
        
        long endTime = System.nanoTime();
		long estimatedTime = endTime - startTime;
        System.out.println();
		System.out.print("S�ralanm�� Dizi: " );
		diziYaz(a); 
		
        System.out.println();

		System.out.println("Merge sort �al��ma zaman�= " + estimatedTime + " Nanosaniye");
		
        System.out.println();



		
        long startTime2 = System.nanoTime();

		sort(B, 0, B.length-1);
		
		long endTime2 = System.nanoTime();
		long estimatedTime2 = endTime2 - startTime2;
		System.out.println("Quicksort �al��ma zaman�: " + estimatedTime2 + " Nanosaniye");
		System.out.println();

        
        
		long startTime3 = System.nanoTime();
		
		insertionsort(C);
		
		long endTime3 = System.nanoTime();
		
		long estimatedTime3 = endTime3 - startTime3;
		
		System.out.println("Insertion sort �al��ma zaman�: " + estimatedTime3 + " Nanosaniye");
		System.out.println();

 

       
    }

	
    
    static void mergesort(int arr[], int alt, int ust)  
    {  
    if (alt<ust)  
    {  
    int mid = (alt+ust)/2;  
    mergesort(arr, alt, mid);  
    mergesort(arr , mid+1, ust);  
    mergee(arr, alt, mid, ust);  
    }  
    }  
    

    static void diziYaz(int[] arr)
    {
        for (int i = 0; i < arr.length; i++)
        {
        	System.out.print(arr[i] + " ");
        	
        }
    	System.out.println();

    }

  
    
    static void mergee(int arr[], int alt, int mid, int ust)  
    {  
      
    int l = mid - alt + 1;  
    int r = ust - mid;  
      
    int Sol[] = new int [l];  
    int Sag[] = new int [r];  
      
    for (int i=0; i<l; ++i)  
    Sol[i] = arr[alt + i];  
      
    for (int j=0; j<r; ++j)  
    Sag[j] = arr[mid + 1+ j];  
      
      
    int i = 0, j = 0;  
    int k = alt;  
    while (i<l&&j<r)  
    {  
    if (Sol[i] <= Sag[j])  
    {  
    arr[k] = Sol[i];  
    i++;  
    }  
    else  
    {  
    arr[k] = Sag[j];  
    j++;  
    }  
    k++;  
    }  
    while (i<l)  
    {  
    arr[k] = Sol[i];  
    i++;  
    k++;  
    }  
      
    while (j<r)  
    {  
    arr[k] = Sag[j];  
    j++;  
    k++;  
    }  
    
    
    }  
      
 
   
    
    static public void insertionsort(int[] dizi)
    {
        int adim = 0;
        for (int i = 0; i < dizi.length; i++)
        {
            for (int j = i; j > 0; j--)
            {
                if (dizi[j] < dizi[j - 1])
                {
                    int temp = dizi[j];
                    dizi[j] = dizi[j - 1];
                    dizi[j - 1] = temp;
                    adim = adim + 1;

                    

                }
            }
        }
    }
    
    
    static int partition(int arr[], int alt, int ust) 
    { 
        int pivot = arr[ust];  
        int i = (alt-1);
        for (int j=alt; j<ust; j++) 
        { 
       
            if (arr[j] < pivot) 
            { 
                i++; 
  
             
                int temp = arr[i]; 
                arr[i] = arr[j]; 
                arr[j] = temp; 
            } 
        } 
 
        int temp = arr[i+1]; 
        arr[i+1] = arr[ust]; 
        arr[ust] = temp; 
  
        return i+1; 
    } 
  
 
    static void sort(int arr[], int alt, int ust) 
    { 
        if (alt < ust) 
        { 
         
            int pi = partition(arr, alt, ust); 
            sort(arr, alt, pi-1); 
            sort(arr, pi+1, ust); 
        } 
    } 
    
    
    
    

	
}
