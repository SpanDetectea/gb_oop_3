import java.util.Comparator;

public class StreamComparator implements Comparator<Stream> {

    @Override
    public int compare(Stream stream1, Stream stream2) {
        return stream1.groups.size() - stream2.groups.size();
    }

}