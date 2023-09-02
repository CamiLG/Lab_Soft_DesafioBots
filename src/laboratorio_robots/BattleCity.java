package laboratorio_robots;
import robocode.*;


public class BattleCity extends JuniorRobot
{
	private RobotStrategy aStrategy;
	
	public BattleCity() {
		aStrategy = new FastAndFurious(this);
	}
	public void setStrategy(RobotStrategy strategy){
		this.aStrategy = strategy;
	}
	
	@Override	
	public void run() {

		setColors(orange, blue, white, yellow, black);
		//estrategia(robot);
		this.aStrategy.onRun();
	}

	/**
	 * onScannedRobot: What to do when you see another robot
	 */
	@Override
	public void onScannedRobot() {
		doNothing();
	}
	
	@Override
	public void onHitRobot() {
		doNothing();
	}
	
	
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
	}	
	 */

}