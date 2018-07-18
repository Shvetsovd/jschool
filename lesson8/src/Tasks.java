import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Tasks {
}


class Lambda{
    public static void main(String[] args) {
        getDirectories(new File("C:\\"), new ArrayList<>())
                .forEach(System.out::println);
    }
    static List<File> getDirectories(File file, List<File> dirs){
        File[] files = file.listFiles(File::isDirectory);
        if (files != null) {
            for (File f : files) {
                getDirectories(f, dirs);
            }
        }
        return dirs;
    }
}

class StreamTest{
    
}