package me.jramun.jalgorithms.tree;

import java.util.LinkedList;
import java.util.Queue;

public class BinarySearchTree {
    Node root;

    public void add(int value) {
        this.root = addRecursive(this.root, value);
    }

    private Node addRecursive(Node current, int value) {
        if (current == null) {
            return new Node(value);
        }

        if (value < current.value) {
            current.left = addRecursive(current.left, value);
        } else if (value > current.value) {
            current.right = addRecursive(current.right, value);
        } else {
            // value already exists
            return current;
        }

        return current;
    }

    /*
        DFS Algorithms
    */
    //region InOrder
    public void inOrderTraversal() {
        inOrderTraversal(this.root);
    }

    private void inOrderTraversal(Node root) {
        if (root != null) {
            inOrderTraversal(root.left);
            System.out.print(root.value + " ");
            inOrderTraversal(root.right);
        }
    }
    //endregion

    //region PreOrder
    public void preOrderTraversal() {
        preOrderTraversal(root);
    }

    private void preOrderTraversal(Node root) {
        if (root != null) {
            System.out.print(root.value + " ");
            preOrderTraversal(root.left);
            preOrderTraversal(root.right);
        }

    }
    //endregion

    //region PostOrder
    public void postOrderTraversal() {
        if (root != null) {
            postOrderTraversal(root.left);
            System.out.print(root.value + " ");
            postOrderTraversal(root.right);
        }
    }

    private void postOrderTraversal(Node root) {
        if (root != null) {
            preOrderTraversal(root.left);
            inOrderTraversal(root.right);
            System.out.print(root.value + " ");
        }
    }
    //endregion

/*
    BFS Algorithms
*/

    public void bfsTraversal() {
        if (root == null)
            return;

        Queue<Node> nodes = new LinkedList<>();
        nodes.add(this.root);
        while (!nodes.isEmpty()) {
            Node node = nodes.remove();
            System.out.print(node.value + " ");
            if (node.left != null) {
                nodes.add(node.left);
            }

            if (node.right != null) {
                nodes.add(node.right);
            }
        }
    }

    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        tree.add(6);
        tree.add(4);
        tree.add(8);
        tree.add(3);
        tree.add(5);
        tree.add(7);
        tree.add(9);

        /*Preview
                        6
                  4           8
                3   5       7   9
         */
        System.out.println("DFS Algorithms");
        System.out.println("InOrder");
        tree.inOrderTraversal();
        System.out.println();
        System.out.println("PreOrder");
        tree.preOrderTraversal();
        System.out.println();
        System.out.println("PostOrder");
        tree.postOrderTraversal();
        System.out.println();
        System.out.println("BFS Algorithms");
        tree.bfsTraversal();

    }
}
