public class Sorting {
    
	static void shellSort(int list[]) {
		int n = list.length;
		
		for (int gap = n/2; gap > 0; gap /= 2) {
            System.out.println("Inside gap " + gap);
            for (int i = gap; i < n; i += 1) {
                System.out.println("Inside outer loop " + i);
                int temp = list[i];
                int j;
                for (j = i; j >= gap && list[j - gap] > temp; j -= gap) {
                	list[j] = list[j - gap];
                	System.out.println("Inside inner loop " + j);
                }
 
                // put temp (the original a[i]) in its correct location
                list[j] = temp;
          }
          /*
          for (int k=0; k<n; ++k)
                System.out.print(list[k]+" ");
            System.out.println();*/
        }
	}
	
	static void shellSort2(int list[]) {
		int n = list.length;
		boolean sorted = true;
		
		for (int gap = n/2; gap > 0 && sorted == true; gap /= 2) {
			sorted = false;
			System.out.println("Inside gap " + gap);
            for (int i = gap; i < n; i += 1) {
                System.out.println("Inside outer loop " + i);
                int temp = list[i];
                int j;
                for (j = i; j >= gap && list[j - gap] > temp; j -= gap) {
                	list[j] = list[j - gap];
                	System.out.println("Inside inner loop " + j);
                }
 
                // put temp (the original a[i]) in its correct location
                list[j] = temp;
                sorted = true;
                
          }
          /*
          for (int k=0; k<n; ++k)
                System.out.print(list[k]+" ");
            System.out.println();*/
        }
	}
	
	public static void main(String[] args) {
		
		int arrayP[] = { 15, 30, 25, 35, 20, 10 }; // partially sorted array

		int arrayW[] = { 35, 30, 25, 20, 15, 10 }; // worst -case scenario array
		
		int arrayB[] = { 10, 15, 20, 25, 30, 35 };  // best-case scenario array

		int n = arrayW.length;
		  
        System.out.println("Given Array\n");
        for (int i=0; i<n; ++i)
            System.out.print(arrayW[i]+" "); 
    
        System.out.println(); 
        
        // shellSort(arrayW);
                  
         shellSort2(arrayW);
  
        System.out.println("\nSorted array\n");
        for (int i=0; i<n; ++i)
            System.out.print(arrayW[i]+" "); 

	}
}