import java.awt.*;

public class GermanyFlag implements Drawable {
    @Override
    //    This method will draw the German flag by drawing three separate rectangles each one being in one of the colors of the flag and each
//    rectangle taking one third of the flag's height
    public void draw(int x, int y, int width, int height, Graphics g) {
        g.setColor(Color.black);
        g.fillRect(x,y,width,(int)height/3);
        g.setColor(Color.red);
        g.fillRect(x,(int)y+(height/3),width,(int)height/3);
        g.setColor(Color.yellow);
        g.fillRect(x,(int)y+2*(height/3),width,(int)height/3);


    }
}
