public class Main {

    public static void main(String[] args) {

        System.out.println("Tree 1, from task");
        Menu.showMenu(firstWayToBuildTree());
        System.out.println("Tree 2, by author");
        Menu.showMenu(secondWayToBuildTree());

    }

        private static Tree firstWayToBuildTree(){
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

            return tree;
        }

        private static Tree secondWayToBuildTree(){
            Tree tree = new  Tree(2);

            Tree.Node left1 = tree.root.setLeftSubNode(3);
            Tree.Node right1 = tree.root.setRightSubNode(8);

            Tree.Node left1left2 = left1.setLeftSubNode(3);
            Tree.Node left1right2 = left1.setRightSubNode(5);

            Tree.Node right1efr2 = right1.setLeftSubNode(3);
            Tree.Node right1right2 = right1.setRightSubNode(1);

            Tree.Node left1left2left3 = left1left2.setLeftSubNode(8);
            Tree.Node left1left2right3 = left1left2.setRightSubNode(6);
            Tree.Node left1right2right3 = left1right2.setRightSubNode(7);

            Tree.Node right1right2right3 = right1right2.setRightSubNode(2);

            return tree;
        }

}
