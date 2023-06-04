package ru.job4j.order.source;

public class ListNode {
        int val;
        ListNode next;
        ListNode() {}

        @Override
        public String toString() {
                return "ListNode{" +
                        "val=" + val +
                        " + '}'";
        }
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

