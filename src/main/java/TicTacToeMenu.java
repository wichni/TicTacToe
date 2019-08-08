
import java.util.Arrays;


public class TicTacToeMenu extends Menu {
    public final static String PLAY_WITH_COMPUTER = "Player vs Computer";
    public final static String PLAYER_VS_PLAYER = "Player vs Player";
    public final static String EXIT = "Quit";


    public TicTacToeMenu() {
        addElement(PLAY_WITH_COMPUTER);
        addElement(PLAYER_VS_PLAYER);
        addElement(EXIT);
    }
}
