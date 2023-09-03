package laboratorio_robots;
import robocode.*;


public class BattleCity extends JuniorRobot
{
	private RobotStrategy aStrategy;
	int moveAmount;
	int r;
	public BattleCity() {
		aStrategy = new FastAndFurious(this);
	}
	public void setStrategy(RobotStrategy strategy){
		this.aStrategy = strategy;
	}
	
	@Override	
	public void run() {

		setColors(blue, red, blue, gray, black);
		//posiciona al robot
		moveAmount = Math.max(this.fieldWidth, this.fieldHeight);
		r = (int)this.heading % 90;
		this.turnLeft(r);
		this.ahead(moveAmount);
		// Turn the gun to turn right 90 degrees.
		//robot.turnGunRight(90);
		//this.turnRight(90);
		//this.turnGunRight(90);
		this.setStrategy(new FastAndFurious(this));
		
		while(true) {
			this.aStrategy.onRun();
		}
		
	}
	public void onScannedRobot() {
		this.aStrategy.onScannedRobot();
	}

	@Override
	public void onHitByBullet() {
		this.aStrategy.onHitByBullet();
	}

	/**
	 * onScannedRobot: What to do when you see another robot
	 * 
	 * 	@Override
	public void onScannedRobot() {
		doNothing();
	}
	
	@Override
	public void onHitRobot() {
		doNothing();
	}
	
	 */

	
	/**
	 * onHitByBullet: What to do when you're hit by a bullet
	 * 	@Override
	public void onHitByBullet() {
		back(10);
	}
	 */

	/**
	 * onHitWall: What to do when you hit a wall
	 * 	public void onHitWall() {
		back(20);
		this.aStrategy.onHitWall();
	}	
	 */

}