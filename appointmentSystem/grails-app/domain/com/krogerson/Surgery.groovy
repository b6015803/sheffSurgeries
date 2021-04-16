package com.krogerson

class Surgery {
 //Variables
	String name
	String address
	String postcode
	String telephone
	int numberOfPatients
	String description
	String openingTime
//Constraints
    static constraints = {
	name(blank:true)
	address(blank:true)
	postcode(maxsize: 9)
	telephone(maxsize:11)
	numberOfPatients(blank:false)
	description(nullable:true)
	openingTime(blank:false)
    }
}
