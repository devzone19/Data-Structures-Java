package Trees;

import java.util.List;

public interface BTree {

    public static class TreeNode<T extends Comparable<T>> implements Comparable<T> {

        T val;
        TreeNode left, right;

        public TreeNode() {
        }

        public TreeNode(T val) {
            this.val = val;
        }

        public TreeNode(T val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }

        @Override
        public int compareTo(T o) {
            return this.val.compareTo(o);
        }

    }

    public List<Object> inOrder(TreeNode node);

    public List<Object> preOrder(TreeNode node);

    public List<Object> postOrder(TreeNode node);

}
