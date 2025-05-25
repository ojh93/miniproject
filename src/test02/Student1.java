package test02;

public class Student1 extends  LunchMenu{
	public Student1(int rice, int bulgogi, int banana, int milk, int almond) {
		super(rice,bulgogi,banana,milk,almond);
	}
	public int calculate() {
		return rice+bulgogi+banana;
	}
}
