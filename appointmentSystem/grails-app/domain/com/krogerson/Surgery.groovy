package com.krogerson

class Surgery {
	
//variable delcaration
	String name
	String address
	String postcode
	int telephone
	int numberOfPatients
	String Description 
	Time openingTime 

//constraints
    static constraints = {
	name(blank:false)
	address(blank:false)
	telephone(blank:false)
	postcode(maxSize: 9)
	Description(nullable: true)
	
    }
}
