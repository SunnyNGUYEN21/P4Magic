package model;

/**
 *
 * @author p1505963
 */
public class ChangeArroundsColorEffect extends Effect {

    /**
     *
     * @param line
     * @param column
     * @param game
     *
     */
    @Override
    public void playEffect(int line, int column, Game game) {

        int tile_id = game.getBoard().getTileIJ(line, column).getStatus();
        int i, j;
        // Parcours des lignes et des colonnes de la case jouée.
        for (i = -1; i <= 1; i++) {
            for (j = -1; j <= 1; j++) {
                if (line + i >= 0 && column + j >= 0 && line + i < 10 && column + j < 10) {
                    // on ignore la case jouée
                    if (i != 0 || j != 0) {
                        // Si la case selectionnée a comme statut 1, le passe a 2
                        if (game.getBoard().getTileIJ(line + i, column + j).getStatus() == 1) {
                            game.getBoard().getTileIJ(line + i, column + j).setStatus(2);
                        } // Si la case selectionnée a comme statut 2, le passe a 1
                        else if (game.getBoard().getTileIJ(line + i, column + j).getStatus() == 2) {
                            game.getBoard().getTileIJ(line + i, column + j).setStatus(1);
                        }
                    }
                }

            }
        }
    }
}
