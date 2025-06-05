package test06;
import java.util.ArrayList;
import java.util.List;



class Student {
    private String name;
    private List<Transcript> transcripts = new ArrayList<>();

    public Student(String name) {
        this.name = name;
    }

    public void addTranscript(Transcript transcript) {
        transcripts.add(transcript);
    }

    public List<Course> getCourses() {
        List<Course> courses = new ArrayList<>();
        for (Transcript transcript : transcripts) {
            courses.add(transcript.getCourse());
        }
        return courses;
    }

    public String getName() {
        return name;
    }
}
