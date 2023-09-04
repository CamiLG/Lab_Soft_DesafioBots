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
		this.aStrategy.onRun();
	}
	
	@Override
	public void onScannedRobot() {
		this.aStrategy.onScannedRobot();
	}

	@Override
	public void onHitByBullet() {
		this.aStrategy.onHitByBullet();
	}

	 @Override
	 public void onHitWall() {
		this.aStrategy.onHitWall();
	}	
	 public void onHitRobot() {
			this.aStrategy.onHitRobot();
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


	 

}
