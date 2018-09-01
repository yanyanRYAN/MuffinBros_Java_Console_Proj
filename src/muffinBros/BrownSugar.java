package muffinBros;

public class BrownSugar extends MuffinModifier {
	Muffin muffin;

	public BrownSugar(Muffin muffin) {
		// TODO Auto-generated constructor stub
		this.muffin = muffin;
	}

	@Override
	public String getMuffinDescription() {
		// TODO Auto-generated method stub
		return muffin.getMuffinDescription() + " with brown sugar";
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return 0.15 + muffin.cost();
	}

}
