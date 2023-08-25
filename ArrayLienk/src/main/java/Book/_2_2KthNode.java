package Book;

import java.util.List;

class ListNode {
    int val;
    ListNode next = null;

    public ListNode(int val) {
        this.val = val;
    }

    @Override
    public String toString() {
        return "ListNode{" +
                "val=" + val +
                ", next=" + next +
                '}';
    }
}

public class _2_2KthNode {
    //边界问题
    public ListNode FindKthToTail(ListNode head, int k) {
        if (head == null || k <= 0)
            return null;
        ListNode p1 = head;
        ListNode p2 = head;
        int count = 0;
        while (p2 != null && count < k) {
            p2 = p2.next;
            count++;
        }
        if (count < k) {
            return null;
        }
        while (p2 != null) {
            p1 = p1.next;
            p2 = p2.next;
        }
        //System.out.println(p1.val);
        return p1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        ListNode head = new ListNode(0);//哑元
        ListNode p = head;
        for (int i = 0; i < arr.length; i++) {
            p.next = new ListNode(arr[i]);
            p = p.next;
        }
        System.out.print(head);
        _2_2KthNode obj = new _2_2KthNode();
        ListNode l1 = obj.FindKthToTail(head,1);
        System.out.println("+++++"+l1.val);
        System.out.println(obj.FindKthToTail(head,2).val);
        System.out.println(obj.FindKthToTail(head,3).val);
        System.out.println(obj.FindKthToTail(head,4).val);
        System.out.println(obj.FindKthToTail(head,5).val);
        System.out.println(obj.FindKthToTail(head,6).val);

    }
}
