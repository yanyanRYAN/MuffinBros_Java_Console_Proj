package muffinBros;

public class ChocoChip extends MuffinModifier {
	Muffin muffin;

	public ChocoChip(Muffin muffin) {
		// TODO Auto-generated constructor stub
		this.muffin = muffin;
	}

	@Override
	public String getMuffinDescription() {
		// TODO Auto-generated method stub
		return muffin.getMuffinDescription() + " with Chocolate Chips";
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return 0.35 + muffin.cost();
	}

}
