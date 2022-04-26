import java.awt.Color;
import java.awt.Graphics;
//import java.awt.Graphics2D;
import java.awt.Rectangle;
//import java.util.Random;
public class Player extends GameObject {
    Handler handler;
    public Player(int x, int y, ID id, Handler handler) {
        super(x, y, id); 
        this.handler = handler;
        //Random rand = new Random();
        //velX=rand.nextInt(5)-2;
        //velY=rand.nextInt(5)-2;
    }
    public Rectangle getBounds(){
        return new Rectangle(x,y,32,32);
    }
    private void collision(){
        for (int i = 0; i < handler.object.size(); i++) {
            GameObject tempoObject = handler.object.get(i);
            if (tempoObject.getId() == ID.BasicEnemy){
                if (getBounds().intersects(tempoObject.getBounds())){
                    HUD.HEALTH -=2;
                }
            }
        }
    }
    //screen size is 640*480
    public void tick() {
        x += velX;
        y += velY;
        if (x>640){
            x=-32;
        }
        if (y>448){
            y=-32;
        }
        if (x<-32){
            x=640;
        }
        if (y<-32){
            y=448;
        }
        collision();
    }
    public void render (Graphics g) {

        g.setColor(Color.green);
        g.fillRect(x, y, 32, 32);
    }
}