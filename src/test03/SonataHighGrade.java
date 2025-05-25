package test03;

public class SonataHighGrade extends Sonata {
	public SonataHighGrade(String color1, String tire1, int displacement1, String handle1) {
		super(color1, tire1, displacement1, handle1,CarSpecs.COLOR2, CarSpecs.TIRE2, CarSpecs.DISPLACEMENT2, CarSpecs.HANDLE2);
	}
	
	
	

	@Override
	 public void getSpec() {
		if(displacement1>2000) {
			System.out.println("세금:"+1500+"입니다");
	}else {
		System.out.println("세금:"+1000+"입니다");
		return;
	}
	}




	
		
	}
	

	
	
	
	

