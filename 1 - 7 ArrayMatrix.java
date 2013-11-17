/**
 * Created with IntelliJ IDEA.
 * User: xijing2000
 * Date: 11/16/13
 * Time: 9:45 25PM
 */
public class ArrayMatrix {

    public static int[][] SetArrayMatrix(int a[][]){
        boolean row[] = new boolean[a.length];
        boolean col[] = new boolean[a[0].length];

        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a[0].length; j++){
                if((a[i][j])==0){
                  row[i] = true;
                  col[j] = true;
                }
            }
        }

        for(int i=0; i < a.length; i++){
            for(int j=0; j < a[0].length; j++){
                if((row[i])||(col[j])) {
                    a[i][j]=0;
                }
            }
        }

        return a;
    }

    public static void main(String args[]){
//         int a[][] = { {1,1},
//                       {1,1}};

         int a[][] = {{1,1,0,0,1,1,1},
                     {3,3,2,0,0,0,0},
                     {1,1,1,1,1,1,1},
                     {2,3,3,3,3,3,3},
                     {0,1,1,1,1,1,1}};

        SetArrayMatrix(a);

        for(int i=0; i < a.length; i++){
            for(int j=0; j < a[0].length; j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println("");
        }
    }
}
