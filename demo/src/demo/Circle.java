package demo;

     public class Circle extends Shape {
	static{
		System.out.println("Hi");
	}

    public Circle() {
        System.out.println("Display-derived");
    }
    public Circle(String s)
    {
    	super(s);
    	System.out.println("sub"+s);

    }
    {
    	System.out.println("after Hello");
    }
    public void display() {
		System.out.println("dis Circle");
		// TODO Auto-generated method stub

	}
}