/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tree;

import backend.Task;

/**
 *
 * @author alekc
 */
public class Node {
    private Task object;
    private Node leftChild, rightChild;

    public Node(Task object) {
        this.object = object;
    }

    public Task getObject() {
        return object;
    }

    public void setObject(Task object) {
        this.object = object;
    }

    public Node getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(Node leftChild) {
        this.leftChild = leftChild;
    }

    public Node getRightChild() {
        return rightChild;
    }

    public void setRightChild(Node rightChild) {
        this.rightChild = rightChild;
    }
}
