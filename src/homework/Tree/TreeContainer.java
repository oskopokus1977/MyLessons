package homework.Tree;

import java.util.ArrayList;

public class TreeContainer {
    TreeNode root;
    private int size;
    ArrayList<TreeNode> addOrder = new ArrayList<>();

    public void add(int value) {
        size++;
        if (root == null) {
            root = new TreeNode(value);
            addOrder.add(root);

        } else {
            addRecursion(root, value);
        }
    }

    private void addRecursion(TreeNode node, int value) {
        if (node.getValue() > value) {
            if (node.getLeft() == null) {
                TreeNode newNode = new TreeNode(value);
                node.setLeft(newNode);
                newNode.setParent(node);
                addOrder.add(newNode);
            } else {
                addRecursion(node.getLeft(), value);
            }
        } else {
            if (node.getRight() == null) {
                TreeNode newNode = new TreeNode(value);
                node.setRight(newNode);
                newNode.setParent(node);
                addOrder.add(newNode);
            } else {
                addRecursion(node.getRight(), value);
            }
        }
    }

    public boolean contains(TreeNode node) {
        return root != null && (root.getValue() == node.getValue() || containsRecursion(node, root));
    }

    private boolean containsRecursion(TreeNode node, TreeNode node1) {
        if (node1.getValue() > node.getValue()) {
            return node1.getLeft() != null && (node1.getLeft().getValue() == node.getValue() || containsRecursion(node, node1.getLeft()));
        } else {
            return node1.getRight() != null && (node1.getRight().getValue() == node.getValue() || containsRecursion(node, node1.getRight()));
        }
    }

    public int getSize() {
        return size;
    }

    public TreeNode getTreeNodeOfAddOrder(int order) throws ArrayIndexOutOfBoundsException {
        if (order > addOrder.size()) throw new ArrayIndexOutOfBoundsException("Invalid queue value MF!!!");
        order--;
        return addOrder.get(order);
    }


    public static class TreeNode {

        private int value;
        private TreeNode parent = null;
        private TreeNode left;
        private TreeNode right;

        public TreeNode(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }

        public TreeNode getParent() {
            return parent;
        }

        public void setParent(TreeNode parent) {
            this.parent = parent;
        }

        public TreeNode getLeft() {
            return left;
        }

        public void setLeft(TreeNode left) {
            this.left = left;
        }

        public TreeNode getRight() {
            return right;
        }

        public void setRight(TreeNode right) {
            this.right = right;
        }
    }

    public static class Main {
        public static void main(String[] args) throws Exception {
            TreeContainer container = new TreeContainer();
            container.add(5);
            container.add(3);
            container.add(6);
            container.add(7);
            container.add(0);
            container.add(8);
            container.add(4);
            TreeNode node = new TreeNode(-1);
            System.out.println(container.contains(node));

            System.out.println(container.getSize());

            try {
                System.out.println(container.getTreeNodeOfAddOrder(8).getValue());
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}



