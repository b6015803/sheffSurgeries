package com.krogerson

class Prescription {
//Variables 
	String pharmacyName
	int prescripNumber
	String medicine
	Double totalCost
	Date dateissued
	Boolean patientPaying

//Constraints
    static constraints = {
	PatientPaying(blank:false)
	prescripNumber(maxSize:20)
	medicine(maxSize: 25)
	totalCost(maxSize: 4)
	dateissued(blank:false)
	patientPaying(blank:false)
    }
//Relationship
	static belongsTo=[Doctor,Appointment]
}
