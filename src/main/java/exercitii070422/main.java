package exercitii070422;

public class main {

    public static void main(String[] args) {
        box box1=new box("abc");
        String var1=(String)box1.getContents();
        System.out.println(var1);
        box1.setContents(23);
        int var2=(int)box1.getContents();
        System.out.println(var2);
        box1.setContents(new box("something"));
        box var3=(box)box1.getContents();
        System.out.println((String)var3.getContents());

        /////////////////////////////////////////////////
        //////////////////////////////////////////////////
        GenericBox<String> genericBox1=new GenericBox<>("abc");
        String var4=genericBox1.getContents();
        System.out.println(var4);
        GenericBox<Integer>genericBox2=new GenericBox<Integer>(10);
        genericBox2.setContents(100);
        //genericBox2.setContents(new Integer(100));
        GenericBox<GenericBox<String>> genericBox3=new GenericBox<GenericBox<String>>(new GenericBox<>("abc"));
        System.out.println(genericBox3.getContents().getContents());

        /////////////////////////////////////////////////
        //////////////////////////////////////////////////
        Oaie o= new Oaie();
        Mar m=new Mar();
        Farfurie<Mar> f1= new Farfurie<>(m);
        //Farfurie<Oaie> f2=new Farfurie<Oaie>(o);
        printFarfurie(f1);


    }

    public static void printFarfurie(Farfurie<? extends Fruct> f){
        System.out.println(f);
    }
}
