package Book;

import javax.swing.*;
import java.util.HashSet;

/**
 * 移除重复
 */
public class _2_1RevmoveRepeation {
    public static void main(String[] args) {
        int[] data = {1, 6, 7,3, 6};
        Node head = new Node(null);//哑元
        Node p = head;
        for (int i = 0; i < data.length; i++) {
            p.next=new Node(data[i]);
            p=p.next;
        }
        rr(head);
        Node p1=head.next;
        while (p1 != null) {
            System.out.println(p1.value);
            p1=p1.next;
        }
    }
    /**
     *
     */
    private static void rr(Node head){
        HashSet set = new HashSet();
        Node p1=head.next;
        Node pre=head;
        while (p1!=null){
            if(set.contains(p1.value)) {//存在
                pre.next=p1.next;//删除掉
            }else{
                set.add(p1.value);
            }
            pre=p1;
            p1=p1.next;
            //System.out.println(p1.value);
            //p1=p1.next;
        }
    }


    private static class Node {
        Node next;
        Object value;

        public Node(Object value) {
            this.value = value;
        }
    }
}
