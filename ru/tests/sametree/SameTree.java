package ru.job4j.order.ru.tests.sametree;

public class SameTree {

    public static boolean isSameTree(ru.job4j.order.ru.tests.sametree.TreeNode p, ru.job4j.order.ru.tests.sametree.TreeNode q) {
        boolean result = true;
        while (p != null && q != null) {
        if (p.val != q.val) {
            return false;
        }
        isSameTree(p.left, q.left);
        isSameTree(p.right, q.right);

        }
        return result;
    }

    public static void main(String[] args) {
        ru.job4j.order.ru.tests.sametree.TreeNode p = new ru.job4j.order.ru.tests.sametree.TreeNode(1);
        ru.job4j.order.ru.tests.sametree.TreeNode q = new ru.job4j.order.ru.tests.sametree.TreeNode(1);
        p.left = new ru.job4j.order.ru.tests.sametree.TreeNode(2);
        q.left = new ru.job4j.order.ru.tests.sametree.TreeNode(2);
        p.right = new ru.job4j.order.ru.tests.sametree.TreeNode(3);
        q.right = new ru.job4j.order.ru.tests.sametree.TreeNode(3);
        SameTree.isSameTree(p, q);
    }
}
