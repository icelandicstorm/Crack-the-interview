/**
 * Created with IntelliJ IDEA.
 * User: xijing2000
 * Date: 11/9/13
 * Time: 10:48 36PM
 */

public class ChildStep {

    public static long childStep (final int Step[], final int stair ) {
        long pw[] = new long[stair+1];
        pw[0]=1;
        for (int i = 1; i <= stair; i++){
            for(int j = 0; j < Step.length; j++){
                if(Step[j] <= i){
                    pw[i] += pw[i-Step[j]];
                }
            }
        }
        return pw[stair];
    }

    public static void main(String[] args) {
        int step[] = {1, 2, 3};
        int stair = 100;
        System.out.println(childStep(step, stair));
    }
}
