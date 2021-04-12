package com.krogerson

class Prescription {
//variable declaration
	String pharmacyName
	int prescripNumber
	String medicine
	Decimal totalCost
	Date dateIssued
	boolean patientPaying

    static constraints = {
	patientPaying(nullable:false)
	totalCost(scale: 2)
	
    }
}
