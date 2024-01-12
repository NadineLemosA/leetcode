package leetCode.MergeTwoSortedLists;

public class MergeTwoSortedLists {
    public static void main(String[] args) {
        ListNode list1 = new ListNode(1);
        ListNode list2 = new ListNode(1, new ListNode(3, new ListNode(5)));
        System.out.println(mergeTwoLists(list1, list2));
    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode mergedLists = null;
        ListNode temporario = null;

        if (list1 == null && list2 == null) {
            return null;
        }

        if (list1 == null) {
            return list2;
        }

        if (list2 == null) {

            return list1;
        }

        while (list1 != null || list2 != null) {

            if (list1 == null) {
                if (mergedLists.next == null) {
                    mergedLists.next = list2;
                } else {
                    temporario = mergedLists.next;
                    boolean executaLaco = true;

                    while (executaLaco) {
                        if (temporario.next == null) {
                            temporario.next = list2;
                            executaLaco = false;
                        }

                        temporario = temporario.next;
                    }
                }

                return mergedLists;
            }

            if (list2 == null) {
                if (mergedLists.next == null) {
                    mergedLists.next = list1;
                } else {
                    temporario = mergedLists.next;
                    boolean executaLaco = true;

                    while (executaLaco) {
                        if (temporario.next == null) {
                            temporario.next = list1;
                            executaLaco = false;
                        }

                        temporario = temporario.next;
                    }
                }

                return mergedLists;
            }

            if (list1.val <= list2.val) {

                if (mergedLists == null) {

                    if (list1.val == list2.val) {
                        mergedLists = new ListNode(list1.val);
                        mergedLists.next = new ListNode(list2.val);
                        list2 = list2.next;
                    } else {
                        mergedLists = new ListNode(list1.val);
                    }
                } else {

                    if (mergedLists.next == null) {
                        mergedLists.next = new ListNode(list1.val);
                    } else {
                        temporario = mergedLists.next;
                        boolean executaLaco = true;

                        while (executaLaco) {
                            if (temporario.next == null) {
                                temporario.next = new ListNode(list1.val);
                                executaLaco = false;
                            }

                            temporario = temporario.next;
                        }
                    }
                }

                list1 = list1.next;

            } else {

                if (mergedLists == null) {

                    if (list1.val == list2.val) {
                        mergedLists = new ListNode(list1.val);
                        mergedLists.next = new ListNode(list2.val);
                        list2 = list2.next;
                    } else {
                        mergedLists = new ListNode(list2.val);
                    }
                } else {

                    if (mergedLists.next == null) {
                        mergedLists.next = new ListNode(list2.val);
                    } else {
                        temporario = mergedLists.next;
                        boolean executaLaco = true;

                        while (executaLaco) {
                            if (temporario.next == null) {
                                temporario.next = new ListNode(list2.val);
                                executaLaco = false;
                            }

                            temporario = temporario.next;
                        }
                    }
                }

                list2 = list2.next;
            }
        }

        return mergedLists;
    }
}