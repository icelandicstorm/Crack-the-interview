import java.util.Random;
import java.util.Stack;

/**
 * Created with IntelliJ IDEA.
 * User: xijing2000
 * Date: 10/19/13
 * Time: 7:59 11PM
 * To change this template use File | Settings | File Templates.
 */

public class SortStack{


    public static Stack<Integer> SortStack(Stack<Integer> stack){
        Stack<Integer> stackSort = new Stack<Integer>();
        while (!stack.isEmpty()) {
            int temp = stack.pop();
            while((!stackSort.isEmpty()) && (stackSort.peek()>temp)){
                stack.push(stackSort.pop());
            }

            stackSort.push(temp);
        }
        return stackSort;
    }

    public static void displayStack(Stack<Integer> stack){
        for(Integer i : stack){
            System.out.println(i.intValue());
        }
    }

    public static void main(String[] args) throws Exception {

        Stack<Integer> stack = new Stack<Integer>();

        for (int i=1; i<=10; i++){
            Random rand = new Random();
            int value = rand.nextInt(10)+1;
            stack.push(value);
        }
        System.out.println("Original stack: ");
        displayStack(stack);
        System.out.println("Sort stack: ");
        displayStack(SortStack(stack));



    }
}
