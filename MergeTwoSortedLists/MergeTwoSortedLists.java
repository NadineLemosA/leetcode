package leetCode.MergeTwoSortedLists;

public class MergeTwoSortedLists {
    public static void main(String[] args) {
        ListNode list1 = new ListNode(1, new ListNode(2, new ListNode(4)));
        ListNode list2 = new ListNode(1, new ListNode(3, new ListNode(4)));
        System.out.println(mergeTwoLists(list1, list2));
    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode mergedList = null;
        ListNode temporarioProx = new ListNode(list1.val, list1.next);

        while (temporarioProx != null) {
            if (mergedList == null) {
                mergedList = new ListNode(temporarioProx.val);
                temporarioProx = temporarioProx.next;
            } else {
                mergedList.val = temporarioProx.val;
                temporarioProx = temporarioProx.next;
            }
            System.out.println(mergedList.val);
        }

        temporarioProx = new ListNode(list2.val, list2.next);

        while (temporarioProx != null) {
            if (mergedList == null) {
                mergedList = new ListNode(temporarioProx.val);
                temporarioProx = temporarioProx.next;
            } else {
                mergedList.val = temporarioProx.val;
                temporarioProx = temporarioProx.next;
            }
            System.out.println(mergedList.val);
        }

        return mergedList;
    }
}