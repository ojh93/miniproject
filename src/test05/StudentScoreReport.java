package test05;

import test05.Student;

public class StudentScoreReport {
	public static void main(String[] args) {
		
	     Student[] studentPoint = new Student[10];
	
		
		studentPoint[0] = new Student(" 학생1",100,70,80);
		studentPoint[1] = new Student("학생2", 70,80,60);
		studentPoint[2] = new Student("학생3", 80,70,70);
		studentPoint[3] = new Student("학생4", 60,80,80);
		studentPoint[4] = new Student("학생5", 50,60,70);
		studentPoint[5] = new Student("학생6", 70,50,60);
		studentPoint[6] = new Student("학생7", 90,90,50);
		studentPoint[7] = new Student("학생8", 90,80,90);
		studentPoint[8] = new Student("학생9", 80,70,90);
		studentPoint[9] = new Student("학생10",10,80,90);
		System.out.println("    ### Score Report###\n        국어 영어 수학  | 총합  평균\n-------------------------");
		for(int i = 0; i<studentPoint.length;i++) {
			
			
			System.out.printf("%s %d %d  %d | %d %.1f\n ",
					 studentPoint[i].getStudentName(),
					 studentPoint[i].getKoreanPoint(),
					 studentPoint[i].getEnglishPoint(),
					 studentPoint[i].getMathPoint(),
					 studentPoint[i].pointSum(),
					 studentPoint[i].pointAvg());
					 
			 }
	}
}