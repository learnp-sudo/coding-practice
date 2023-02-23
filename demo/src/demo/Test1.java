package demo;

class SuperClass {
   public SuperClass() {
        foo();
    }

    public void foo() {
        System.out.println("In SuperClass.foo()");
    }
}

class SubClass extends SuperClass {
    private String member;

    public SubClass() {
        member = "HI";
        System.out.println("cons");
    }

    public void foo() {
        System.out.println("In SubClass.foo(): " );
    }
}

public class Test1 {
    public static void main(String[] args) {
        SuperClass reference = new SubClass();
        reference.foo();
    }
}