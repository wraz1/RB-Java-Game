import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
//import java.util.Random;
public class FastEnemy extends GameObject {
    private Handler handler;

    public FastEnemy (int x, int y, ID id, Handler handler) {
        super(x, y, id); 
        this.handler = handler;
        //Random rand = new Random();
        velX=3;
        velY=9;
    }
    public Rectangle getBounds(){
        return new Rectangle(x,y,32,32);
    }
    //screen size is 640*480
    public void tick() {
        x += velX;
        y += velY;
        if(x<-16||x>626) velX *=-1;
        if(y<-16||y>448) velY *=-1;
        handler.addObject(new Trail(x, y, ID.Trail, new Color(128,0,128), 16, 16, 0.03f, handler));
    }
    public void render (Graphics g) {
        g.setColor(new Color(128,0,128));
        g.fillRect(x, y, 16, 16);
    }
}