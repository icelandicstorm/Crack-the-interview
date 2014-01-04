/**
 * User: xijing2000
 * Date: 11/9/13
 * Time: 10:48 36PM
 */

/**
 * a child is running up a staircase with n steps, can hop either 1 step, 2steps, 3 steps
 * how many possible ways the child can run up the stairs
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
        int stair = 90;
        System.out.println(childStep(step, stair));
    }
}
