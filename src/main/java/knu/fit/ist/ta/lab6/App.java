/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package knu.fit.ist.ta.lab6;

/**
 *
 * @author Mark
 */
public class App {
    
     public static void main(String[] args) {
         
        Tree tree = new Tree();
        
        tree.add(1);
        tree.add(11);
        tree.add(8);
        tree.add(6);
        tree.add(5);
        tree.add(2);
        tree.add(4);
        tree.add(10);
        
        System.out.println(tree.containsNode(6));
        System.out.println(tree.containsNode(67));

        tree.traverseInOrder(tree.root);
        System.out.println("");
        tree.traversePreOrder(tree.root);
        System.out.println("");
        tree.traversePostOrder(tree.root);
        System.out.println("");
        tree.traverseLevelOrder(tree.root);
        System.out.println("");
        
        tree.delete(6);
        
        System.out.println(tree.containsNode(6));
        
        tree.traverseInOrder(tree.root);
        System.out.println("");
        tree.traversePreOrder(tree.root);
        System.out.println("");
        tree.traversePostOrder(tree.root);
        System.out.println("");
        tree.traverseLevelOrder(tree.root);
        System.out.println("");
                
    }
}
