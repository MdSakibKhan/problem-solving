import sun.awt.image.ImageWatched;

import java.util.LinkedList;


public class PrintListReverse {

    static void printReversedList(CustomNode node){
        if(node == null) return;
        printReversedList(node.next);
        System.out.println(node.value);
    }

    public static void main(String[] args){
        CustomNode root = new CustomNode(null, 1);

        CustomNode firstNode = new CustomNode(null, 2);
        CustomNode secondNode = new CustomNode(null, 3);

        CustomNode tempHead = root;
        tempHead.next = firstNode;
        tempHead = firstNode;
        tempHead.next = secondNode;

        printReversedList(root);
    }
}
