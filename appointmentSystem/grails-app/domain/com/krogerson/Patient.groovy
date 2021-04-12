package com.krogerson

class Patient {
//variabe declaration
	String patientName
	String patientAddress
	String patientResidence
	Date patientDob
	String patientID
	Date dateRegistered
	int patientPhone

    static constraints = {
	patientName(blank:false)
	patientAddress(blank:false)
	patientID(nullable:false)
    }
}
