package Geeks;

class Geek2 {
    // data members of the class.
    String name;
    int id;

    // Constructor would initialize data members
    // With the values of passed arguments while
    // Object of that class created
    Geek2(String name, int id)
    {
        this.name = name;
        this.id = id;
    }
}

// Class 2
class GFG2 {
    // main driver method
    public static void main(String[] args)
    {
        // This would invoke the parameterized constructor.
        Geek2 geek1 = new Geek2("adam", 1);
        System.out.println("GeekName :" + geek1.name
                + " and GeekId :" + geek1.id);
    }
}

