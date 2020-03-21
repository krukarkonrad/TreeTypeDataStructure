public class Main {

    public static void main(String[] args) {

        Tree tree = new Tree();

        tree.setRoot(new Node(5));

        //L0
        tree.root.setLeftSubNode(new Node(3));
        tree.root.getLeftSubNode().setLeftSubNode(new Node(2));
        tree.root.getLeftSubNode().setRightSubNode(new Node(5));

        //R0
        tree.root.setRightSubNode(new Node(7));
        tree.root.getRightSubNode().setLeftSubNode(new Node(1));
        tree.root.getRightSubNode().setRightSubNode(new Node(0));
        //R1
        tree.root.getRightSubNode().getRightSubNode().setLeftSubNode(new Node(2));
        tree.root.getRightSubNode().getRightSubNode().setRightSubNode(new Node(8));
        //R2
        tree.root.getRightSubNode().getRightSubNode().getRightSubNode().setRightSubNode(new Node(5));

        System.out.println(
                tree.averageValueByIndex(4)
        );


    }
}
