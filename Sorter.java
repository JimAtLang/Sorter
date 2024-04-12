class Sorter{
    public void swap(int[] arr, int n, int m){
      int temp = arr[n];
      arr[n] = arr[m];
      arr[m] = temp;
    }
    public void sort(int[] arr){
      int smallestIndex=0;
      for(int i=0; i<arr.length;i++){
        int keyIndex=i;
        int smallest=arr[i];
        System.out.print(arr[i]);
        if(smallest>arr[i+1]){
          smallest=arr[i+1];
          smallestIndex=i+1;
        }
        if(i+1==arr.length){
          int temp=arr[smallestIndex];
          arr[smallestIndex]=arr[keyIndex];
          arr[keyIndex]=temp;
        }
        
      }
        
    }
}  