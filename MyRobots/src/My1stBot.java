import robocode.Robot;
import robocode.ScannedRobotEvent;

public class My1stBot extends Robot
	{
	public void run()
		{
		while(true) 
			{
		    ahead(100);
		    turnGunLeft(360);
		    back(50);
		    turnGunRight(360);
			}
		}
	
	public void onScannedRobot(ScannedRobotEvent e) 
		{
		fire(1);
		}
	}
