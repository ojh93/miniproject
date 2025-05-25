package test02;

public class MainClass {

	public static void main(String[] args) {
		LunchMenu student1= new Student1(Price.RICE, Price.BULGOGI, Price.BANANA,Price.MILK,Price.ALMOND);
		LunchMenu student2= new Student2(Price.RICE, Price.BULGOGI, Price.BANANA,Price.MILK,Price.ALMOND);
	System.out.println("Student1 식비는"+ student1.calculate() +"입니다");
	System.out.println("Student2 식비는"+ student2.calculate() +"입니다");
		
	
	}
	
	
	

}
