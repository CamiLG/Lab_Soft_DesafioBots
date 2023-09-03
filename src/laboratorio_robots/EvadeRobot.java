package laboratorio_robots;

public class EvadeRobot implements RobotStrategy {

	BattleCity robot; 
	int moveAmount; // How much to move
	public EvadeRobot(BattleCity robot) {
		this.robot=robot;
	}
	
	public void onRun() {
		// Initialize moveAmount to the maximum possible for this battlefield.
		moveAmount = Math.max(robot.fieldWidth, robot.fieldHeight);
			// Move up the wall
			robot.ahead(moveAmount);
			// Turn to the next wall
			robot.turnRight(90);
	}
	public void onHitByBullet() {
		//robot.turnGunTo(robot.hitByBulletAngle);
		//robot.fire();
		moveAmount = (int)((robot.fieldHeight* 20)/100);
		robot.back(moveAmount);
		
		
	
	}
	public void onScannedRobot() {
		robot.turnGunTo(robot.scannedAngle);
		robot.fire(1);
	}
	/**
	public void onHitWall() {
		robot.turnRight(90);
		robot.turnGunRight(90);
	}
	**/
}
