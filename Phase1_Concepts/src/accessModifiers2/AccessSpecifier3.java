package accessModifiers2;

import accessModifiers.*;

public class AccessSpecifier3 {

	public static void main(String[] args) {
		
		
//calling protected method within different package - not accessible
		protectedAccessSpecifier protObj2 = new protectedAccessSpecifier();
		//protObj2.display();
		
//calling public method within different package		
		publicAccessSpecifier pubObj = new publicAccessSpecifier();
		pubObj.display();
		
	}

}
