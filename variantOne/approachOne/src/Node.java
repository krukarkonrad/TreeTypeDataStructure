public class Node {

    private static int indexCount = 0;

    private int index;
    private int value;
    private Node leftSubNode ;
    private Node rightSubNode;

    public Node(int value){
        this.index = indexCount;
        indexCount++;

        this.value = value;
        this.leftSubNode = null;
        this.rightSubNode = null;
    }

    @Override
    public String toString(){

        return ("Node " + index +
                "\n{value: " + this.value +
                " left"+index+"Node: " + this.leftSubNode +
                " right"+index+"Node: " + this.rightSubNode + "}"
        );
    }

    public int getIndex() {
        return index;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Node getLeftSubNode() {
        return leftSubNode;
    }

    public void setLeftSubNode(int value) {
        this.leftSubNode = new Node(value);
    }

    public Node getRightSubNode() {
        return rightSubNode;
    }

    public void setRightSubNode(int value) {
        this.rightSubNode = new Node(value);
    }


}
