package Final_challenge_1;

public class TheGreatRobberyApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 City city = new City();
	        Gang theGang = new Gang();
	        Police police = new Police();
	        theGang.printGangInfo();
	        do {
	            theGang.letsRob(city.getBuildings());
	        } while (!police.catchCriminals(theGang));
	}

}
