public class Main {

    public static void main(String[] args) {

        Tree tree = new Tree();
        tree.root = new Node(5);

        tree.root.setLeftNode(new Node(3));
        tree.root.getLeftNode().setLeftNode(new Node(2));
        tree.root.getLeftNode().setRightNode(new Node(5));
        tree.root.setRightNode(new Node(7));
        tree.root.getRightNode().setLeftNode(new Node(1));
        tree.root.getRightNode().setRightNode(new Node(0));

        System.out.println(
                tree.root.toString()
        );
    }
}
