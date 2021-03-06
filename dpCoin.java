/**
 * User: xijing2000
 * Date: 11/9/13
 * Time: 2:23 17PM
 */

/**
 * Given a list of N coins, their values (V1, V2, ... , VN), and the total sum S.
 * Find the minimum number of coins the sum of which is S (we can use as many coins of one type as we want),
 * or report that it's not possible to select coins in such a way that they sum up to S.
 */
public class dpCoin {

    public static Integer findMin(int V[], int Value){
       int[] Min = new int[Value+1];
       Min[0] = 0;
       for(int i=1; i<Min.length; i++) {Min[i] = Integer.MAX_VALUE-1;}

       for (int i=1; i <= Value; i++){
          for(int j=0; j<V.length; j++){
            if((V[j] <= i) && ((Min[i-V[j]]+1)< Min[i])) {
                Min[i] = Min[i-V[j]]+1;
            }
          }
       }
       if(Min[Value] == (Integer.MAX_VALUE-1)) return null;
       return Min[Value];
    }

    public static void main(String[] args) throws Exception {
        int V[] = {2, 3, 5};
        int Value = 1;
        Integer min = findMin(V, Value);
        if (min == null) System.out.print("not solution");
        else System.out.print(min);
    }
}
