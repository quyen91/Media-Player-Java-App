

package music.player;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import javazoom.jl.player.Player;

/**
 *
 * @author caovan
 */
public class MusicPlayer {

   
    public static void main(String[] args) {
        String filename = "C:\\Users\\caovan\\Documents\\NetBeansProjects\\music player\\src\\music\\player\\thich_em.mp3";
        try {
            BufferedInputStream buf  = new BufferedInputStream(new FileInputStream(filename));
            try {
                Player root = new Player(buf);
                root.play();
                
            } catch (Exception e) {
            }
            
        } catch (Exception e) {
        }
    }
    
}
