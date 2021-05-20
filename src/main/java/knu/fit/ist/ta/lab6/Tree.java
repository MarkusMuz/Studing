/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package knu.fit.ist.ta.lab6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 *
 * @author Mark
 */
public class Tree {

    Node root;
    List<Integer> inOrder = new ArrayList<>();
    List<Integer> PreOrder = new ArrayList<>();
    List<Integer> PostOrder = new ArrayList<>();
    List<Integer> LevelOrder = new ArrayList<>();

    private Node addRecursive(Node current, int value) {
        if (current == null) {
            return new Node(value);
        }

        if (value < current.value) {
            current.left = addRecursive(current.left, value);
        } else if (value > current.value) {
            current.right = addRecursive(current.right, value);
        } else {

            return current;
        }

        return current;
    }

    public void add(int value) {
        root = addRecursive(root, value);
    }

    private boolean containsNodeRecursive(Node current, int value) {
        if (current == null) {
            return false;
        }
        if (value == current.value) {
            return true;
        }
        return value < current.value
                ? containsNodeRecursive(current.left, value)
                : containsNodeRecursive(current.right, value);
    }

    public boolean containsNode(int value) {
        return containsNodeRecursive(root, value);
    }

    private int findSmallestValue(Node root) {
        return root.left == null ? root.value : findSmallestValue(root.left);
    }

    private Node deleteRecursive(Node current, int value) {
        if (current == null) {
            return null;
        }

        if (value == current.value) {

            if (current.left == null && current.right == null) {
                return null;
            }

            if (current.right == null) {
                return current.left;
            }

            if (current.left == null) {
                return current.right;
            }

            int smallestValue = findSmallestValue(current.right);
            current.value = smallestValue;
            current.right = deleteRecursive(current.right, smallestValue);
            return current;

        }
        if (value < current.value) {
            current.left = deleteRecursive(current.left, value);
            return current;
        }
        current.right = deleteRecursive(current.right, value);
        return current;
    }

    public void delete(int value) {
        root = deleteRecursive(root, value);
    }

    public void traverseInOrder(Node node) {
        if (node != null) {
            traverseInOrder(node.left);
            this.inOrder.add(node.value);
            traverseInOrder(node.right);
        }
    }

    public void traversePreOrder(Node node) {
        if (node != null) {
            this.PreOrder.add(node.value);
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }

    }

    public void traversePostOrder(Node node) {
        if (node != null) {
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            this.PostOrder.add(node.value);
        }
    }

    public void traverseLevelOrder(Node root) {
        if (root == null) {
            return;
        }

        Queue<Node> nodes = new LinkedList<>();
        nodes.add(root);

        while (!nodes.isEmpty()) {

            Node node = nodes.remove();

            this.LevelOrder.add(node.value);

            if (node.left != null) {
                nodes.add(node.left);
            }

            if (node.right != null) {
                nodes.add(node.right);
            }
        }
    }

    private int lenOfArray(int[] Array) {
        int len = 0;
        int point = 0;

        while (point == 0 && len < Array.length) {
            if (Array[len] == Integer.MIN_VALUE) {
                point = 1;
            } else {
                len++;
            }
        }

        return len;
    }

    public int[] sortTree(int[] unsortArray) {
        int[] sortArray = new int[unsortArray.length];
        int i = 0;
        int[] leftArray = new int[unsortArray.length / 2];
        int[] rightArray = new int[unsortArray.length / 2];

        while (i < unsortArray.length / 2) {
            leftArray[i] = Integer.MIN_VALUE;
            rightArray[i] = Integer.MIN_VALUE;

            i++;
        }

        i = 0;

        Arrays.sort(unsortArray);
        int mid = unsortArray[(unsortArray.length / 2) - 1];
        sortArray[i] = mid;

        int j = 0;
        while (j < ((unsortArray.length / 2) - 1)) {
            leftArray[j] = unsortArray[j];
            j++;
        }

        int k = 0;
        j++;
        while (j < unsortArray.length) {
            rightArray[k] = unsortArray[j];
            j++;
            k++;
        }

        int leftPoint = 0;
        int rightPoint = 0;
        int leftmid = 0;
        int rightmid = 0;
        int leftLen = lenOfArray(leftArray);
        int rightLen = lenOfArray(rightArray);

        while (leftPoint == 0 || rightPoint == 0) {
            if (leftPoint == 0) {
                i++;
                int s = (leftLen / 2) - 1;
                if (s >= 0) {
                    leftmid = leftArray[s];
                    sortArray[i] = leftmid;

                    while (s < leftLen - 1) {
                        leftArray[s] = leftArray[s + 1];
                        s++;
                    }
                    leftArray[s] = Integer.MIN_VALUE;
                    leftLen--;
                } else {
                    if (leftLen == 1) {
                        leftmid = leftArray[0];
                        sortArray[i] = leftmid;
                        leftLen--;
                        leftPoint = 1;
                    }
                }
            }

            if (rightPoint == 0) {
                i++;
                int s = (rightLen / 2) - 1;
                if (s >= 0) {
                    rightmid = rightArray[s];
                    sortArray[i] = rightmid;

                    while (s < rightLen - 1) {
                        rightArray[s] = rightArray[s + 1];
                        s++;
                    }
                    rightArray[s] = Integer.MIN_VALUE;
                    rightLen--;
                } else {
                    if (rightLen == 1) {
                        rightmid = rightArray[0];
                        sortArray[i] = rightmid;
                        rightLen--;
                        rightPoint = 1;
                    }
                }
            }
        }

        return sortArray;
    }
}
