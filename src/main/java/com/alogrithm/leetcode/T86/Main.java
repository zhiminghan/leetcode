package com.alogrithm.leetcode.T86;

import com.alogrithm.leetcode.common.ListNode;

/**
 * @description: 86. 分隔链表
 * @author: hanzhiming
 * @url: https://leetcode-cn.com/problems/partition-list/
 * @time: 2020/2/12 02:26
 */

public class Main {

    public static ListNode partition(ListNode head, int x) {
        ListNode h=head;
        ListNode head1=null;
        ListNode partion1=null;

        ListNode head2=null;
        ListNode partion2=null;


        while (h!=null){

            if(h.val<x){
                if(partion1==null) head1=h;
                else partion1.next=h;
                partion1=h;
            }else {
                if(partion2==null) head2=h;
                else partion2.next=h;
                partion2=h;
            }
            h=h.next;
        }
        if(head1!=null&&head2!=null) {
            partion1.next = head2;
            partion2.next = null;
            return head1;
        }

        return head;

    }


}
