/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stack;

/**
 *
 * @author alekc
 */
public class Stack {
    private Node top;
    
    public void push(Node node) {
        if (top != null) {
            node.setPrevious(top);
        }
        
        top = node;
    }

    public Node pop() {
        Node output = top;
        
        if (output != null) {
            top = output.getPrevious();
            output.setPrevious(null);
        }
        return output;
    }
}
