class Sorter{
    public void swap(int[] arr, int n, int m){
      int temp = arr[n];
      arr[n] = arr[m];
      arr[m] = temp;
    }
    public void sort(int[] arr){
        int n = 0;
        int last = arr.length-1;
        boolean sorted = false;
        int sort = 0;
        while(!sorted){
          
          while (n < last){
            if(arr[n] > arr[n+1]){
              swap(arr,n,n+1);
            } else {
              sort++;
            }
            n++;
          }
          if(sort == last-1){
            sorted = true;
          }

          n = 0;
          sort = 0;
        }
    }
}  