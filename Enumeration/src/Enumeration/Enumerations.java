package Enumeration;
// Use the built-in enumeration methods.

// An enumeration of Transport varieties.
//enum Transport CAR, TUCK, AIRPLANE, TRAIN, BOAT}//
class Enumerations {
	public static void main (String args[] )
	{
		Transport tp;
		
		System.out.println("Here are all Transport constants") ;
		
		// use values ()
		Transport allTransport[] = Transport.values ();
		for (Transport t : allTransport)
			System.out.println(t);
		
		System.out.println ( );
		
		// use valueOf ()
		tp = Transport.valueOf("AIRPLANE") ;
		System.out.println("tp contains " + tp) ;
	}
}
