import java.awt.*;
import java.util.Scanner;
import javax.swing.JFrame;

public class DisplayGraphics extends Canvas{

    public void paint(Graphics g) {
        int x=0;
        int y=0;
        int width=50;
        int height=50;
        g.setColor(Color.black);
        g.fillRect(0,0,1000,1000);
        g.setColor(Color.white);
        g.drawLine(50,0,50,1000);
        g.drawLine(100,0,100,1000);
        g.drawLine(150,0,150,1000);
        g.drawLine(200,0,200,1000);
        g.drawLine(250,0,250,1000);
        g.drawLine(300,0,300,1000);
        g.drawLine(350,0,350,1000);
        g.drawLine(400,0,400,1000);
        g.drawLine(450,0,450,1000);
        g.drawLine(500,0,500,1000);
        g.drawLine(550,0,550,1000);
        g.drawLine(600,0,600,1000);
        g.drawLine(650,0,650,1000);
        g.drawLine(700,0,700,1000);
        g.drawLine(750,0,750,1000);
        g.drawLine(800,0,800,1000);
        g.drawLine(850,0,850,1000);
        g.drawLine(900,0,900,1000);
        g.drawLine(950,0,950,1000);

        g.drawLine(0,50,1000,50);
        g.drawLine(0,100,1000,100);
        g.drawLine(0,150,1000,150);
        g.drawLine(0,200,1000,200);
        g.drawLine(0,250,1000,250);
        g.drawLine(0,300,1000,300);
        g.drawLine(0,350,1000,350);
        g.drawLine(0,400,1000,400);
        g.drawLine(0,450,1000,450);
        g.drawLine(0,500,1000,500);
        g.drawLine(0,550,1000,550);
        g.drawLine(0,600,1000,600);
        g.drawLine(0,650,1000,650);
        g.drawLine(0,700,1000,700);
        g.drawLine(0,750,1000,750);
        g.drawLine(0,800,1000,800);
        g.drawLine(0,850,1000,850);
        g.drawLine(0,900,1000,900);
        g.drawLine(0,950,1000,950);



        g.setColor(Color.red);
        int xloc=50;
        int ylock=50;
        int xsize=50;
        int ysize=50;
        g.fillRect(xloc,ylock,xsize,ysize);
        while(true){
            g.setColor(new Color((int) (Math.random()*(255)),(int) (Math.random()*(255)),(int) (Math.random()*(255))));
            Scanner scan = new Scanner(System.in);
            System.out.println("Please enter your move");
            int num = scan.nextInt();
            if(num==8){
                ylock-=50;
                g.fillRect(xloc,ylock,xsize,ysize);
            }if(num==2){
                ylock+=50;
                g.fillRect(xloc,ylock,xsize,ysize);
            }if(num==6){
                xloc+=50;
                g.fillRect(xloc,ylock,xsize,ysize);
            }if(num==4){
                xloc-=50;
                g.fillRect(xloc,ylock,xsize,ysize);
            }
        }

    }
    public static void main(String[] args) {
        DisplayGraphics m=new DisplayGraphics();
        JFrame f=new JFrame();
        f.add(m);
        f.setSize(1000,1000);
        f.setVisible(true);



    }

}