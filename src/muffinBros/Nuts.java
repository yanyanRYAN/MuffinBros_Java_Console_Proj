package muffinBros;

public class Nuts extends MuffinModifier {
	Muffin muffin;

	public Nuts(Muffin muffin) {
		// TODO Auto-generated constructor stub
		this.muffin = muffin;
	}

	
	public String getMuffinDescription() {
		// TODO Auto-generated method stub
		return muffin.getMuffinDescription() + " with nuts";
	}

	
	public double cost() {
		// TODO Auto-generated method stub
		return 0.40 + muffin.cost();
	}

}
