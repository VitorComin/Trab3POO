import javax.swing.*;
import java.awt.Dimension;
import javax.swing.BorderFactory;

public class Window extends JFrame {

    private JPanel panel;

    private Tasks Tasks;

    public Window(){

        setTitle("Tasks");
        setSize(600,600);
        setLocation(600, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Tasks = new Tasks();
        windowConfig();
        setVisible(true);
    }

    private void windowConfig() {

        panel = new JPanel();
        GroupLayout Layout = new GroupLayout(panel);
        Layout.setAutoCreateGaps(true);
        Layout.setAutoCreateContainerGaps(true);
        panel.setLayout(new BoxLayout(panel,BoxLayout.Y_AXIS));
        JScrollPane scrollPane = new JScrollPane(panel);

        JLabel Inbox = new JLabel("Inbox");
        Dimension size = Inbox.getPreferredSize();
        Inbox.setLayout(null);
        Inbox.setBounds(150, 100, size.width, size.height);
        panel.add(Inbox);

        JButton Buttom = new JButton("Create New Task");
        panel.add(Box.createVerticalStrut(20));
        panel.add(Box.createHorizontalStrut(190));
        panel.add(Buttom);

        StringLista();
        add(scrollPane);

        panel.setBorder(
                BorderFactory.createCompoundBorder(
                        BorderFactory.createCompoundBorder(
                                BorderFactory.createTitledBorder("Tasks"),
                                BorderFactory.createEmptyBorder(10,10,10,10)),
                                panel.getBorder()));
    }

    private void StringLista(){

        for(String s : Tasks.listN()){
            panel.add(criarItemDaLista(s));
            panel.add(Box.createVerticalStrut(10));
            panel.add(Box.createHorizontalStrut(30));

        }

    }

    private JPanel criarItemDaLista(String item){
        
        JPanel panelB = new JPanel();
        JLabel label = new JLabel(item);

        JCheckBox CheckBox = new JCheckBox("");
        CheckBox.setSelected(true);
        panelB.add(CheckBox);

        panelB.setBorder(BorderFactory.createEtchedBorder());
        panelB.add(label);
        return panelB;


    }

}