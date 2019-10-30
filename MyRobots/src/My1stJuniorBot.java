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
		fire(3);
		}

	public void onHitByBullet() 
		{
		turnAheadLeft(100, 90 - hitByBulletBearing);
		}
	
	//use hitWallBearing instead of this
	public void onHitWall()
		{
		back(500);
		turnAheadRight(200, 180 - hitWallBearing);
		//ahead(500);
		//turnBackRight(200, 180 + hitWallBearing);
		}
	}
	
