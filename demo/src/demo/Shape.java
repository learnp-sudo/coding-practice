package demo;
    class Shape {
	String s;
    protected Shape() {
        System.out.println("Display-base");
    }
    public Shape(String s)
    {
    	super();
    	System.out.println(s);
    }
	protected void display(int a) {
		System.out.println("dis Shape");
		// TODO Auto-generated method stub

	}
	static {
		 System.out.println("2");
		// TODO Auto-generated method stub

	}
	{
		 System.out.println("3 normal");
			// TODO Auto-generated method s
	}

}
