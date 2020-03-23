import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class TreeTest {

    private Tree temp = createTree();

    @Test
    public void sumSubtreeByIndex() {
        assertEquals(12, temp.sumSubtreeByIndex(3));
    }

    @Test
    public void averageValueByIndex() {
        assertEquals(3.5,temp.averageValueByIndex(7),0.00001);
    }

    @Test
    public void medianValueByIndex() {
        assertEquals(5.5, temp.medianValueByIndex(1), 0.00001);
    }

        private static Tree createTree(){

            //Root
            Tree tree = new Tree(2);

            //Left
            tree.root.setLeftSubNode(3);
            tree.root.getLeftSubNode().setLeftSubNode(3);
            tree.root.getLeftSubNode().setRightSubNode(5);

            tree.root.getLeftSubNode().getLeftSubNode().setLeftSubNode(8);
            tree.root.getLeftSubNode().getLeftSubNode().setRightSubNode(6);

            tree.root.getLeftSubNode().getRightSubNode().setRightSubNode(7);

            //Right
            tree.root.setRightSubNode(8);

            tree.root.getRightSubNode().setLeftSubNode(3);
            tree.root.getRightSubNode().setRightSubNode(1);

            tree.root.getRightSubNode().getRightSubNode().setRightSubNode(2);

            return tree;
        }
}
