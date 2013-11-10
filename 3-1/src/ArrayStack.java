/**
 * Created with IntelliJ IDEA.
 * User: xijing2000
 * Date: 10/19/13
 * Time: 2:49 30PM
 * To change this template use File | Settings | File Templates.
 */

public class ArrayStack {

   static int ArraySize = 300;
   static Object array[] = new Object[ArraySize];
   public static int pHead[] = new int[3];
   private int stackNum;

   public ArrayStack(int stackNum) {
       this.stackNum=stackNum;
       pHead[stackNum-1] = (ArraySize/3*stackNum-100)-1;
   }

   public Object Pop() {
       Object item;
       int head = pHead[stackNum-1];
       if( array[head] != null)
       {
           item = array[head];
           pHead[stackNum-1] = head-1;
           return item;
       }
       System.out.println("Can't Pop, the stack is full!");
       return  null;
   }

    public void Push(Object newItem) {
        Object item;
        int head = pHead[stackNum-1];
        if(head < pHead[stackNum])
        {
          head=head+1;
          array [head] = newItem;
          pHead[stackNum-1] = head;
        }
        else {
           System.out.println("Can't Push, the stack is full!");
        }

    }

    public Object Peek() {
        Object item;
        int head= pHead[stackNum-1];
        if( array[head]!= null)
        {
            item = array[head];
            return item;
        }
       return null;
    }

    public void Print() {
        int head = pHead[stackNum-1];
        int tail = (ArraySize/3*stackNum-100);
        System.out.println("The tail of the Stack is " + tail);
        System.out.println("  The head of the Stack is " + head);
        for(int i = tail; i <= head; i++)
        {

           System.out.println(array[i]);
        }
    }

    public static void main(String[] args) throws Exception {

        ArrayStack arrayStack1 = new ArrayStack(1);
        ArrayStack arrayStack2 = new ArrayStack(2);
        ArrayStack arrayStack3 = new ArrayStack(3);

        for(int i=1; i<10; i++){
            arrayStack1.Push(i);
        }
        arrayStack1.Print();
        arrayStack1.Pop();
        arrayStack1.Pop();
        arrayStack1.Print();
        System.out.println(arrayStack1.Peek());
    }
  }
