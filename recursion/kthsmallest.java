class kthsmallest{
    public static void sort(int []arr){
        for(int i=0; i<arr.length; i++){
            for(int j=1; j<(arr.length-i); j++){
                //bubble sort
                int temp =0;
                if(arr[j-1]>arr[j]){
                    temp = arr[j-1];
                    arr[j-1] =arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
    public static void kthSmallest(int[] arr, int k) 
    { 
        sort(arr);
        if(k<arr.length){
        
            System.out.println(arr[k-1]);
        }
        else{
            System.out.println();
        }
        
    } 
    public static void main(String[] args){
        int[] arr = {7,10,4,3,20,15};
        int k = 3;
        kthSmallest(arr,3);
        
    }
}