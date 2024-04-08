class Sorter{
    public void swap(int[] arr, int n, int m){
      int temp = arr[n];
      arr[n] = arr[m];
      arr[m] = temp;
    }
    public void sort(int[] arr){
      for(int i=0; i<arr.length;i++){
        int keyIndex=i;
        int smallest=arr[i];
        if(smallest>arr[i+1]){
          smallest=arr[i+1];
        }
        if(i>=arr.size){
          /*swap key with smallest */
        }
        
      }
        
    }
}  