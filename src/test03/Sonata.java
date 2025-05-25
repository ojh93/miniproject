package test03;

public abstract class Sonata {
	public String color1;
	public String tire1;
	public int displacement1;
	public String handle1;
	
	
	public String color2;
	public String tire2;
	public int displacement2;
	public String handle2;
	
	
	
	

	
	public Sonata(String color1, String tire1,int displacement1,String handle1,String color2, String tire2, int displacement2,String handle2 ){
		this.color1 = color1;
		this.color2 = color2;
		
		this.tire1 = tire1;
		this.tire2 = tire2;
		
		this.displacement1 = displacement1;
		this.displacement2 = displacement2;
		
		this.handle1 = handle1;
		this.handle2 = handle2;
	}
	
	public abstract void getSpec();
		
			
	
		
		
	}



