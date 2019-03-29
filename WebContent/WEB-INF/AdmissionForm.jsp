<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
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

	<h1>Student Admission Form For Engineering Courses</h1>
	
	<form:errors path="student1.*"></form:errors>
	
	<form action = "/SpringMVCSecond/submitAdmissionForm.html" method="post">
	
	<table>
		<tr>
			<td>Student's Name : </td>
			<td><input type="text" name="studentName"/></td>
		</tr>
		<tr>
			<td>Student's Hobby : </td>
			<td><input type="text" name="studentHobby"/></td>
		</tr>
		
		<tr>
			<td>Student's Mobile : </td>
			<td><input type="text" name="studentMobile"/></td>
		</tr>
		
		<tr>
			<td>Student's DOB : </td>
			<td><input type="text" name="studentDOB"/></td>
		</tr>
		
		<tr>
			<td>Student's Skills set : </td>
			<td><select name="studentSkills" multiple>
			<option value="Java Core">Java Core</option>
			<option value="Spring Core">Spring Core</option>
			<option value="Spring MVC">Spring MVC</option>
			</select></td>
		</tr>
		
		</table>
		
	<table>
	
		<tr><td>Student's Address : </td></tr>
		<tr>
		<td>country : <input type="text" name="studentAddress.country"/></td>
		<td>city : <input type="text" name="studentAddress.city"/></td>
		<td>street : <input type="text" name="studentAddress.street"/></td>
		<td>pincode : <input type="text" name="studentAddress.pincode"/></td>
		</tr>
		<tr>
			<td><input type = "submit" value="Submit this form"></td>
		</tr>
	</table>
	
	
	</form>
</body>
</html>