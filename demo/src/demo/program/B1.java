package demo.program;

//class A{
//A get(){return this;}
//}
//
//class B1 extends A{
//B1 get(){return this;}
//void message(){System.out.println("welcome to covariant return type");}
//
//public static void main(String args[]){
//new B1().get().message();
//}
//}
class Base
{
	final int a;//without initiallizing we cannot take final variable
	Base(){
		a=10;//we can only initialize final variable in constructor
	}
	static final int b;
	static{
		b=12;//static final variable can be declared in only static block
	}

    protected void getInfo()
    {
    	 int a=20;//we can use finalized variable by mentioning its datatype
    	 //otherwise it will show final variable compile error
        System.out.println("method of Base class");
    }
}

public class B1 extends Base
{
    protected final void getInfo()//Final method can be inheritated but cannot be override
    {
        System.out.println("method of Derived class");
    }
    public static void main(String[] args)
    {
        Base obj = new Base();
        obj.getInfo();
    }
}