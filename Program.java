import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Program {

    public static void main(String[] args) {
        StudentGroup studentGroup1 = new StudentGroup("22103");
        StudentGroup studentGroup2 = new StudentGroup("22405");
        StudentGroup studentGroup3 = new StudentGroup("22107");
        StudentGroup studentGroup4 = new StudentGroup("22303");

        Stream stream1 = new Stream();
        stream1.addGroup(List.of(studentGroup1, studentGroup2, studentGroup4));
        Stream stream2 = new Stream();
        stream2.addGroup(studentGroup3);

        Student van = new Student("Van", 4);
        Student igor = new Student("Igorechick", 1);
        Student alex = new Student("Alex", 2);
        Student alexey = new Student("Alexey", 3);
        Student andrey = new Student("andrey", 5);
        Student ignat = new Student("ignat", 6);

        studentGroup1.addStudent(van);
        studentGroup1.addStudent(alex);
        studentGroup2.addStudent(igor);
        studentGroup2.addStudent(alexey);
        studentGroup3.addStudent(andrey);
        studentGroup4.addStudent(ignat);

        Iterator<StudentGroup> iterator = new StreamIterator(stream1);

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        ArrayList<Stream> arrayList = new ArrayList<Stream>(List.of(stream1, stream2));
        System.out.println(arrayList);

        Collections.sort(arrayList, new StreamComparator());
        System.out.println(arrayList);
    }

}