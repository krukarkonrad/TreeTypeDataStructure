public class Node {

    private static int indexCount = 0;

    private int index;
    private int value;
    private Node leftNode ;
    private Node rightNode;

    public Node(int value){
        this.index = indexCount;
        indexCount++;

        this.value = value;
        this.leftNode = null;
        this.rightNode = null;
    }

    @Override
    public String toString(){
        return ("Node with index: " + index +
                " value: " + this.value +
                "\nleftNode: " + this.leftNode +
                "\nrightNode: " + this.rightNode
        );
    }

    public static int getIndexCount() {
        return indexCount;
    }

    public static void setIndexCount(int indexCount) {
        Node.indexCount = indexCount;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Node getLeftNode() {
        return leftNode;
    }

    public void setLeftNode(Node leftNode) {
        this.leftNode = leftNode;
    }

    public Node getRightNode() {
        return rightNode;
    }

    public void setRightNode(Node rightNode) {
        this.rightNode = rightNode;
    }
}
