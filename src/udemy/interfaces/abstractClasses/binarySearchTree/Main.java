package udemy.interfaces.abstractClasses.binarySearchTree;

public class Main {
        public static void main(String[] args){

        MyLinkedList list = new MyLinkedList(null);

        String stingData="Darwin Brisbane Perth Melbourne Canberra Adelaide Sydney Canberra";

        String[] data =stingData.split(" ");
        for (String s: data){
            list.addItem(new Node(s));
        }
        list.traverse(list.getRoot());
    }
}
