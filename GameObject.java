//package GameDev;
import java.awt.Graphics;
import java.awt.Rectangle;
public abstract class GameObject{
    protected int x, y;
    protected ID id;
    protected int velX, velY;

    public GameObject(int x, int y, ID id){
        this.x = x;
        this.y = y;
        this.id = id;
    }

    public abstract void tick();//methods
    public abstract void render(Graphics g);//since its abstract when we extend this file to a player class then we can use these methods
    public abstract Rectangle getBounds();

    public void setX(int x){//when ever we call for this function what ever we put as setX or setY it would change its value to that
        this.x = x;
    }
    public void setY(int y){
        this.y = y;
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    public void setId(ID id){
        this.id = id;
    }
    public ID getId(){
        return id;
    }
    public void setVelX(int velX){
        this.velX = velX;
    }
    public void setVelY(int velY){
        this.velY = velY;
    }
    public int getVelX(){
        return velX;
    }
    public int getVelY(){
        return velY;
    }
}