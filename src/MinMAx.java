public class MinMAx {
    static  int min(int[] arr){
        int min=arr[0];
        for (int i:arr){
            if (i<min){
                min=i;
            }
        }
        return min;
    }
    static  int max( int [] arr){
        int max=arr[0];
        for (int i:arr){
            if (i>max){
                max=i;
            }
        }
        return max;
    }
    static int sum(int[] arr){
        int sum=0;
        for (int i:arr){
            sum+=i;
        }
        return sum;
    }
    public static void main(String[] args) {

        int [] arr={343,45,667,3565,54365,565,4654,4654};
        System.out.println(min(arr));
        System.out.println(max(arr));
        System.out.print(sum(arr));
    }
}
