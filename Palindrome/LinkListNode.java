/**
 * Created with IntelliJ IDEA.
 * User: xijing2000
 * Date: 11/16/13
 * Time: 5:14 38PM
 */
public class LinkListNode {
    LinkListNode next;
    Object data;

    public LinkListNode(Object e){
        next = null;
        data = e;
    }

    public boolean hasNext() {
        if (this.next == null){
            return false;
        }
        return true;
    }

}
