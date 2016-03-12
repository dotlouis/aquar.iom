package aquar.iom.defense;

import org.contest16.*;


/**
 * 
 * enemies = Defense.getDangerousEnemies(cell, s.ennemy_player_cells(), 2O)
 * 
 * matrice = getDodgingMove(enemies)
 *
 */

public class Defense {

	static PlayerCellVector getDangerousEnemies(PlayerCell ourCell, PlayerCellVector ennemy_pcells, int comfortZone, GameParameters p) {
		PlayerCellVector dangerous = new PlayerCellVector();
		for (int i = 0; i < ennemy_pcells.size(); ++i) {
            PlayerCell cell = ennemy_pcells.get(i);
            float distance = Distance.distanceFromCell(ourCell, cell, p);
            if (distance < comfortZone) {
            	dangerous.add(cell);
            }
        }
		return dangerous;
	}
	
	//static int[] getDodgingMove(PlayerCellVector enemies) {
	//	return [1];
	//}
}
