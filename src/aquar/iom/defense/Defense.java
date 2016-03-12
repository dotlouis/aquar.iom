package aquar.iom.defense;

import org.contest16.*;
import java.util.Vector;

/**
 * 
 * enemies = Defense.getDangerousEnemies(cell, s.ennemy_player_cells(), 2O)
 * 
 * matrice = getDodgingMove(enemies)
 *
 */

public class Defense {

	static Vector getDangerousEnemies(PlayerCell ourCell, PlayerCellVector ennemy_pcells, float comfortZone, GameParameters p) {
		Vector dangerous = new Vector();
		for (int i = 0; i < ennemy_pcells.size(); ++i) {
            PlayerCell cell = ennemy_pcells.get(i);
            float distance = Distance.distanceFromCell(ourCell, cell, p);
            if (distance < comfortZone) {
            	Vector infos = new Vector();
            	infos.add(cell.getMass());
            	infos.add(distance);
            	dangerous.add(infos);
            }
        }
		return dangerous;
	}
	
	static Vector getDangerousViruses(PlayerCell ourCell, VirusVector viruses, float comfortZone, GameParameters p) {
		Vector dangerous = new Vector();
		for (int i = 0; i < viruses.size(); ++i) {
            Virus cell = viruses.get(i);
            float distance = Distance.distance(ourCell.getPosition(), cell.getPosition());
            if (distance < comfortZone) {
            	Vector infos = new Vector();
            	infos.add(0);
            	infos.add(distance);
            	dangerous.add(infos);
            }
        }
		return dangerous;	
	}
	
	
	/*static Vector getMatrice(PlayerCell ourCell, GameParameters p, Session s) {
		float comfortZone = Distance.maxDistanceMoves(ourCell, p);
		Vector enemies = Defense.getDangerousEnemies(ourCell, s.ennemy_player_cells(), comfortZone, p);
		Vector viruses = Defense.getDangerousViruses(ourCell, s.viruses(), comfortZone, p);
		
		return enemies.addAll(viruses);
	}*/
}
