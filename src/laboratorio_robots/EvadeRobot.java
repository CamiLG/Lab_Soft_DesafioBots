package laboratorio_robots;

public class EvadeRobot implements RobotStrategy {

	BattleCity robot; 
	int moveAmount; // How much to move
	int r;
	public EvadeRobot(BattleCity robot) {
		this.robot=robot;

		robot.setColors(0xffff, 0xffff, 0xffff, 0xffff, 0xffff);
	}
	
	public void onRun() {
		moveAmount = Math.max(robot.fieldWidth, robot.fieldHeight);
		r = (int)robot.heading % 90;
		robot.turnLeft(r);
		robot.ahead(moveAmount);
		// Turn the gun to turn right 90 degrees.

		robot.turnGunRight(90);
		while (true) {
			robot.ahead(moveAmount);
		}
		}
		
	
	public void onHitByBullet() {
		//robot.turnGunTo(robot.hitByBulletAngle);
		//robot.fire();
		moveAmount = (int)((robot.fieldHeight* 20)/100);
		robot.back(moveAmount);
		if(robot.energy > 30) {
			robot.setStrategy(new FastAndFurious(robot));
		}
		
		
	
	}
	public void onScannedRobot() {
		robot.turnGunTo(robot.scannedAngle);
		robot.fire(1.8);
	}
	
	public void onHitWall() {
		robot.turnRight(90);
		robot.turnGunRight(90);
	}
	public void onHitRobot() {
	}
	
}