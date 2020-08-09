package VarargsandAmbiguity;
// Varargs, overloading, and ambiguity.
//
// This program contains an error and will
// not compile!
class VarargsandAmbiguity {

	// Use an int vararg paremter.
	static void vaTest (int ... v) {
		//...
	}
	
	// Use a boolean vararg parameter.
	static void vaTest (boolean ... v) {
		//...
	}
	public static void main (String args [])
	{
		vaTest(1, 2, 3); // OK
		vaTest(true, false, false); // OK
		
		vaTest( ); // Error: Ambiguous!
	}
}