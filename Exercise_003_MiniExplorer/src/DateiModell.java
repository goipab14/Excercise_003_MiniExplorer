
import java.io.File;
import java.util.ArrayList;
import javax.swing.AbstractListModel;

/**
 *
 * @author Pascal
 */
public class DateiModell extends AbstractListModel {

    private ArrayList<Datei> dateien = new ArrayList();
    FileComparer fc = new FileComparer();

    @Override
    public int getSize() {
        return dateien.size();
    }

    @Override
    public Object getElementAt(int index) {
        return dateien.get(index);
    }

    public void add(Datei datei) {
        dateien.add(datei);
        this.fireContentsChanged(dateien, 0, dateien.size() - 1);
    }

    public void remove(int index) {
        dateien.remove(index);
        this.fireContentsChanged(dateien, 0, dateien.size() - 1);
    }

    public ArrayList<Datei> getDateien() {
        return dateien;
    }

    public void setDateien(ArrayList<Datei> dateien) {
        this.dateien = dateien;
    }

    public void changeDir(File selectedValue) {
        dateien = fc.compare(selectedValue);
        super.fireContentsChanged(this, 0, dateien.size());
    }
}
