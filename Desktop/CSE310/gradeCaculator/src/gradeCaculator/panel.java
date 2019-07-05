package gradeCaculator;
import java.awt.event.*; 
import java.awt.*; 
import javax.swing.*;
public class panel extends JFrame implements ActionListener{
	  // JFrame 
    static JFrame f; 
  
    // JButton 
  
    // label to diaplay text 
    static JLabel l,l2; 
    
    static JTextField t ;
    
    panel() 
    { 
    } 
    // main class 
    public static void main(String[] args) 
    { 
        // create a new frame to stor text field and button 
        f = new JFrame("Grade Calculator"); 
  
        // create a label to display text 
        l = new JLabel("Grade Calculator"); 
        l2 = new JLabel("welcome to Grade Calculator");
        // create a new buttons 
        JButton b = new JButton("Upload file"); 
        JButton b1 = new JButton("Add Grade"); 
        JButton b2 = new JButton("Delete Grade"); 
        JButton b3 = new JButton("Replace Grade"); 
        JButton  b4 = new JButton("Caulculate Grade"); 
        JButton   t1 = new JButton("submit");
        t = new JTextField(20);
        panel te = new panel(); 
        t1.addActionListener(te); 
        // create a panel to add buttons 
        JPanel p = new JPanel(new BorderLayout()); 
        JPanel p1 = new JPanel(); 
        JPanel p2 = new JPanel();
        // set Box Layout 
        
        p1.setLayout(new BoxLayout(p1, BoxLayout.Y_AXIS)); 
        p2.setLayout(new BoxLayout(p2, BoxLayout.X_AXIS));
        // add buttons and textfield to panel 
       p.add(p1,BorderLayout.WEST);
       p.add(p2,BorderLayout.NORTH);
       p.add(l2,BorderLayout.CENTER);
        p1.add(l);
        p1.add(b); 
        p1.add(b1); 
        p1.add(b2); 
        p1.add(b3); 
        p1.add(b4);
        p2.add(t);
        p2.add(t1);
        // setbackground of panel 
        p.setBackground(Color.white); 
  
        // add panel to frame 
        f.add(p); 
  
        // set the size of frame 
        f.setSize(600, 300); 
  
        f.show(); 
    } 
    public void actionPerformed(ActionEvent e) 
    { 
        String s = e.getActionCommand(); 
        if (s.equals("submit")) { 
            // set the text of the label to the text of the field 
            l2.setText(t.getText()); 
  
            // set the text of field to blank 
            t.setText("  "); 
        } 
        if(s.equals("Upload file")) { 
        	 l2.setText(t.getText());
        }
        if(s.equals("submit")) { 
            
        }
        if(s.equals("submit")) { 
            
        }
        if(s.equals("submit")) { 
            
        }
    } 
} 
 
