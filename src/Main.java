public class Main {
    public static void reverseArray(int [] arr, int k ){
       k=k%arr.length;

        reverse(arr ,0 , arr.length-1);
        reverse(arr , 0 , k-1);
        reverse(arr,k,arr.length-1);

    }
    public static void reverse(int[] arr , int start , int end){


            while (start<end){
                int temp=arr[start];
                arr[start]=arr[end];
                arr[end]=temp;
                start++;
                end--;
            }


    }
    public static void main(String[] args) {
        int[] arr={2,3,4,5,6,7};
        int k=4;
        for (int o:arr){
            System.out.print(o + " ");
        }
        System.out.println();
        reverseArray(arr , k);
        for (int i: arr){
            System.out.print(i +" ");
        }

    }
}