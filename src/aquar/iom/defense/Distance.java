package aquar.iom.defense;

import org.contest16.*;

public class Distance {

	/*
	 * Compute comfort zone radius
	 * 
	 * max_speed = max(0, base_cell_speed - speed_loss_factor * C.mass)
	 * getPlayer_cells_starting_mass
	 * getBase_cell_speed
	 * getSpeed_loss_factor
	 */
	public static float maxDistanceMoves(PlayerCell cell, GameParameters p) {
		float distanceAsCase = cell.getMass() * p.getRadius_factor();;
		float max_speed = Math.max(0, p.getBase_cell_speed() - p.getSpeed_loss_factor() * p.getPlayer_cells_starting_mass());
		return max_speed * distanceAsCase;
	}
	
	
	public static float distance(Position pos1, Position pos2) {
		return (float) Math.sqrt(
	            Math.pow(pos1.getX() - pos2.getX(), 2) +
	            Math.pow(pos1.getY() - pos2.getY(), 2) );
	}
	
	public static float distanceFromCell(PlayerCell ourCell, PlayerCell otherCell, GameParameters p) {
		float ourX = ourCell.getPosition().getX();
		float ourY = ourCell.getPosition().getY();
		float otherX = otherCell.getPosition().getX();
		float otherY = otherCell.getPosition().getY();
		
		float otherDelta = Distance.maxDistanceMoves(otherCell, p);
		
		float distance1 = (float) Math.sqrt(
	            Math.pow(ourX - (otherX + otherDelta), 2) +
	            Math.pow(ourY - (otherY + otherDelta), 2) );
		
		float distance2 = (float) Math.sqrt(
	            Math.pow(ourX - (otherX - otherDelta), 2) +
	            Math.pow(ourY - (otherY - otherDelta), 2) );
		
		float worseDistance = Math.min(distance1, distance2);
		
		return worseDistance;
	}
	
}
