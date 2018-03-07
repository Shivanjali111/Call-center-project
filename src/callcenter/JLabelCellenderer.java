package callcenter;

import java.awt.Color;
import java.awt.Component;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;

class JLabelCellenderer extends JLabel implements TableCellRenderer {
 
    public JLabelCellenderer(Home h, JTable t) {
        setOpaque(true);
        setBackground(Color.WHITE);
         java.net.URL imgURL = getClass().getResource("/icons/del.png");
         this.setIcon(new ImageIcon(imgURL));
    }
 
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
      //  setText((String) value);
        if(isSelected){setBackground(new Color(184,207,229));}
        else{setBackground(Color.WHITE);}
        return this;
    }

}