class QuickSort extends Quick implements Strategy {

    public void sort(Product[] numbers) {
        quick_sort(numbers, 0,numbers.length -1);
        System.out.println("sorting array using quick sort strategy");
        for (int i = 0; i < numbers.length; ++i)
        System.out.println(numbers[i].toString() + " ");
    }
}

class Quick {
    int partition(Product intArray[], int low, int high) { 
        Product pi = intArray[high];  
        int i = (low-1); // smaller element index   
        for (int j=low; j<high; j++) { 
            // check if current element is less than or equal to pi 
            if (intArray[j].compareTo(pi) <=-1) { 
                i++; 
                // swap intArray[i] and intArray[j] 
                Product temp = intArray[i]; 
                intArray[i] = intArray[j]; 
                intArray[j] = temp; 
            } 
        } 
   
        // swap intArray[i+1] and intArray[high] (or pi) 
        Product temp = intArray[i+1]; 
        intArray[i+1] = intArray[high]; 
        intArray[high] = temp; 
   
        return i+1; 
    } 
   
   
  //routine to sort the array partitions recursively
    void quick_sort(Product intArray[], int low, int high) { 
        if (low < high) { 
            //partition the array around pi=>partitioning index and return pi
            int pi = partition(intArray, low, high); 
   
            // sort each partition recursively 
            quick_sort(intArray, low, pi-1); 
            quick_sort(intArray, pi+1, high); 
        } 
    }
}

