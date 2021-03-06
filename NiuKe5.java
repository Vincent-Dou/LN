package niuke;

/**
 * Auther:vincent-Dou
 * Date: 2019/4/9
 * Time: 12:49
 * description：合并两个排序的链表...输入两个单调递增的链表，输出两个链表合成后的链表，当然我们需要合成后的链表满足单调不减规则。
 */
public class NiuKe5 {
    public ListNode Merge(ListNode list1,ListNode list2) {
        ListNode dummy = new ListNode(-1);
        ListNode temp = dummy;
        while (list1 != null && list2 != null){
            if (list1.val < list2.val) {
                temp.next = list1;
                temp = temp.next;
                list1 = list1.next;
            }else{
                temp.next = list2;
                temp = temp.next;
                list2 = list2.next;
            }
        }
        if(list1 == null){
            temp.next = list2;
        }else{
            temp.next = list1;
        }
        return dummy.next;
    }
}
