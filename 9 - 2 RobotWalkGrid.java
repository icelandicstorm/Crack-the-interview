/**
 * Created with IntelliJ IDEA.
 * User: xijing2000
 * Date: 11/9/13
 * Time: 9:45 36PM
 */

public class RobotWalkGrid {

    public static int step = 0;

    public static int robotWalk(int x, int y) {
        if((x == 0)||(y == 0)) step++;
        else {
            robotWalk(x-1, y);
            robotWalk(x, y-1);
        }
        return step;
    }

    public static int robotWalkNR(int x, int y) {
        int p[][] = new int[x+1][y+1];
        for(int i = 1; i <= x; i++) {
            p[i][0] = 1;
        }

        for(int j = 1; j <= y; j++) {
            p[0][j] = 1;
        }

        for(int i = 1; i <= x; i++) {
            for(int j = 1; j <= y; j++) {
                p[i][j] = p[i-1][j] + p[i][j-1];
            }
        }
        return p[x][y];
    }

    public static void main(String[] args){
        int x = 1, y = 1;
        System.out.println(robotWalk(x, y));
        System.out.println(robotWalkNR(x, y));
    }
}
