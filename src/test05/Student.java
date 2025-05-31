package test05;

public class Student {
	private String studentName;
	private int koreanPoint;
	private int englishPoint;
	private int mathPoint;

public Student(String studentName, int koreanPoint,int englishPoint,int mathPoint) {
	this.studentName =studentName;
	this.koreanPoint = koreanPoint;
	this.englishPoint = englishPoint;
	this.mathPoint = mathPoint;
}

	public String getStudentName(){
		return studentName;
		}
	public int getKoreanPoint() {
		return koreanPoint;
	}
	public int getEnglishPoint() {
		return englishPoint;
	}
	public int getMathPoint() {
		return mathPoint;
	}
	
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public void setKoreanPoint(int koreanPoint) {
		this.koreanPoint = koreanPoint;
	}
	public void setEnglishPoint(int englishPoint) {
		this.englishPoint = englishPoint;
	}
	public void setMathPoint(int mathPoint) {
		this.mathPoint = mathPoint;
	
	}
	
	public int pointSum() {
	    return koreanPoint + englishPoint + mathPoint;
	}

	public double pointAvg() {
	    return (double) pointSum() / 3;
	}
	
}

		

	


		

	
