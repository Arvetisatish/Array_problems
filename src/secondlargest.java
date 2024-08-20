public class secondlargest {
    public static void main(String[] args) {
        int[] arr= {1,23,4,65,6660,7008};
        int first;
        int second;

        if (arr[0]>arr[1]){
            first=arr[0];
            second=arr[1];
        }

        else {
            first=arr[1];
            second=arr[0];
        }

        for (int i=2;i<arr.length;i++){
            if (arr[i]>first){
                second=first;
                first=arr[i];
            }

            else {
                if (arr[i]<first){
                    second=arr[i];
                }
            }
        }
        System.out.println(first);

        System.out.println(second);
    }
}
