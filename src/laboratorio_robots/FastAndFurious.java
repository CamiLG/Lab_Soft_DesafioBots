package laboratorio_robots;


public class FastAndFurious implements RobotStrategy{

	BattleCity robot;
	int r; 			// Grados a girar para llegar a 90
	int moveAmount; // Movimiento máximo posible
	
	public FastAndFurious(BattleCity robot) {
		this.robot=robot;
	}
	
	public void onRun() {


		robot.setColors(0xff0000, 0xff0000, 0xff0000, 0xff0000, 0xff0000);
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
	
	public void onScannedRobot() {
		robot.fire(2.2);
		
	}
	
	public void onHitWall() {

		robot.turnRight(90);
	}
	
	public void onHitByBullet() {

		robot.back(60);
		if(robot.energy < 30) {
			robot.setStrategy(new EvadeRobot(robot));
		}

	}
	public void onHitRobot() {
		robot.back(150);
		}
	}
	