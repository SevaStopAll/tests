package ru.job4j.order.ru.tests.sametree;

public class SameTree {

    public boolean isSameTree(TreeNode p, TreeNode q) {
        boolean result = true;
            if (p.val != q.val) {
                return false;
            }
            isSameTree(p.left, q.left);
            isSameTree(p.right, q.right);
            return result;
    }
}
