
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

        public static void inOrder(Node root){
            if (root==null) {
                System.out.print(-1+",");
                return;
            }
            inOrder(root.left);
            System.out.print(root.data+",");
            inOrder(root.right);
        }
    }

    public static void main(String[] args) {
        int data[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        for(int num:data){
            System.out.print(num+",");
        }
        Preorder p = new Preorder();
        Node root = p.buildTree(data);
        // System.out.println(root.data);
        
        System.out.println();
        p.preorder(root);
        System.out.println();
        p.inOrder(root);
    }
}
