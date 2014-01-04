import java.util.ArrayList;
import java.util.HashMap;

/**
 * User: xijing2000
 * Date: 11/23/13
 * Time: 2:57 20PM
 */
public class Phone_Word {

    public static HashMap numToChar(){
        HashMap<Character, Integer>  LetterToNum = new HashMap<Character, Integer> ();
        LetterToNum.put('a', 2);
        LetterToNum.put('b', 2);
        LetterToNum.put('c', 2);
        LetterToNum.put('d', 3);
        LetterToNum.put('e', 3);
        LetterToNum.put('f', 3);
        LetterToNum.put('g', 4);
        LetterToNum.put('h', 4);
        LetterToNum.put('i', 4);
        LetterToNum.put('j', 5);
        LetterToNum.put('k', 5);
        LetterToNum.put('l', 5);
        LetterToNum.put('m', 6);
        LetterToNum.put('n', 6);
        LetterToNum.put('o', 6);
        LetterToNum.put('p', 7);
        LetterToNum.put('q', 7);
        LetterToNum.put('r', 7);
        LetterToNum.put('s', 7);
        LetterToNum.put('t', 8);
        LetterToNum.put('u', 8);
        LetterToNum.put('v', 8);
        LetterToNum.put('w', 9);
        LetterToNum.put('x', 9);
        LetterToNum.put('y', 9);
        LetterToNum.put('z', 9);

        return LetterToNum;
    }

    public static void InitialDictionary(String[] dictionary, HashMap<String, ArrayList<String>> numToThreeString,
                                         HashMap<String, ArrayList<String>> numToFourString,
                                         HashMap<String, ArrayList<String>> numToSevenString) {

        HashMap<Character, Integer> LetterToNum = numToChar();

        for(String d: dictionary){
            if(d.length() == 3){

                String num = new String();
                for(int i = 0; i < d.length(); i++){
                    char c = d.charAt(i);
                    num = num + LetterToNum.get(c).toString();
                }
                if(numToThreeString.containsKey(num)){
                    ArrayList<String> allString = new ArrayList<String>();
                    allString = numToThreeString.get(num);
                    allString.add(d);
                    numToThreeString.put(num, allString);
                }
                else{
                    ArrayList<String> allString = new ArrayList<String>();
                    allString.add(d);
                    numToThreeString.put(num, allString);
                }
            }

            if(d.length() == 4){
                String num = new String();
                for(int i = 0; i < d.length(); i++){
                    char c = d.charAt(i);
                    num = num + LetterToNum.get(c).toString();
                }
                if(numToFourString.containsKey(num)){
                    ArrayList<String> allString = new ArrayList<String>();
                    allString = numToFourString.get(num);
                    allString.add(d);
                    numToFourString.put(num, allString);
                }
                else{
                    ArrayList<String> allString = new ArrayList<String>();
                    allString.add(d);
                    numToFourString.put(num, allString);
                }
            }

            if(d.length() == 7){
                String num = new String();
                for(int i = 0; i < d.length(); i++){
                    char c = d.charAt(i);
                    num = num + LetterToNum.get(c).toString();
                }
                if(numToSevenString.containsKey(num)){
                    ArrayList<String> allString = new ArrayList<String>();
                    allString = numToSevenString.get(num);
                    allString.add(d);
                    numToSevenString.put(num, allString);
                }
                else{
                    ArrayList<String> allString = new ArrayList<String>();
                    allString.add(d);
                    numToSevenString.put(num, allString);
                }
            }
        }
    }
    /**
     * This code is to find possible words in the dictionary for the given Num
     **/

    public static void  main(String args[]){

        String [] dictionary = {"lop", "jmpu", "thea", "ifc", "kostiea", "lap", "tap",  "guest", "lmp", "get", "ruif", "kmpugec", "vida"};
        HashMap<String, ArrayList<String>> numToThreeString = new HashMap<String, ArrayList<String>>();
        HashMap<String, ArrayList<String>> numToFourString = new HashMap<String, ArrayList<String>>();
        HashMap<String, ArrayList<String>> numToSevenString = new HashMap<String, ArrayList<String>>();

        InitialDictionary(dictionary, numToThreeString, numToFourString, numToSevenString);


        String s ="5678432";

        if(s.length() < 3){
            System.out.println("The number is too short!");
        }
        else if(s.length() < 4){
            System.out.println(numToThreeString.get(s));
        }
        else if(s.length() < 5){
            System.out.println(numToFourString.get(s));
        }
        else if(s.length() < 6){
            System.out.println("The number is not contained in the dictionary!");
        }
        else if(s.length() < 7){
            ArrayList<String> allResult_1 = new ArrayList<String>();
            ArrayList<String> allResult_2 = new ArrayList<String>();
            if(numToThreeString.get(s.substring(0,3)).isEmpty()){
                if(numToThreeString.get(s.substring(3,s.length())).isEmpty()){
                    allResult_1 = numToThreeString.get(s.substring(0,3));
                    allResult_2 = numToThreeString.get(s.substring(3,s.length()));
                    for(String s1: allResult_1){
                        for(String s2: allResult_2){
                            System.out.println(s1+s2);
                        }
                    }

                }
            }
        }
        else if(s.length() < 8){
            ArrayList<String> allResult_1 = new ArrayList<String>();
            ArrayList<String> allResult_2 = new ArrayList<String>();
            ArrayList<String> allResult_3 = new ArrayList<String>();
            ArrayList<String> allResult_4 = new ArrayList<String>();
            ArrayList<String> allResult_5 = new ArrayList<String>();


            if(!numToThreeString.get(s.substring(0,3)).isEmpty()){
                if(!numToFourString.get(s.substring(3,s.length())).isEmpty()){
                    allResult_1 = numToThreeString.get(s.substring(0,3));
                    allResult_2 = numToFourString.get(s.substring(3,s.length()));
                    for(String s1: allResult_1){
                        for(String s2: allResult_2){
                            System.out.println(s1+s2);
                        }
                    }

                }
            }

            if(!numToFourString.get(s.substring(0,4)).isEmpty()){
                if(!numToThreeString.get(s.substring(4,s.length())).isEmpty()){
                    allResult_3 = numToFourString.get(s.substring(0,4));
                    allResult_4 = numToThreeString.get(s.substring(4,s.length()));
                    for(String s1: allResult_3){
                        for(String s2: allResult_4){
                            System.out.println(s1+s2);
                        }
                    }

                }
            }

            if(!numToSevenString.get(s).isEmpty()){
                allResult_5 = numToSevenString.get(s);
                for(String s1: allResult_5){
                        System.out.println(s1);
                }
            }
        }
    }
}
