import java.awt.*;

public class JapanFlag implements Drawable{

    @Override
    public void draw(int x, int y, int width, int height, Graphics g) {
        g.setColor(Color.white);
        g.fillRect(0,0,width ,height);
        g.setColor(Color.RED);
        g.fillOval(x+width/3,y+height/4,height/2,height/2);

    }
}
