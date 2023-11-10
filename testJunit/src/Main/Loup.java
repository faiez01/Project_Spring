package Main;

public class Loup {
	private Orientation orientation;

	public Loup() {
		orientation = Orientation.NORD;
	}

	public Orientation getOrientation() {
		return orientation;
	}

	public void tourner() {
		// Implémentez ici la logique pour faire tourner le loup dans le sens des
		// aiguilles d'une montre
		// Par exemple, pour tourner une fois dans le sens des aiguilles d'une montre :
		switch (orientation) {
		case NORD:
			orientation = Orientation.EST;
			break;
		case EST:
			orientation = Orientation.SUD;
			break;
		case SUD:
			orientation = Orientation.OUEST;
			break;
		case OUEST:
			orientation = Orientation.NORD;
			break;
		}
	}
}
