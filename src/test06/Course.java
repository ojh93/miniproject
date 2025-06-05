package test06;
import java.util.ArrayList;
import java.util.List;


class Course {
    private String name;
    private List<Transcript> transcripts = new ArrayList<>();

    public Course(String name) {
        this.name = name;
    }

    public void addTranscript(Transcript transcript) {
        transcripts.add(transcript);
    }

    public String getName() {
        return name;
    }
}
