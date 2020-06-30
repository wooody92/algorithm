package backjoon.treetour;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static class Node {
        String data;
        Node left;
        Node right;

        public Node(String data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTree {
        Node root;

        public void setRoot(Node root) {
            this.root = root;
        }

        public Node getRoot() {
            return root;
        }

        public Node makeNode(Node left, String data, Node right) {
            Node node = new Node(data);
            node.data = data;
            node.left = left;
            node.right = right;

            return  node;
        }

        public void preOrder(Node root){
            if(root != null) {
                System.out.print(root.data);
                preOrder(root.left);
                preOrder(root.right);
            }
        }

        public void inOrder(Node root){
            if(root != null) {
                inOrder(root.left);
                System.out.print(root.data);
                inOrder(root.right);
            }
        }

        public void postOrder(Node root){
            if(root != null) {
                postOrder(root.left);
                postOrder(root.right);
                System.out.print(root.data);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nodeNumber = sc.nextLine();
        int nodeNum = Integer.parseInt(nodeNumber);

        String[][] inputStr = new String[nodeNum][3];

        for(int i=0; i<nodeNum; i++) {
            String str = sc.nextLine();
            inputStr[i] = str.split(" ");
        }

        BinaryTree t = new BinaryTree();
        Node[] n = new Node[nodeNum];

        for(int i=(nodeNum-1); i>=0; i--) {
            System.out.println(Arrays.toString(inputStr[i]));
            String root = inputStr[i][0];
            String left = inputStr[i][1];
            String right = inputStr[i][2];

            //n[i] = t.makeNode(inputStr[i][1], inputStr[i][0], inputStr[i][2]);
        }

//        BinaryTree t = new BinaryTree();
//
//        Node n1 = t.makeNode(null, "G", null);
//        Node n2 = t.makeNode(null, "D", null);
//        Node n3 = t.makeNode(null, "E", null);
//        Node n4 = t.makeNode(null, "F", n1);
//        Node n5 = t.makeNode(n2, "B", null);
//        Node n6 = t.makeNode(n3, "C", n4);
//        Node n7 = t.makeNode(n5, "A", n6);
//
//        t.setRoot(n7);
//
//        t.preOrder(t.getRoot());
//        System.out.println();
//        t.inOrder(t.getRoot());
//        System.out.println();
//        t.postOrder(t.getRoot());

    }
}