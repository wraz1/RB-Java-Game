import java.awt.Color;
import java.awt.AlphaComposite;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
public class Trail extends GameObject {
    private float alpha = 1, life;
    private Handler handler;
    private Color color;
    private int width, height;
    

    public Trail(int x, int y, ID id, Color color, int width, int height, float life, Handler handler) {
        super(x, y, id); 
        this.handler = handler;
        this.color = color;
        this.width=width;
        this.height=height;
        this.life=life;
    }
    public Rectangle getBounds(){
        return null;
    }
    
    //screen size is 640*480
    public void tick() {
        if(alpha > life){
            alpha-= life - 0.001f;
        }
        else handler.remoceObject(this);
    }
    public void render (Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setComposite(makeTransparent(alpha));

        g.setColor(color);
        g.fillRect(x, y, width, height);

        g2d.setComposite(makeTransparent(1));
    }
    private AlphaComposite makeTransparent(float alpha){
        int type = AlphaComposite.SRC_OVER;
        return(AlphaComposite.getInstance(type, alpha));
    }
}
