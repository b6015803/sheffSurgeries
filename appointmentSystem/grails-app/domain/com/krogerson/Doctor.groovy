package com.krogerson

class Doctor {
//Variable declaration
	String fullName
	String qualification
	String position
	String doctorEmail
	String password
	String doctorOffice
	int doctorPhone
	String bio

//constraints
    static constraints = {
	fullName(blank:false)
	qualification(blank:false)
	position(blank:false)
	doctorEmail(email:true)
	password(blank:false)
	
    }
}
