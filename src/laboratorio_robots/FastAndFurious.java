package laboratorio_robots;


public class FastAndFurious implements RobotStrategy{

	BattleCity robot; 
	int moveAmount; // How much to move
	public FastAndFurious(BattleCity robot) {
		this.robot=robot;
		moveAmount = Math.max(robot.fieldWidth, robot.fieldHeight);
	}
	
	public void onRun() {
			// Move up the wall
			robot.ahead(moveAmount);
			// Turn to the next wall
			robot.turnRight(90);
			robot.turnGunRight(90);
			
	}
	
	public void onScannedRobot() {
		// Turn gun to point at the scanned robot
		robot.turnGunTo(robot.scannedAngle);
		robot.fire(3);
		
	}
	/**
	public void onHitWall() {
		robot.turnRight(90);
		robot.turnGunRight(90);
		
	}
	**/
	public void onHitByBullet() {
		robot.back(20);
		robot.ahead(moveAmount);
		
		if(robot.energy < 30) {
			robot.setStrategy(new EvadeRobot(robot));
		}

	}
}
