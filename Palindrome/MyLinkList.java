/**
 * Created with IntelliJ IDEA.
 * User: xijing2000
 * Date: 11/16/13
 * Time: 5:14 05PM
 */
public class MyLinkList {
    LinkListNode head;

    public MyLinkList() {
         this.head = new LinkListNode("");
    }

    public void add(LinkListNode newnode){
        LinkListNode node = this.head;

        while(node.hasNext()){
         node = node.next;
        }

        node.next = newnode;
    }

}
