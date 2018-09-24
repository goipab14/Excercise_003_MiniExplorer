
import java.util.ArrayList;
import javax.swing.AbstractListModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pascal
 */
public class DateiModell extends AbstractListModel{

    private ArrayList<Datei> liDatein = new ArrayList<>();
    
    @Override
    public int getSize() {
        return liDatein.size();
    }

    @Override
    public Object getElementAt(int i) {
        return liDatein.get(i);
    }
    
    public void add(Datei d)
    {
        liDatein.add(d);
        fireIntervalAdded(this, liDatein.size()-1, liDatein.size()-1);
    }
}
