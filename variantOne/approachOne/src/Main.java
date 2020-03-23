public class Main {

    public static void main(String[] args) {

        Tree tree = new Tree(5);

        //L0
        tree.root.setLeftSubNode(3);
        tree.root.getLeftSubNode().setLeftSubNode(2);
        tree.root.getLeftSubNode().setRightSubNode(5);

        //R0
        tree.root.setRightSubNode(7);
        tree.root.getRightSubNode().setLeftSubNode(1);
        tree.root.getRightSubNode().setRightSubNode(0);
        //R1
        tree.root.getRightSubNode().getRightSubNode().setLeftSubNode(2);
        tree.root.getRightSubNode().getRightSubNode().setRightSubNode(8);
        //R2
        tree.root.getRightSubNode().getRightSubNode().getRightSubNode().setRightSubNode(5);

        Menu.showMenu(tree);

    }
}
