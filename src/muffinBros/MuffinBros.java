/*
 * Ryan Ecarma
 * CPSC - 600000
 * Decoration Design Pattern
 */

package muffinBros;


public class MuffinBros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello this is MuffinBros");
		
		//Create Order
		Muffin muffin = new VanillaBase();  //vanilla muffin object
		muffin = new Icing(muffin);  //wrap with icing
		muffin = new Nuts(muffin);	//wrap with nuts
		System.out.println(muffin.getMuffinDescription() + ": $" + muffin.cost());
		Double total1 = muffin.cost();
		
		Muffin muffin2 = new ChocolateBase();
		muffin2 = new Icing(muffin2);
		muffin2 = new ChocoChip(muffin2);
		muffin2 = new Nuts(muffin2);
		System.out.println(muffin2.getMuffinDescription() + ": $" + muffin2.cost());
		Double total2 = muffin2.cost();
		
		Muffin muffin3 = new BananaBreadBase();
		muffin3 = new Nuts(muffin3);
		muffin3 = new BrownSugar(muffin3);
		System.out.println(muffin3.getMuffinDescription() + ": $" + muffin3.cost());
		Double total3 = muffin3.cost();
		
		Double grandTotal = total1 + total2 + total3;
		
		System.out.println("Order total: " + "$" + grandTotal + ".");
	}

}
