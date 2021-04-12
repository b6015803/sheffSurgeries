package com.krogerson

class Receptionist {
//Variable declaration
	String recepName
	String recepEmail
	String recepUsername
	String recepPassword
	int recepPhone

//constraints
    static constraints = {
	recepName(blank:false)
	recepEmail(email:true)
	recepUsername(blank:false)
	recepPassword(blank:false)
    }
}
