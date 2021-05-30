import java.awt.*;
import javax.swing.JFrame;

public class DisplayGraphics extends Canvas{

    public void paint(Graphics g) {
        int x=0;
        int y=0;
        int width=800;
        int height=500;
        g.setColor(Color.white);
        g.fillRect(0,0,width ,height);
        g.setColor(Color.RED);
        g.fillOval(x+width/3,y+height/4,height/2,height/2);

    }
    public static void main(String[] args) {
        DisplayGraphics m=new DisplayGraphics();
        JFrame f=new JFrame();
        f.add(m);
        f.setSize(1200,1200);
        f.setVisible(true);


    }

}  