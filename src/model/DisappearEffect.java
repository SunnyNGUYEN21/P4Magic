
package model;

import java.util.logging.Logger;

/**
 *
 * @author p1505963
 */
public class DisappearEffect extends Effect {

    /**
     *
     * @param line
     * @param column
     * @param game
     */
    @Override
    public void playEffect(int line, int column, Game game) {

        int tile_id = game.getBoard().getTileIJ(line, column).getStatus();
        int player1_id = game.getPlayer1().getId();

        if (tile_id == player1_id) {
            tile_id = -1;
        } else {
            tile_id = player1_id;
        }
        game.getBoard().getTileIJ(line, column).setStatus(tile_id);
    }

}
