package demo;

class Base {
    public void print() {
        System.out.println("Base:print");
    }
}

abstract class Main2 extends Base { // #1
    public static void main(String[] args) {
        Base obj = new Base();
        obj.print(); // #2
    }
}