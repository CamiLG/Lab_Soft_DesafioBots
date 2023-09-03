package laboratorio_robots;


public interface RobotStrategy {
	
	public void onRun();
	public void onHitByBullet();
	public void onScannedRobot();
	//public void onHitWall();
}
