import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
//import java.util.Random;
public class BasicEnemy extends GameObject {
    private Handler handler;

    public BasicEnemy (int x, int y, ID id, Handler handler) {
        super(x, y, id); 
        this.handler = handler;
        //Random rand = new Random();
        velX=3;
        velY=3;
    }
    public Rectangle getBounds(){
        return new Rectangle(x,y,32,32);
    }
    //screen size is 640*480
    public void tick() {
        x += velX;
        y += velY;
        if(x<0||x>608) velX *=-1;
        if(y<0||y>432) velY *=-1;
        handler.addObject(new Trail(x, y, ID.Trail, Color.red, 16, 16, 0.03f, handler));
    }
    public void render (Graphics g) {
        g.setColor(Color.red);
        g.fillRect(x, y, 16, 16);
    }
}