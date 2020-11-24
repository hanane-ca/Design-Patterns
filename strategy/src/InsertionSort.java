class InsertionSort implements Strategy {

    public void sort(Product[] list) {
        int n = list.length;  
        for (int j = 1; j < n; j++) {  
            Product key = list[j];  
            int i = j-1;  
            while ( (i > -1) && ( list [i].compareTo(key) >=1 ) ) {  
                list [i+1] = list [i];  
                i--;  
            }  
            list[i+1] = key;  
        }  
        System.out.println("sorting array using insertion sort strategy");
        for (int i = 0; i < list.length; ++i)
        System.out.println(list[i].toString() + " ");
    }
}

