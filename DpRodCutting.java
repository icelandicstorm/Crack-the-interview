/**
 * Created with IntelliJ IDEA.
 * User: xijing2000
 * Date: 11/9/13
 * Time: 4:33 40PM
 * To change this template use File | Settings | File Templates.
 */
public class DpRodCutting {

    public static int FindMaxPrice(int L[], int P[], int totalLength){
        int Max[] = new int[totalLength+1];
        for (int i=0; i<Max.length; i++) { Max[i]=0;}

        for (int i=1; i<=totalLength; i++){
            for(int j=0; j<L.length; j++){
                if((L[j]<=i) && (Max[i-L[j]]+P[j] > Max[i])){
                    Max[i]=Max[i-L[j]]+P[j];
                }
            }
        }

        return Max[totalLength];
    }
    public static void  main(String[] args){

        int L[] = {1,2,3,4,5,6,7,8};
        int P[] = {3,5,8,9,10,17,17,20};
        int totalLength=8;
        System.out.println(FindMaxPrice(L,P,totalLength));


    }
}
