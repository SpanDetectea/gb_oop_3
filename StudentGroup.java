import java.util.Iterator;

public class StudentGroup implements Iterable<Student> {

    public StringBuilder students = new StringBuilder();
    private String groupName;

    public StudentGroup(String groupName) {
        this.groupName = groupName;
    }

    public void addStudent(Student student) {
        students.append(student).append(" ");
    }

    @Override
    public Iterator<Student> iterator() {
        return new StudentGroupIterator(this);
    }

    public StringBuilder getStudents() {
        return students;
    }

    public String getGroupName() {
        return groupName;
    }

    @Override
    public String toString() {
        // return "StudentGroup [students=" + students + ", groupName=" + groupName + "]";
        return "\nГруппа № " + groupName + ", Студенты: " + students + "\n";
    }
    
    
}
