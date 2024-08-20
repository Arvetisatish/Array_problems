public class Arrays_equals_Or_Not {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int [] arr2= {1,2,3,4,5};
        boolean iseqal=true;
        if (arr.length==arr2.length){
            for(int i=0;i<arr.length;i++){
                if (arr[i]!=arr2[i]){
                    iseqal=false;

                }

            }

        }
        if (iseqal) {


            System.out.println("yes");
        }
        else {
            System.out.println("no");
        }
    }
}
