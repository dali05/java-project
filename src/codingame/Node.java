package codingame;

public class Node {

    int value;
    Node left;
    Node right;


    public Node() {
    }


    public Node(Node node) {

        this.value = node.value;
        this.left = node.left;
        this.right = node.right;

    }




    public Node(int value) {
        this.value = value;
    }

    public Node(int value, Node left, Node right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Node find(int v) {
        Node current = this;
        while(current != null) {
            if (current.value == v) {
                return current;
            }
            if (v < current.value) {
                current = current.left;
            } else {
                current = current.right;
            }
        }
        return current;
    }

    public void addNode(Node newNode, Node root) {

       if(root == null) {
           System.out.println("cannot add new node");
           return;
       }
        if(newNode.value > root.value) {
            if(root.right == null) {
                root.right = newNode;
            } else {
                addNode(newNode, root.right);
            }

        }

        if(newNode.value < root.value) {
            if(root.left == null) {
                root.left = newNode;
            } else {
                addNode(newNode, root.left);
            }

        }
    }

    public void search(int value, Node root) {

        if(root == null) {
            System.out.println("value not founded");
            return;
        }

        if(root.value == value) {
            System.out.println("value is founded");
            return;
        }

        if(value> root.value) {
            search(value, root.right);
        }

        if(value < root.value) {
            search(value, root.left);
        }
    }


    public static void main(String[] args) {
        // Node root = new Node(1, new Node(2, new Node(4), new Node(5)),new Node(3, null, new Node(6)));
        // root.addNode(new Node(2), root.right);

        Node root = new Node(9, new Node(7), new Node(13));

        root.left.right = new Node(8);
        root.left.left = new Node(5, new Node(2), new Node(6));
        root.right.right = new Node(17, new Node(16),null);





    }
}
