import java.util.*;

public class PreorderBinaryTree {
    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class Preorder {
        static int idx = -1;

        public static Node buildTree(int nodes[]) {
            idx++;
            if (idx >= nodes.length || nodes[idx] == -1) {
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            return newNode;
        }

        public static void preorder(Node root) {
            if (root == null) {
                System.out.print(-1 + ",");
                return;
            }
            System.out.print(root.data + ",");
            preorder(root.left);
            preorder(root.right);
        }

        public static void inOrder(Node root) {
            if (root == null) {
                return;
            }
            inOrder(root.left);
            System.out.print(root.data + ",");
            inOrder(root.right);
        }

        public static void postOrder(Node root) {
            if (root == null) {
                return;
            }
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data + ",");
        }

        public static void levelorder(Node root) {
            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);
            while (!q.isEmpty()) {
                Node currentNode = q.remove();
                if (currentNode == null) {
                    System.out.println();
                    if (q.isEmpty()) {
                        break;
                    } else {
                        q.add(null);
                    }
                } else {
                    System.out.print(currentNode.data + ",");
                    if (currentNode.left != null) {
                        q.add(currentNode.left);
                    }
                    if (currentNode.right != null) {
                        q.add(currentNode.right);
                    }
                }
            }
        }

        public static int height(Node root) {
            if (root == null) {
                return 0;
            }
            int left = height(root.left);
            int right = height(root.right);
            return Math.max(left, right) + 1;

        }

        public static int countNode(Node root) {
            if (root == null) {
                return 0;
            }
            int sum = 0;
            int left = countNode(root.left);
            int right = countNode(root.right);
            sum = left + right + 1;
            return sum;
        }

        public static int sum(Node root) {
            if (root == null) {
                return 0;
            }
            int leftSum = sum(root.left);
            int rightSum = sum(root.right);
            return leftSum + rightSum + root.data;
        }

        // first approch to find dimension of tree
        public static int dimension(Node root) {
            if (root == null) {
                return 0;
            }
            int leftDim = dimension(root.left);
            int leftHeight = height(root.left);
            int rightDim = dimension(root.right);
            int rightHeight = height(root.right);
            int selfDim = leftHeight + rightHeight + 1;
            int dimOfTree = Math.max(selfDim, Math.max(rightDim, leftDim));
            return dimOfTree;
        }

        // second approch to find the dimension of tree
        static class Info {
            int dim;
            int height;

            public Info(int dim, int h) {
                this.dim = dim;
                this.height = h;
            }
        }

        public static Info dimeter1(Node root) {
            if (root == null) {
                return new Info(0, 0);
            }
            Info leftInfo = dimeter1(root.left);
            Info rigInfo = dimeter1(root.right);
            int dim = Math.max(Math.max(leftInfo.dim, rigInfo.dim), leftInfo.height + rigInfo.height + 1);
            int height = Math.max(leftInfo.height, rigInfo.height) + 1;
            return new Info(dim, height);
        }
    }

    public static void main(String[] args) {
        int data[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        for (int num : data) {
            System.out.print(num + ",");
        }
        Preorder p = new Preorder();
        Node root = p.buildTree(data);
        // System.out.println(root.data);

        System.out.println();
        p.preorder(root);
        System.out.println();
        p.inOrder(root);
        System.out.println();
        p.postOrder(root);
        System.out.println("\nleveloreder ");
        p.levelorder(root);
        System.out.println();
        int height = p.height(root);
        System.out.println("height of tree is : " + height);
        int sumNode = p.countNode(root);
        System.out.println("Number of Node in this tree is : " + sumNode);
        int sum = p.sum(root);
        System.out.println("sum of node is : " + sum);
        int dimension = p.dimension(root);
        System.out.println("Dimension of tree : " + dimension);
        System.out.println(p.dimeter1(root).dim);

    }
}
