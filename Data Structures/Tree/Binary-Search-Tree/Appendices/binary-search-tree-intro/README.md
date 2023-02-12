## Binary Search Tree(BST) 🤔

Binary search tree is a data structure that quickly allows us to **maintain a sorted list** of numbers.

1. It is called a binary tree because each tree node has a `maximum of two children`.
2. It is called a search tree because it can be used to search for the presence of a number in `O(log(n))` time.

The properties that separate a binary search tree from a regular binary tree is

* All nodes of left subtree are less than the root node
* All nodes of right subtree are more than the root node
* Both subtrees of each node are also BSTs i.e. they have the above two properties

<img src="img.PNG" alt="Quick Sort Algorithm" width="800"/>

### Search Operation

The algorithm depends on the property of BST that if each left subtree has values below root and each right
subtree has values above the root.

* If the value is below the root, we can say for sure that the value is not in the right subtree; we need to
  only search in the left subtree and
* if the value is above the root, we can say for sure that the value is
  not in the left subtree; we need to only search in the right subtree.

**Algorithm**

```java
if root==NULL
        return NULL;
        if number==root->data
        return root->data;
        if number<root->data
        return search(root->left)
        if number>root->data
        return search(root->right)
```

**Time complexity**: O(h), where h is the height of the BST.

**Space complexity**: O(h), where h is the height of the BST. This is because the maximum amount of space needed to
store the recursion stack would be h.

### Insert Operation

Inserting a value in the correct position is similar to searching because we try to maintain the rule that the
left subtree is lesser than root and the right subtree is larger than root.

We keep going to either right subtree or left subtree depending on the value and when we reach a point left or
right subtree is null, we put the new node there. A **new key is always inserted at the leaf**.

**Algorithm**

```java
if node==NULL
        return createNode(data)
        if(data<node->data)
        node->left=insert(node->left,data);
        else if(data>node->data)
        node->right=insert(node->right,data);
        return node;
```

### Deletion Operation

There are three cases for deleting a node from a binary search tree.

#### Case I:

In the first case, the node to be deleted is the leaf node. In such a case, simply delete the node from the tree.

#### Case II

In the second case, the node to be deleted lies has a single child node. In such a case follow the steps below:

1. Replace that node with its child node.
2. Remove the child node from its original position.

#### Case III

In the third case, the node to be deleted has two children. In such a case follow the steps below:

1. Get the inorder successor of that node.
2. Replace the node with the inorder successor.
3. Remove the inorder successor from its original position.

> **Inorder predecessor**: Largest node of the left subtree<br>
> **Inorder successor**: smallest node of the right subtree

### Binary Search Tree Complexities

##### Time Complexity

| Operation  | Best Case Complexity | Average Case Complexity | Worst Case Complexity |
|:----------:|:--------------------:|:-----------------------:|:---------------------:|
|   Search   |       O(log n)       |        O(log n)         |         O(n)          |
| Insertion  |       O(log n)       |        O(log n)         |         O(n)          |
|  Deletion  |       O(log n)       |        O(log n)         |         O(n)          |

Here, `n` is the number of nodes in the tree.

##### Space Complexity

The space complexity for all the operations is `O(n)`.

[//]: # (adding additional margin from bottom)
<br>
<br>
<br>
<br>

