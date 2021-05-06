<!doctype html>
<html>
<head>
	<asset:stylesheet src="home.css"/>
    <meta name="layout" content="main"/>
    <title>SheffSurgeries</title>
</head>
<body>



<div id="content" role="main">
    <section class="row colset-2-its">
        <h1>Appointment System</h1>

       <div class="row">
	<asset:image src="main1.jpg" width="600" height="250"/>
	</div>
<div class="controllers">
	<div class="row">
	<div class="column">
	<div class="Appointment">
		<h3>Appointments</h3>
	<button type="button" class="btnbtn-success">
		<g:link controller="Appointment" action="create"> Add Appointment</g:link>
	</button>
	<button type="button" class="btnbtn-success">
		<g:link controller="Appointment" action="index"> View Appointments</g:link>
	</button>
	</div>
	
	<div class="Surgery">
		<h3>Surgeries</h3>
	<button type="button" class="btnbtn-success">
		<g:link controller="Surgery" action="create"> Add Surgery</g:link>
	</button>
	<button type="button" class="btnbtn-success">
		<g:link controller="Surgery" action="index"> View Surgeries</g:link>
	</button>
</div>
</div>
<div class="column">
	<div class="Receptionist">
		<h3>Receptionists</h3>
	<button type="button" class="btnbtn-success">
		<g:link controller="Receptionist" action="create"> Add Receptionist</g:link>
	</button>
	<button type="button" class="btnbtn-success">
		<g:link controller="Receptionist" action="index"> View Receptionists</g:link>
	</button>
</div>
	<div class="Doctor">
		<h3>Doctors</h3>
	<button type="button" class="btnbtn-success">
		<g:link controller="Doctor" action="create"> Add Doctor</g:link>
	</button>
	<button type="button" class="btnbtn-success">
		<g:link controller="Doctor" action="index"> View Doctors</g:link>
	</button>
</div>
</div>
<div class="column">
	<div class="Nurse">
		<h3>Nurses</h3>
	<button type="button" class="btnbtn-success">
		<g:link controller="Nurse" action="create"> Add Nurse</g:link>
	</button>
	<button type="button" class="btnbtn-success">
		<g:link controller="Nurse" action="index"> View Nurses</g:link>
	</button>
</div>

	<div class="Patient">
		<h3>Patients</h3>
	<button type="button" class="btnbtn-success">
		<g:link controller="Patient" action="create"> Add Patient</g:link>
	</button>
	<button type="button" class="btnbtn-success">
		<g:link controller="Patient" action="index"> View Patients</g:link>
	</button>
</div>
</div>
<div class="column">

	<div class="Prescription">
		<h3>Prescription</h3>
	<button type="button" class="btnbtn-success">
		<g:link controller="Prescription" action="create"> Add Prescription</g:link>
	</button>
	<button type="button" class="btnbtn-success">
		<g:link controller="Prescription" action="index"> View Prescriptions</g:link>
	</button>
</div>
</div>
</div>
 </div>     

</body>
</html>
