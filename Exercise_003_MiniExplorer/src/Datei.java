import java.io.File;
import java.text.SimpleDateFormat;

/**
 *
 * @author Pascal
 */
public class Datei extends File {

    private String name = "..";
    private long size;
    private String attribute = "";
    private static final SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy hh:mm");

    public Datei(File file, String child) {
        super(file.getAbsolutePath());
        name = child;

        if (isFile()) {
            size = child.length();
            size /= 1000;

            if (canRead()) {
                attribute += "R";
            }
            if (canWrite()) {
                attribute += "W";
            }
            if (canExecute()) {
                attribute += "E";
            }
            if (isHidden()) {
                attribute += "H";
            }
        }
    }

    @Override
    public String toString() {
        if (isDirectory()) {
            return getName();
        }
        return name + "           " + sdf.format(lastModified()) + "           " + size + " KB     " + attribute;
    }

    @Override
    public String getName() {
        return name;
    }

}
