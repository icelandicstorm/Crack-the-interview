/**
 * User: xijing2000
 * Date: 11/16/13
 * Time: 2:10 13PM
 */

/**
 * Test a string is rotate or not, stackoverflow -->  tackoverflows yes, stackoverflow --> stackoverflwo not.
 */
public class TwoString {
    public static boolean isRotate(String s1, String s2){
//        if(s2.equals(
//                s1.substring(s1.indexOf(s2.substring(0,1)))+
//                s1.substring(0, s1.indexOf(s2.substring(0,1))))){
//            return true;
//        }
//        return false;

//        return (s1.length() == s2.length()) && ((s1+s1).indexOf(s2) != -1);
        return (s1.length() == s2.length()) && ((s1+s1).contains(s2));
    }

    public static void main (String args[]){
        System.out.println(isRotate("stackoverflow", "tackoverflows"));
        System.out.println(isRotate("stackoverflow", "ackoverflowst"));
        System.out.println(isRotate("stackoverflow", "overflowstack"));
        System.out.println(isRotate("stackoverflow", "stackoverflwo"));

    }
}
