package udemy.interfaces.abstractClasses.binarySearchTree;

public class Main {
        public static void main(String[] args){

        /*MyLinkedList list = new MyLinkedList(null);

        //String stingData="Darwin Brisbane Perth Melbourne Canberra Adelaide Sydney Canberra";

        String stingData="5 7 3 9 8 2 1 0 4 6";

        String[] data =stingData.split(" ");
        for (String s: data){
            list.addItem(new Node(s));
        }
        list.traverse(list.getRoot());
        list.removeItem(new Node("3"));
        list.traverse(list.getRoot());

        list.removeItem(new Node("5"));
        list.traverse(list.getRoot());

        list.removeItem(new Node("0"));
        list.removeItem(new Node("4"));
        list.removeItem(new Node("2"));
        list.traverse(list.getRoot());*/

                SearchTree tree = new SearchTree(null);

                //String stingData="Darwin Brisbane Perth Melbourne Canberra Adelaide Sydney Canberra";

                String stingData="5 7 3 9 8 2 1 0 4 6";

                String[] data =stingData.split(" ");
                for (String s: data){
                        tree.addItem(new Node(s));
                }
                tree.traverse(tree.getRoot());
                tree.removeItem(new Node("3"));
                tree.traverse(tree.getRoot());

                tree.removeItem(new Node("5"));
                tree.traverse(tree.getRoot());

                tree.removeItem(new Node("0"));
                tree.removeItem(new Node("4"));
                tree.removeItem(new Node("2"));
                tree.traverse(tree.getRoot());
    }
}
