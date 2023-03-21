//Move all negative numbers to beginning and positive to end with constant extra space
public class neginbegopt{
    public static void swap(int[] arr, int i, int j){
        int temp = i;
        i = j;
        j = temp;
    }

    public static void main(String[] args){
        int[] arr= {-12, 11, -13, -5, 6, -7, 5, -3, -6};

        for(int i=0; i<arr.length; i++){
            if(arr[i]<0 && arr[i+1]>0){
                swap(arr,i,i+1);
            }
            else if(arr[i]>0 && arr[i+1]<0){
                swap(arr,i,i+1);
            }
            else if(arr[i]>0 && arr[i+1]>0){
                i+=2;
            }

        }
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }


    }
}