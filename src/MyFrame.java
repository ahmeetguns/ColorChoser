import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {
   JButton button ;
   JLabel label;
   MyFrame(){

       this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       this.setLayout(new FlowLayout());
       button = new JButton();
       button.setText("Pick a color");
       button.addActionListener(this);


       label = new JLabel("This is some Text :D");
       label.setBackground(Color.white);
       label.setFont(new Font("MV Boli",Font.PLAIN,100));
       label.setOpaque(true);



       this.add(label);
       this.add(button);
       this.pack();
       this.setVisible(true);


   }
    @Override
    public void actionPerformed(ActionEvent e) {
     if (e.getSource()==button){
         JColorChooser colorChooser = new JColorChooser();
         Color color = JColorChooser.showDialog(null,"Pick a color ", Color.black);
         label.setBackground(color);

     }

    }
}
