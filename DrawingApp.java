
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;
import java.awt.Dimension;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import java.awt.Font;
import java.awt.FontMetrics;

public class DrawingApp {
    private JFrame frame;

    public DrawingApp() {
        frame = new JFrame("Mine Sweeper");
        frame.setSize(600, 400);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setPreferredSize(frame.getSize());
        frame.add(new DrawFace(frame.getSize()));
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String... argv) {
        new DrawingApp();
    }

    public static class DrawFace extends JPanel  implements MouseListener {
        /*
         * Declare Class Variables Here
         */
         int x = 20;
         int y = 20;
         boolean face = true;
         boolean body = true;
         boolean ear = true;
         boolean legs = true;
        public DrawFace(Dimension dimension) {
            setSize(dimension);
            setPreferredSize(dimension);
            addMouseListener(this);

        }

        @Override
        public void paintComponent(Graphics g) {
            Graphics2D g2 = (Graphics2D)g;//g2 is the graphics object that we need to use
            //to draw things to the screen
            Dimension d = getSize();
            //create a background
            g2.setColor(Color.white);
            g2.fillRect(0, 0, d.width, d.height);
            /**/
            
            Color orange = new Color(255,128,0);//instance variable orange
            //body
            if (body == true){   
                g2.setColor(Color.red);
              }
                else {
                    g2.setColor(Color.blue);
                }
           
            g2.fillOval(260, 340, 400, 200);
            
            //face
            if (face == true){   
                g2.setColor(Color.blue);
            }
                else {
                    g2.setColor(Color.red);
                }
           
            g2.fillOval(510,200, 160, 160);
            
            Color yellow = new Color(225,255, 0); //instance variable purple
            //ears 
            if (ear == true){   
                g2.setColor(Color.green);
             }
                else {
                    g2.setColor(orange);
                }
            g2.fillOval(440,200, 100, 150);
            
            g2.fillOval(660,200, 100, 150);

            //eyes
            Color purple= new Color(102,0, 102); //instance variable purple
            g2.setColor(purple);
            g2.fillOval(555, 270, 10, 10);
            g2.fillOval(645, 270, 10, 10);
            
            
            
            
            
            
            //nose
            //brown becmones a new instance of the Color class...
            Color brown = new Color(128,128,128); 
      
            g2.setColor(brown);
            g2.fillRect(590,300, 20, 200);
            
            //legs
            
            if (legs == true){   
                g2.setColor(orange);
              }
                else {
                    g2.setColor(Color.green);
                }
            
            g2.fillRect(350,525,30, 70);
            g2.fillRect(420,535,30, 50);
            g2.fillRect(490,535,30, 50);
            g2.fillRect(560,525,30, 70);
            
            //display Text
             g2.setColor(Color.red);
            g2.setFont (new Font("TimesRoman", Font.PLAIN, 20));
            g2.drawString("Color Changing Elephant" ,  x,y);//text to display, x and y coordinates



        }

        
        public void mousePressed(MouseEvent e) {
             // mousekey event used to change colors when pressed. 
            x = e.getX();
             y = e.getY(); 
             ear = true;
             body = true;
             face = true;
             legs = true;
            repaint();//updates the paint method
        }

        public void mouseReleased(MouseEvent e) {
                // mouskey event when released
             ear = false;
             body = false;
             face = false;
             legs = false;
            repaint();//updates the paint method
        }

        public void mouseEntered(MouseEvent e) {
        }

        public void mouseExited(MouseEvent e) {
        }
//DO NOT USE THE METHOD BELOW
       public void mouseClicked(MouseEvent e) {
        
        }
    }
}