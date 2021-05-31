import java.awt.*;

public class JapanFlag implements Drawable{
//  This method will draw the Japanese flag by making a rentagle using the arguments for its width and height
//    and in the middle of it, it will draw a red circle using the fill oval method with the appropriate divisions of the arguments
    @Override
    public void draw(int x, int y, int width, int height, Graphics g) {
        g.setColor(Color.white);
        g.fillRect(0,0,width ,height);
        g.setColor(Color.RED);
        g.fillOval(x+width/3,y+height/4,height/2,height/2);

    }
}
