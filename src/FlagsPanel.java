import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class FlagsPanel extends JPanel {
    Drawable[][] flags;
    public FlagsPanel(int rows, int cols){
        flags = new Drawable[rows][cols];
        for(int i=0;i<flags[0].length;i++){
            for(int j=0;j<flags.length;j++){
                Random randomnum = new Random();
                int random = randomnum.nextInt(3);
                if(random==0)
                    flags[i][j]=new FranceFlag();
                else if(random==1)
                    flags[i][j]=new GermanyFlag();
                else if(random==2)
                    flags[i][j]=new JapanFlag();
            }
        }
    }

    public void paint(Graphics g){
        super.paintComponent(g);
        int width= getWidth();
        int height = getHeight();
        int flagrows = width/flags[0].length;
        int flagcols = height/flags.length;

        for(int i=0,r=0;i<flags[0].length&&r<width;i++,r+=flagrows){
            for(int j=0, c=0;j<flags.length&&c<height;j++, c+=flagcols){
               flags[i][j].draw(r,c,flagrows,flagcols,g);
            }
        }
    }

}
