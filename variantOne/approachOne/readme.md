## Index of Node

While we are building our tree, every new node gets a new pre-incremented index which is assigned to its.

#### Example

This tree:
![](https://i.gyazo.com/3724268d75f91481ba2badf68ae6019b.png)

written this way:
```
Tree tree = new Tree(5); //index 0

tree.root.setLeftSubNode(3);  //index 1
tree.root.getLeftSubNode().setLeftSubNode(2); //index 2 and so on
tree.root.getLeftSubNode().setRightSubNode(5);

tree.root.setRightSubNode(7);
tree.root.getRightSubNode().setLeftSubNode(1);
tree.root.getRightSubNode().setRightSubNode(0);

tree.root.getRightSubNode().getRightSubNode().setLeftSubNode(2);
tree.root.getRightSubNode().getRightSubNode().setRightSubNode(8);

tree.root.getRightSubNode().getRightSubNode().getRightSubNode().setRightSubNode(5);
```

will be like:

![](https://i.gyazo.com/e300ffc0e5517382fea2ddd3e2416742.png)

We can do it other way, eg. from left to right by each row.

## Functions
Almost every function is using recursion and is getting deeper into every node to exam it, sum/count/whatever and return with that value/list.

### Public ```Tree``` functions:
This functions are available to user to get informations about subtree.

```Index 0 - root is a whole tree```

#### 1. Summing up a subtree by index.

```sumSubtreeByIndex(int index)```

This function returns us a sum of all values that are stored in subtree with given index.

#### 2. Average from subtree by index.

```averageValueByIndex(int index)```

This function returns us an average from all values that are stored in subtree with given index.

#### 3. Median from subtree by index.

```medianValueByIndex(int index)```

This function returns us a median from all values that are stored in subtree with given index.


##### All of those functions use a helpers functions described bellow

### Private helper ```Tree``` functions:

```findNodeByIndex(int index)```

This function returns a Node that is pointed by index.

To do this it uses next function that is actually finding this node.:

```findNodeByIndexRecursion(Node node, int index)``` 

```
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
```

```sumSubtree(Node node)``` that is actually summing up this node.
```
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
```

To count average we need to know size of node:

```sizeOfTree(Node node)```
```
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
```

To get the median we need to get the list of elements i whole node:

```listOfValues(Node node)```
```
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
```

All this helper functions allows us to get requester result.