
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;


public class KeyInputs extends KeyAdapter{
    
    private Handler handler;

    public KeyInputs(Handler handler){
        this.handler=handler;
        
    }

    public void keyPressed(KeyEvent e){
        int key = e.getKeyCode();
        for (int i = 0; i < handler.object.size(); i++){
            GameObject tempObject = handler.object.get(i);
            if(tempObject.getId()==ID.Player){
                //key events for player 1
                if (key == KeyEvent.VK_W) tempObject.setVelY(-4);
                if (key == KeyEvent.VK_S) tempObject.setVelY(4);
                if (key == KeyEvent.VK_A) tempObject.setVelX(-4);
                if (key == KeyEvent.VK_D) tempObject.setVelX(4);
            }
        }
        if (key == KeyEvent.VK_ESCAPE) System.exit(1);
        
    }
    public void keyReleased(KeyEvent e){
        int key = e.getKeyCode();
        for (int i = 0; i < handler.object.size(); i++){
            GameObject tempObject = handler.object.get(i);
            if(tempObject.getId()==ID.Player){
                //key events for player 1
                if (key == KeyEvent.VK_W) tempObject.setVelY(0); 
                if (key == KeyEvent.VK_S) tempObject.setVelY(0);
                if (key == KeyEvent.VK_A) tempObject.setVelX(0);
                if (key == KeyEvent.VK_D) tempObject.setVelX(0);
            }
        }
        
        
    }
    

    
    
}