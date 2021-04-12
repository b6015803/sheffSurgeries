package com.krogerson

class Nurse {
//variable delclaration
	String nurseName
	String qualifications
	String nurseEmail
	String nurseOffice
	int nursePhone

    static constraints = {
	nurseEmail(email:true)
    }
}
