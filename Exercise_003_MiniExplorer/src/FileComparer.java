
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author Pascal
 */
public class FileComparer {

    public ArrayList<Datei> compare(File newDir) {
        ArrayList<Datei> list = new ArrayList<>();
        File[] fileArray = newDir.listFiles();

        for (File f : fileArray) {
            list.add(new Datei(f, f.getName()));
        }

        list.add(new Datei(newDir.getParentFile(), ".."));

        Collections.sort(list, (Datei t, Datei t1) -> {
            if (t.isDirectory() && t1.isFile()) {
                return -1;
            }
            return t.getName().compareTo(t1.getName());
        });
        return list;
    }
}
