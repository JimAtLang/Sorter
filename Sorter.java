class Sorter{
    public void swap(int[] arr, int smallestIndex, int keyIndex){
      int temp=arr[smallestIndex];
      arr[smallestIndex]=arr[keyIndex];
      arr[keyIndex]=temp;
    }
    public void sort(int[] arr){
      int smallestIndex=0;
      for(int i=0; i<arr.length;i++){
        int keyIndex=i;
        int smallest=arr[i];
        System.out.print(arr[i]);
        for(int j=i+1; j<arr.length; j++){
        if(smallest>arr[j]){
          smallest=arr[j];
          smallestIndex=j;
        }
        swap(arr, smallestIndex, keyIndex);
       }        
      }
    }
}  