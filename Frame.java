import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Frame 
{
    public static JPanel panel = new JPanel();
    public static JButton button = new JButton("Start");
    public static JButton button2 = new JButton("Custom Text");
    public static JLabel label = new JLabel("Sam's Speed Reader", SwingConstants.CENTER);
    public static JLabel label2 = new JLabel("Input Speed:", SwingConstants.CENTER);
    public static JFrame test = new JFrame(); 
    public static JTextArea textArea = new JTextArea("150");
    public static String input = "";
    public static void main()
    {
        Toggle t = new Toggle();
        panel.setBounds(800, 800, 800, 800); //x,y,width,height
        button.setBounds(150, 600, 200, 50);
        button2.setBounds(400, 600, 200, 50);
        label.setBounds(0, 200, 800, 300);
        label.setFont(new Font("Serif", Font.BOLD, 80));
        label2.setBounds(178, 500, 300, 50);
        label2.setFont(new Font("Serif", Font.BOLD, 30));
        textArea.setBounds(440,518,70,20);
        
        panel.add(button);
        panel.add(button2);
        panel.add(label);
        panel.add(label2);
        panel.add(textArea);
        
        panel.setLayout(null);
        textArea.setLayout(null);
        label.setLayout(null);
        label2.setLayout(null);
        test.add(panel);
        /////////////////////////////////////////////
        button.addActionListener( new ActionListener(){@Override
        public void actionPerformed(ActionEvent e)
        {
            t.setSpeed(Integer.parseInt(textArea.getText()));
            t.setTrue();
        }});
        button2.addActionListener( new ActionListener(){@Override
        public void actionPerformed(ActionEvent e)
        {
            input = JOptionPane.showInputDialog("Input Custom Text");
            t.setCustom();
            t.setString(input);
        }});
        /////////////////////////////////////////////
        test.setSize(800, 800);
        test.setTitle("Speed Reader");
        test.setLocationRelativeTo(null);
        test.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        test.setVisible(true);
    }

}