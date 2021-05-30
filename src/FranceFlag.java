import java.awt.*;


public class FranceFlag implements Drawable{

    @Override
    public void draw(int x, int y, int width, int height, Graphics g) {
        g.setColor(Color.blue);
        g.fillRect(x,y,width/3,height);
        g.setColor(Color.white);
        g.fillRect((int)x+(width/3),y,(int)width/3,height);
        g.setColor(Color.red);
        g.fillRect((int)x+2*(width/3),y,(int)width/3,height);
    }
}
