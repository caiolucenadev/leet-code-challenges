class ListNodeSolution {

    public static void main(String[] args) {
        ListNode firstList = new ListNode(1, new ListNode(2, new ListNode(4)));
        ListNode secondList = new ListNode(1, new ListNode(3, new ListNode(4)));
        System.out.println(mergeTwoLists(firstList, secondList));
    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        if (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                list1.next = mergeTwoLists(list1.next, list2);
                return list1;
            } else {
                list2.next = mergeTwoLists(list2.next, list1);
                return list2;
            }

        }
        if (list1 == null) {
            return list2;
        }
        return list1;
    }

}

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

}