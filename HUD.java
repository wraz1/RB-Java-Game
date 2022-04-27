import java.awt.Color;
import java.awt.Graphics;
public class HUD {
    public static int HEALTH = 100;
    private int colorChange = 255;
    private int score = 0;
    private int level = 1;
    public void tick(){
        if (HEALTH<0)HEALTH=0;
        colorChange = HEALTH*5/2;
        score++;
        if(score>=level*500){
            level++;
            HEALTH+=20;
            if (HEALTH>100)HEALTH=100;
        }
    }
    public void render(Graphics g){
        g.setColor(Color.gray);
        g.fillRect(15, 15, 200, 30);
        g.setColor(new Color(255-colorChange, colorChange, 0));
        g.fillRect(15, 15, HEALTH*2, 30);
        g.setColor(Color.white);

        g.drawString("Score: " + score/10, 15, 64);

        g.drawString("level: " + level, 15, 80);
    }
    /*public void Score(int score){
        this.score=score;
    }
    public int getScore(){
        return score;
    }*/
    public void setLevel(int level){
        this.level=level;
    }
    public int getLevel(){
        return level;
    }
}
