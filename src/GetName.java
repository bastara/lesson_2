import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;


// ==========================================
// GetName.java
//(C) Alexandr Frolov, 1998
// E-mail: frolov@glasnet.ru
// Web:    http://www.glasnet.ru/~frolov
// ==========================================


public class GetName extends Applet
        implements ActionListener {
    TextField tf;
    TextField tf2;
    Button btnGetName;
    Label lb;

    // ============================================
    // init
    // ============================================
    public void init() {
        tf = new TextField(30);
        btnGetName = new Button("Enter name");
        lb = new Label("Your name is: ");

        tf2 = new TextField(30);
        tf2.setEditable(false);

        setLayout(new FlowLayout());

        add(tf);
        add(btnGetName);
        add(lb);
        add(tf2);

        btnGetName.addActionListener(this);
    }

    // ============================================
    // actionPerformed
    // ============================================
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(btnGetName)) {
            tf2.setText(tf.getText());
        }
    }

    // ============================================
    // getAppletInfo
    // ============================================
    public String getAppletInfo() {
        return "Name: GetName";
    }
}