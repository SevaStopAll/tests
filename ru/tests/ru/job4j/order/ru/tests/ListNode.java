package ru.job4j.order.ru.tests;

public class ListNode {
        public int val;
        public ListNode next;
        public ListNode() {}

        @Override
        public String toString() {
                return "ListNode{" +
                        "val=" + val +
                        ", next=" + next +
                        '}';
        }

        public ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

