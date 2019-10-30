import robocode.JuniorRobot;

public class My1stJuniorBot extends JuniorRobot
	{
	public void run()
		{
		while(true) 
			{
		    ahead(100);
		    turnGunLeft(360);
		    back(100);
		    turnGunRight(360);
			}
		}

	public void onScannedRobot() 
		{
		turnGunTo(scannedAngle);
		fire(1);
		}

	public void onHitByBullet() 
		{
		turnAheadLeft(100, 90 - hitByBulletBearing);
		}
	}
	
