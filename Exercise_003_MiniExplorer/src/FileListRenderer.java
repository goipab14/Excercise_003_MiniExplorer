
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;

/**
 *
 * @author Pascal
 */
public class FileListRenderer implements ListCellRenderer<Datei> {

    @Override
    public Component getListCellRendererComponent(JList<? extends Datei> list, Datei value, int index, boolean isSelected, boolean cellHasFocus) {
        JLabel lb = new JLabel(value.toString());
        lb.setOpaque(true);

        if (value.isDirectory()) {
            lb.setBackground(Color.lightGray);
            lb.setForeground(Color.red);
            lb.setFont(new Font("Courier New", Font.BOLD + Font.ITALIC, 12));
        } else {
            lb.setForeground(Color.blue);
            lb.setFont(new Font("Courier New", Font.PLAIN, 12));
        }
        if (isSelected) {
            lb.setForeground(Color.WHITE);
            lb.setBackground(Color.BLACK);
        }
        return lb;
    }
}