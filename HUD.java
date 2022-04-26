import java.awt.Color;
import java.awt.Graphics;
public class HUD {
    public static int HEALTH = 100;
    public void tick(){
        //if (HEALTH<0)HEALTH=0;
    }
    public void render(Graphics g){
        g.setColor(Color.gray);
        g.fillRect(15, 15, 200, 30);
        g.setColor(Color.green);
        g.fillRect(15, 15, HEALTH*2, 30);
    }
}
