/**
 * User: xijing2000
 * Date: 11/23/13
 * Time: 7:59 59PM
 */

import java.util.HashMap;

/**
 * Find the first non-repeating character in a stream of characters?
 * As fast as possible!
 */

public class findUniqueLetter {

    public static  Character findUnique(String w) {
        if (w == null) { return null; }

        HashMap <Character, Integer> table  = new HashMap<Character, Integer>();
        for(int i = 0; i < w.length(); i++) {
            if(table.containsKey(w.charAt(i))) {
              table.put(w.charAt(i), Integer.valueOf(w.length())+1);
            }
           else {
            table.put(w.charAt(i), i);
            }
        }

        for(int i = 0; i < w.length(); i++) {
            if(table.get(w.charAt(i)) != w.length()+1) return w.charAt(i);
        }
        return null;
    }

    public static void main(String args[]){
        String w = "abcddab";
        System.out.print(findUnique(w));
    }
}
