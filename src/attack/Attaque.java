package aquar.iom.attack;

import java.util.Vector;
import aquar.iom.defense.*;

import org.contest16.*;

public class Attaque {
	
	static Vector getAttackableEnemies(PlayerCell ourCell, PlayerCellVector cells, float comfortZone, GameParameters p) {
		Vector attackable = new Vector();
		for (int i = 0; i < cells.size(); ++i) {
            PlayerCell cell = cells.get(i);
            float distance = Distance.distanceFromCell(ourCell, cell, p);
            if (distance < comfortZone) {
            	Vector infos = new Vector();
            	// Case C
            	if (cell.getMass() < ourCell.getMass())
            	{
                	infos.add(cell.getMass());
                	infos.add(distance);
            	}
            	attackable.add(infos);
            }
        }
		return attackable;
	}
	
	static void getVirusableEnemies(Actions a, PlayerCell ourCell, PlayerCellVector cells, float comfortZone, GameParameters p) {
		for (int i = 0; i < cells.size(); ++i) {
            PlayerCell cell = cells.get(i);
            float distance = Distance.distanceFromCell(ourCell, cell, p);
            if (distance < comfortZone) {
            	// Case A, B
            	if (cell.getMass() >= ourCell.getMass())
            	{
            		a.add_create_virus_action(ourCell.getPcell_id(), cell.getPosition().getX(), cell.getPosition().getY());
            	}
            }
        }
	}

}
