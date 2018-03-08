public class NestingDoll {
	private NestingDoll innerDoll; // instance variable
	private String name;
	private java.awt.Color hair;
	private boolean babushka;

	/* first constructor - needed for doll with no inner doll*/
	public NestingDoll(String name, java.awt.Color hair, boolean babushka) // constructor
	{
		this.innerDoll = null;
		this.name = name;
		this.hair = hair;
		this.babushka = babushka;
	}

	/* second constructor - need for doll with an inner doll */
	public NestingDoll(NestingDoll innerDoll, String name, java.awt.Color hair, boolean babushka) {
		this.innerDoll = innerDoll;
		this.name = name;
		this.hair = hair;
		this.babushka = babushka;
	}

	/* hasInnerDoll - returns true if this has an inner doll */
	public boolean hasInnerDoll() {
		return this.innerDoll != null;
	}

	/* getInnerDoll - accessor */
	public NestingDoll getInnerDoll() {
		return this.innerDoll;
	}

	/*
	 * howManyDolls - returns a count of how many dolls there are, /*including this
	 * one.
	 */
	public int howManyDolls() {
		if (this.innerDoll == null) {
			return 1;
		}
		return 1 + this.innerDoll.howManyDolls();
	}
	
	/* howManyWearingBabushkas - returns a count of how many dolls 
	 * there are where the babushka field is true*/
	public int howManyWearingBabushkas()
	{
		//check if the inner doll is wearing a babushka
		if()
			return 1;
		
		//check if the inner doll is not wearing a babushka
		if()
			return 0;
		
		
		//check if a non-inner doll is wearing a babushka - this needs to be recursive
		if() 
			return 1 + this.innerDoll.howManyWearingBabushkas();
		
		
		//return total count		
		return 1 + this.innerDoll.howManyWearingBabushkas();
		
	}
	
	/* redHeadCount - returns a count of how many dolls there are where
	 * the hair field is java.awt.Color.RED
	 */
	
	public int redHeadCount()
	{
		
	}
	
	/* lastName - returns the last name, alphabetically, of the dolls in this
	 * collection.
	 */
	
	public String lastName()
	{
		
	}
}
