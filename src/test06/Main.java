package test06;
public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("홍길동");
        Student student2 = new Student("홍길서");
        Student student3 = new Student("홍길남");

        Course course1 = new Course("Software Engineering");
        Course course2 = new Course("Design Pattern");

        Transcript transcript1 = new Transcript(student1, course1);
        transcript1.setGrade("A+");
        

        Transcript transcript2 = new Transcript(student2, course2);
        transcript2.setGrade("C+");
      

        Transcript transcript3 = new Transcript(student3, course2);
        transcript3.setGrade("A+");
       
        System.out.println(course1.getName());
        System.out.println(course2.getName());
        System.out.println(student1.getName());
        System.out.println(student2.getName());
        System.out.println(student3.getName());
        System.out.println(student1.getName() + " " + transcript1.getCourse().getName() + " " + transcript1.getGrade());
        System.out.println(student2.getName() + " " + transcript2.getCourse().getName() + " " + transcript2.getGrade());
        System.out.println(student3.getName() + " " + transcript3.getCourse().getName() + " " + transcript3.getGrade());
    }
}
