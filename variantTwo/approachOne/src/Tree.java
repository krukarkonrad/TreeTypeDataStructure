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

    public Node findNodeWithIndex(Node node, int index){
        return findNodeWithIndexRecursion(node, index);
    }

        private Node findNodeWithIndexRecursion(Node node, int index){
            System.out.println("Sprawdzam node: " + node.getIndex());
            if(node.getIndex() == index){
                System.out.println("Pasuje " + node.getIndex());
                return node;
            }
            Node toReturn = null;
            if(node.getLeftSubNode() != null){
                toReturn = findNodeWithIndexRecursion(node.getLeftSubNode(), index);
                if(toReturn != null) return toReturn;
            }
            if(node.getRightSubNode() != null){
                toReturn = findNodeWithIndexRecursion(node.getRightSubNode(),index);
                if(toReturn != null) return toReturn;
            }
            return toReturn;
        }
}
