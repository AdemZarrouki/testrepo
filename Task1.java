import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task1 {
    public static int numberOfAllowedItems(int k, int numberOfItem, int[] itemWeights){
        Arrays.sort(itemWeights);
        List<Integer> a = new ArrayList();
        int count = 0;
        for(int i=0 ; i<itemWeights.length ; i++){
            int sum=0;
            for (int j=0 ; j<a.size() ; j++){
                sum+=a.get(j);
            }
            if (count<=numberOfItem && sum+itemWeights[i]<=k){
                a.add(itemWeights[i]);
                count++;
            }
            else break;
        }
        return a.size();
    }

    public static void main(String[] args) {
        int[] a = {10, 5, 3, 2, 3, 6};
        System.out.println(numberOfAllowedItems(20,6,a));
    }
}
