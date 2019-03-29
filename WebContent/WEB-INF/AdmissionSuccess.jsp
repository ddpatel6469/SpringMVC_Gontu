<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>${headingmsg}</h1>
	
	<h2>Details Submitted by you</h2>
	
	<table>
	
		<tr>
			<td>Student's Name : </td>
			<td>${student1.studentName}</td>
		</tr>
		<tr>
			<td>Student's Hobby : </td>
			<td>${student1.studentHobby}</td>
		</tr>
	
		<tr>
			<td>Student Mobile : </td>
			<td>${student1.studentMobile}</td>
		</tr>
		
		<tr>
			<td>Student DOB : </td>
			<td>${student1.studentDOB}</td>
		</tr>
		
		<tr>
			<td>Student Skills Set : </td>
			<td>${student1.studentSkills}</td>
		</tr>
		
		<tr>
			<td>Student Address : </td>
			<td>country: ${student1.studentAddress.country}
				city: ${student1.studentAddress.city}
				street: ${student1.studentAddress.street}
				pincode: ${student1.studentAddress.pincode}
			</td>
		</tr>
	</table>
</body>
</html>