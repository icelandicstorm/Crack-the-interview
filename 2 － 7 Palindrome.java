import java.util.LinkedList;
import java.util.Stack;

/**
 * User: xijing2000
 * Date: 11/16/13
 * Time: 3:32 12PM
 */

/**
 * Implement a function to check if a linked list is a palindrome.
 */
public class Palindrome {

    public static boolean isPalindrome(String string){
        int i=0;
        int j= string.length()-1;
        while((i != j) && ((i+1) != j)) {
            if(string.charAt(i) == string.charAt(j)){
                i++;
                j--;
            }
            else{
                return false;
            }
        }
        return true;
    }

    public static boolean isPalindromeLinkList(LinkedList linkedList){
        while(linkedList.size()>1){
            Object  a1 = linkedList.pollFirst();
            Object a2 = linkedList.pollLast();
            if(a1 != a2){
                return false;
            }
        }
        return true;
    }

    public static boolean isPalindromeLinkListStack(LinkedList linkedList, int linklistLength){
        Stack stack  = new Stack();
        int firstpoint = 0;

        if(linklistLength%2!=0){
            firstpoint = linklistLength/2+1;
        }
        else{
            firstpoint = linklistLength/2;
        }

        for(int i = firstpoint; i < linklistLength; i++){
            stack.push(linkedList.get(i));
        }

        while(!stack.isEmpty()){
            for(int i = 0; i < linklistLength/2; i++){
                if(stack.pop() != linkedList.get(i)){
                    return false;
                }
            }
        }
        return true;
    }


    public static boolean isPalindrome(MyLinkList linkedList,  int linklistLength){
        Stack stack  = new Stack();
        int count = 0;
        LinkListNode node = linkedList.head.next;

        while(count < linklistLength/2){
            stack.push(node.data);
            node = node.next;
            count++;
        }

        if(linklistLength%2 != 0){
            node = node.next;
        }

        while(node != null){
            if(stack.pop() != node.data){
                return false;
            }
            node=node.next;
        }

        return true;
    }

    public static boolean isPalindromeUnkownLength(MyLinkList linkedList){
        LinkListNode fast = linkedList.head.next;
        LinkListNode slow = linkedList.head.next;
        Stack stack  = new Stack();

        while((fast.next != null) && (fast.next.next != null)) {
            stack.push(slow.data);
            fast = fast.next.next;
            slow = slow.next;
        }

        stack.push(slow.data);

        if(fast.next != null) {
            slow = slow.next;
        }

        while(slow != null){
            if(stack.pop() != slow.data){
                return false;
            }
            slow = slow.next;
        }

        return true;
    }



    public static void main(String args[]){
//        String string = "ABA";
//        System.out.println(isPalindrome(string));
//
//        LinkedList<String> linkedList = new LinkedList<String>();
//        linkedList.add("a");
//        linkedList.add("b");
//        linkedList.add("b");
//        linkedList.add("a");
//        System.out.println(isPalindromeLinkList(linkedList));
//        System.out.println(isPalindromeLinkListStack(linkedList, linkedList.size()));

        MyLinkList myLinkList = new MyLinkList();
        LinkListNode a = new LinkListNode("a");
        myLinkList.add(a);
        LinkListNode b = new LinkListNode("b");
        myLinkList.add(b);
        LinkListNode c = new LinkListNode("b");
        myLinkList.add(c);
        LinkListNode d = new LinkListNode("a");
        myLinkList.add(d);

        System.out.println(isPalindrome(myLinkList, 4));

        System.out.println(isPalindromeUnkownLength(myLinkList));

    }
}
