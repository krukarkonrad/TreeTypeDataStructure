public class Tree {
    Node root;

    Tree(int value) {
        root = new Node(value);
    }

    Tree(){
        root = null;
    }

    public Node getRoot() {
        return root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }
}
