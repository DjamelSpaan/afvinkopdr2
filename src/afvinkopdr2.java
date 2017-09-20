
import java.awt.*; 
import java.awt.event.*;
import javax.swing.*;

public class afvinkopdr2 extends JFrame implements ActionListener {
private JButton button; 
private JPanel panel;
private JTextField textfieldx;
private JTextField textfieldy;
private JLabel label;
static int x;
static int y;
 
    public static void main(String[] args) { 
    afvinkopdr2 frame = new afvinkopdr2(); 
    frame.setSize(1000, 1000); 
    frame.setTitle("H2O");
    frame.createGUI();
    frame.setVisible(true); 
    }
    private void createGUI(){ 
        setDefaultCloseOperation(EXIT_ON_CLOSE); 
        Container window = getContentPane(); 
        window.setLayout(new BoxLayout(window, BoxLayout.Y_AXIS));
        panel = new JPanel(); 
        panel.setPreferredSize(new Dimension(500, 500)); 
        panel.setBackground(Color.white); 
        window.add(panel);
        button = new JButton("Press me..."); 
        window.add(button); 
        button.addActionListener(this);
        label = new JLabel("Enter the X-coordinate below");
        label.setPreferredSize(new Dimension(25, 25));
        window.add(label);
        textfieldx = new JTextField();
        textfieldx.setPreferredSize(new Dimension(50, 25));
        textfieldx.setBackground(Color.white); 
        window.add(textfieldx);
        label = new JLabel("Enter the Y-coordinate below");
        label.setPreferredSize(new Dimension(25, 25));
        window.add(label);
        textfieldy = new JTextField();
        textfieldy.setPreferredSize(new Dimension(50, 25));
        textfieldy.setBackground(Color.white); 
        window.add(textfieldy);
    }
    @Override
    public void actionPerformed(ActionEvent event) {
        int X = Integer.parseInt(textfieldx.getText());
        int Y = Integer.parseInt(textfieldy.getText());
        Graphics paper = panel.getGraphics();
        paper.clearRect(0, 0, 500, 500);
        paper.setColor(Color.black);
        paper.drawLine(X+50, Y+50, X+50, Y+200);
        paper.drawLine(X+50, Y+50, X+200, Y+50);
        paper.setColor(Color.blue);
        paper.fillOval(X+25, Y+175, 50, 50);
        paper.fillOval(X+175, Y+25, 50, 50);
        paper.setColor(Color.red); 
        paper.fillOval(X, Y, 100, 100);
    }
    
}    