import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Tree {

    Node root;

    Tree(int value){
        this.root = new Node(value);
    }

    private Tree(){};

    private int indexCount = 0;

    class Node {

        private int index;
        private int value;
        private Node leftSubNode ;
        private Node rightSubNode;

        private Node(int value){
            this.index = indexCount;
            indexCount++;

            this.value = value;
            this.leftSubNode = null;
            this.rightSubNode = null;
        }

        @Override
        public String toString(){
            return ("\nNode index " + index +
                    "{value: " + this.value +
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

        public Node setLeftSubNode(int value) {
            this.leftSubNode = new Node(value);
            return this.leftSubNode;
        }

        public Node getRightSubNode() {
            return rightSubNode;
        }

        public Node setRightSubNode(int value) {
            this.rightSubNode = new Node(value);
            return this.rightSubNode;
        }

    }

        private Node findNodeByIndex(int index){
            return findNodeByIndexRecursion(this.root, index);
        }

        private Node findNodeByIndexRecursion(Node node, int index){
            if(node.getIndex() == index){
                return node;
            }
            Node toReturn = null;
            if(node.getLeftSubNode() != null){
                toReturn = findNodeByIndexRecursion(node.getLeftSubNode(), index);
                if(toReturn != null) return toReturn;
            }
            if(node.getRightSubNode() != null){
                toReturn = findNodeByIndexRecursion(node.getRightSubNode(),index);
                if(toReturn != null) return toReturn;
            }
            return toReturn;
        }

    public int sumSubtreeByIndex(int index){
        Node subtree = this.findNodeByIndex(index);
        return sumSubtree(subtree);
    }

        private int sumSubtree(Node node){
            int sum = 0;
            if(node.getLeftSubNode() != null){
                sum += sumSubtree(node.getLeftSubNode());
            }
            if(node.getRightSubNode() != null){
                sum += sumSubtree(node.getRightSubNode());
            }
            return node.getValue() + sum;
        }

    public double averageValueByIndex(int index){
        Node temp = findNodeByIndex(index);
        return (double)sumSubtree(temp)/(double)sizeOfTree(temp);
    }

        private int sizeOfTree(Node node){
            int counter = 0;
            if(node.getLeftSubNode() != null){
                counter += sizeOfTree(node.getLeftSubNode());
            }
            if(node.getRightSubNode() != null){
                counter += sizeOfTree(node.getRightSubNode());
            }
            return counter + 1;
        }

    public double medianValueByIndex(int index){
        Node temp = findNodeByIndex(index);
        List<Integer> list = listOfValues(temp);
        Collections.sort(list);
        if(list.size()%2 == 0){
            return((double)list.get(list.size()/2) + (double)list.get(list.size()/2 - 1)) / 2;
        } else {
            return((double)list.get(list.size()/2));
        }
    }

        private List<Integer> listOfValues(Node node){
            List<Integer> temp = new ArrayList<Integer>();
            if(node.getLeftSubNode() != null){
                temp.addAll(listOfValues(node.getLeftSubNode()));
            }
            if(node.getRightSubNode() != null){
                temp.addAll(listOfValues(node.getRightSubNode()));
            }
            temp.add(node.getValue());
            return temp;
        }

    @Override
    public String toString() {
        return this.root.toString();
    }

}
