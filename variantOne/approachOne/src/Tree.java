import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

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


    public Node findNodeByIndex(int index){
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
        System.out.println(list);
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


}