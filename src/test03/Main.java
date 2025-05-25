package test03;



public class Main {

	public static void main(String[] args) {
		
		SonataHighGrade sonatahigh = new SonataHighGrade("blue","normal",2000,"power");
		SonataLowGrade sonatalow = new SonataLowGrade("red","wide",2500,"power");
		
		
		System.out.println("************************");
		System.out.println("색상:"+sonatahigh.color1+"\n타이어:"+sonatahigh.tire1+"\n배기량:"+sonatahigh.displacement1+"\n핸들:"+sonatahigh.handle1);
		sonatahigh.getSpec();
		System.out.println("************************");
		System.out.println("색상:"+sonatalow.color1+"\n타이어:"+sonatalow.tire1+"\n배기량:"+sonatalow.displacement1+"\n핸들:"+sonatalow.handle1);
		sonatalow.getSpec();
		System.out.println("************************");
	}

}
