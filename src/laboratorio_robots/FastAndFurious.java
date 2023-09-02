package laboratorio_robots;

public class FastAndFurious implements RobotStrategy{

	BattleCity robot; 
	boolean peek; // Don't turn if there's a robot there
	int moveAmount; // How much to move
	int r;
	public FastAndFurious(BattleCity robot) {
		this.robot=robot;
	}
	
	public void onRun() {
		// Initialize moveAmount to the maximum possible for this battlefield.
		moveAmount = Math.max(robot.fieldWidth, robot.fieldHeight);
		// Initialize peek to false
		peek = false;

		// turnLeft to face a wall.
		// getHeading() % 90 means the remainder of
		// getHeading() divided by 90.
		r = (int)robot.heading % 90;
		robot.turnLeft(r);
		robot.ahead(moveAmount);
		// Turn the gun to turn right 90 degrees.
		peek = true;
		robot.turnGunRight(90);
		robot.turnRight(90);

		while (true) {
			// Look before we turn when ahead() completes.
			peek = true;
			// Move up the wall
			robot.ahead(moveAmount);
			// Don't look now
			peek = false;
			// Turn to the next wall
			robot.turnRight(90);
		}
	}
	
	@Override
	public void onHitRobot() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onScannedRobot() {
		// TODO Auto-generated method stub
		
	}

}
