public class Sorting {

	static void selectionSort(int list[]) {
        int n = list.length;
        for (int i = 0; i < n-1; i++) {
            System.out.println("Inside outer loop " + i);
        	// Find the minimum element in unsorted array
            int min_idx = i;
            for (int j = i+1; j < n; j++) {
                System.out.println("Inside inner loop " + j);
                if (list[j] < list[min_idx])
                {
                		min_idx = j;
                }
            }    
            // Swap the found minimum element with the first element
            int temp = list[min_idx];
            list[min_idx] = list[i];
            list[i] = temp;
          /* for (int k=0; k<n; ++k)
                System.out.print(list[k]+" ");
            System.out.println();*/
        }
    }
	
	static void selectionSort2(int list[]) {
        int n = list.length;
        boolean sorted = true;
        for (int i = 0; i < n-1 && sorted == true; i++) {
        	sorted = false;
        	System.out.println("Inside outer loop " + i);
            // Find the minimum element in unsorted array
            int min_idx = i;
            for (int j = i+1; j < n; j++) {
                System.out.println("Inside inner loop " + j);
                if (list[j] < list[min_idx]) {
                	min_idx = j;
                	sorted = true;
                }	
            }
            // Swap the found minimum element with the first element
            int temp = list[min_idx];
            list[min_idx] = list[i];
            list[i] = temp;
          /* for (int k=0; k<n; ++k)
                System.out.print(list[k]+" ");
            System.out.println();*/
        }
    }
	
	static void insertionSort(int list[]) {
		int n = list.length;
		for (int i = 1; i < n; ++i) {
            int key = list[i];
            int j = i - 1;
            System.out.println("Inside outer loop " + i);
            while (j >= 0 && list[j] > key) {
                System.out.println("Inside inner loop " + j);
            	list[j + 1] = list[j];
                j = j - 1;
            }
            list[j + 1] = key;
          /* for (int k=0; k<n; ++k)
                System.out.print(list[k]+" ");
            System.out.println();*/
        }
	}
	
	static void insertionSort2(int list[]) {
		int n = list.length;
		boolean sorted = true;
		for (int i = 1; i < n && sorted == true; ++i) {
            int key = list[i];
            int j = i - 1;
            sorted = false;
           // System.out.println("Inside outer loop " + i);
            while (j >= 0 && list[j] > key) {
               // System.out.println("Inside inner loop " + j);
            	list[j + 1] = list[j];
                j = j - 1;
                sorted = true;
            }
            list[j + 1] = key;
          }
	}

	public static void main(String[] args) {
		
		int arrayP[] = { 15, 30, 25, 35, 20, 10 }; // partially sorted array

		int arrayW[] = { 35, 30, 25, 20, 15, 10 }; // worst -case scenario array
		
		int arrayB[] = { 10, 15, 20, 25, 30, 35 };  // best-case scenario array

		int n = arrayB.length;
		  
        System.out.println("Given Array\n");
        for (int i=0; i<n; ++i)
            System.out.print(arrayB[i]+" "); 
    
        System.out.println(); 
        
        // selectionSort(arrayB);
                  
        // selectionSort2(arrayB);
       
        // insertionSort(arrayB);
        
        // insertionSort2(arrayB);
  
        System.out.println("\nSorted array\n");
        for (int i=0; i<n; ++i)
            System.out.print(arrayB[i]+" "); 

	}
}