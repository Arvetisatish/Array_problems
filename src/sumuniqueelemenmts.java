import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class sumuniqueelemenmts {

    static void sumOfUniqueElemnts(int[] arr){
        Set<Integer> unique = new HashSet<>();
        for (int elements:arr){
            unique.add(elements);
        }
        int sum=0;
        for (int i:unique){
            sum=sum+i;
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        int [] arr= {1,1,2,2,3,3,5,5,6,6};
        sumOfUniqueElemnts(arr);
    }
}
