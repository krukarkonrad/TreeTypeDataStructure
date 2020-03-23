public class Main {

    public static void main(String[] args) {

        Tree tree = new Tree(5); //index 0

        //L0
        tree.root.setLeftSubNode(3);  //index 1
        tree.root.getLeftSubNode().setLeftSubNode(2); //index 2 and so on
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
