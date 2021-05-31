import java.awt.*;


public class FranceFlag implements Drawable{

    @Override
//    This method will draw the French flag by drawing three separate rectangles each one being in one of the colors of the flag and each
//    rectangle taking one third of the flag's width
    public void draw(int x, int y, int width, int height, Graphics g) {
        g.setColor(Color.blue);
        g.fillRect(x,y,width/3,height);
        g.setColor(Color.white);
        g.fillRect((int)x+(width/3),y,(int)width/3,height);
        g.setColor(Color.red);
        g.fillRect((int)x+2*(width/3),y,(int)width/3,height);
    }
}
