import java.util.Arrays;

public class mergearray {
    static void bubble(int[] arr){
        for (int i=0;i<arr.length-1;i++){
            for (int j=0;j<arr.length-1;j++){
                if (arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr1={14,4,6,78};
        int [] arr2={7,98,76,46};
        bubble(arr1);
        bubble(arr2);
        int[] mergearray=new int[arr1.length+arr2.length];

        int i=0;
        int j=0;
        int k =0;
        while (i<arr1.length&&i<arr2.length){
            if (arr1[i]<arr2[j]){
                mergearray[k]=arr1[i];
                i++;
            }
            else {
                mergearray[k]=arr2[j];
                j++;

            }
            k++;
        }
        while (i<arr1.length){
            mergearray[k]=arr1[i];
            i++;
            k++;
        }
        while (j<arr2.length){
            mergearray[k]=arr2[j];
            j++;
            k++;
        }

        for (int o:mergearray){
            System.out.print(o + " ");
        }

    }
}
