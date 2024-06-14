import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Stream implements Iterable<StudentGroup>{
    public List<StudentGroup> groups = new ArrayList<>();

    public void addGroup(StudentGroup group) {
        groups.add(group);
    }
    public void addGroup(List<StudentGroup> group) {
        for(StudentGroup studentGroup: group) {
            groups.add(studentGroup);
        }
    }
    public Iterator<StudentGroup> iterator() {
        return new StreamIterator(this);
    }
    @Override
    // public String toString() {
    //     return groups.toString();
    // }
    public String toString() {
        // return "Stream [groups=" + groups + "]";
        return "\nГруппы в потоке: " + groups + "\n";
    }
    
}
