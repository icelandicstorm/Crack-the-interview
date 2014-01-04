/**
 * User: xijing2000
 * Date: 11/16/13
 * Time: 2:24 08PM
 */

/**
 * Basic string compression using the counts of repeated characters. aabcccccaaa-->a2b1c5a3
 * compressed string would not become smaller than original string.
 */
public class StringCompress {

    public static String StringCompress(String string) {
       if (string == "") return "String cannot be null!";

       String compress = "";
       int count = 1;
       char old = string.charAt(0);
       compress = compress + old;

       for (int i = 1; i < string.length(); i++) {
           char newchar = string.charAt(i);

           if(old == newchar){
               count++;
           }

           else if (old != newchar) {
               compress = compress + count;
               count = 1;
               compress = compress + newchar;
               old = newchar;
           }
        }

       if (compress.substring(compress.length()-1) != Integer.toString(count)) {
            compress = compress + count;
       }

       if (compress.length() < string.length()){
           return compress;
       }
       else{
           return string;
       }
    }

    public static void main(String args[]) {
         String string = "aaa";
         System.out.println(StringCompress(string));
    }
}
