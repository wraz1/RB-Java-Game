import java.util.Random;
public class Spawn {
    private Handler handler;
    private HUD hud;
    private int scoreKeep = 0;
    Random rand = new Random();

    public Spawn(Handler handler, HUD hud){
        this.handler = handler;
        this.hud = hud;
    }
    public void tick(){
        scoreKeep++;
        
        if (scoreKeep>=500){
            hud.setLevel(hud.getLevel());
            newEnemy(); 
            
            if(hud.getLevel()%2==0)handler.addObject(new FastEnemy(rand.nextInt(600),rand.nextInt(450), ID.FastEnemy, handler));
            scoreKeep=0;
        }
    }
    public void newEnemy(){
        handler.addObject(new BasicEnemy(rand.nextInt(600),rand.nextInt(450), ID.BasicEnemy, handler));   
    }
}
