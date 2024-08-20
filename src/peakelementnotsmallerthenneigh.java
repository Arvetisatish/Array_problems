public class peakelementnotsmallerthenneigh {
    public static void peak(int [] arr){
        if (arr[0]>arr[1]){
            System.out.println(arr[0]);
        }
        //if (arr[arr.length-1] > arr[arr.length-2]){
          //  System.out.println(arr[arr.length-1]);
        //}


        for (int i=2;i<arr.length-1;i++){
            if (arr[i]>arr[i+1] && arr[i]>arr[i-1]){
                System.out.println(arr[i]);
            }
        }
    }
    public static void main(String[] args) {
        int [] arr={5,6,7,4,6,6};
        peak(arr);
    }
}
