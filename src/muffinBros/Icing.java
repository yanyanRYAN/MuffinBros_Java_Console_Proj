package muffinBros;

public class Icing extends MuffinModifier {
	Muffin muffin;  //muffin instances of Muffin type
	
	public Icing(Muffin muffin) {
		this.muffin = muffin;  //set muffin instance to muffin object
	}

	public String getMuffinDescription() {
		return muffin.getMuffinDescription() + " with icing";
	}

	public double cost() {
		return 0.30 + muffin.cost();
	}

}
