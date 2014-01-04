import java.util.HashMap;

/**
 * User: xijing2000
 * Date: 11/23/13
 * Time: 8:33 13PM
 */

/**
 * Given an array of integers, find two numbers such that they add up to a specific target number.
 * The function twoSum should return indices of the two numbers such that they add up to the target,
 * where index1 must be less than index2. Please note that your returned answers (both index1 and index2) are not zero-based.
 * You may assume that each input would have exactly one solution.
 * Input: numbers={2, 7, 11, 15}, target=9
 * Output: index1=1, index2=2
 */

public class twoSum {
    public static int[] findTwoSum(int numbers[], int target){
        HashMap<Integer, Integer> NumberIndex = new HashMap<Integer, Integer>();

        int a[] = new int[2];

        for(int i = 0; i < numbers.length; i++){
            int n = target - numbers[i];
            if(NumberIndex.containsKey(n)) {
                 a[0] = NumberIndex.get(n);
                 NumberIndex.put(numbers[i], i+1);
                 a[1] = NumberIndex.get(numbers[i]);
                 return a;
            }
            NumberIndex.put(numbers[i], i+1);
        }
        return a;
    }

    public static void main(String args[]){
        int numbers[] = {0,1,3,4};
        int target = 0;

        int a[] =findTwoSum(numbers, target);

        for(int i = 0; i < a.length; i++){
            System.out.print(a[i]+" ");
        }
    }
}
