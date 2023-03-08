<%@page isELIgnored="false" %>
<%@page import="java.util.*" %>
<%@page import="com.jsp.crud.entity.Student"%>
<!DOCTYPE html>
<html>
<head>
    <title>Student Details</title>
    <link rel="stylesheet" type="text/css" href="/Css/getAll.css">
</head>
<body>
   <h1 style="text-align: center; color: #4CAF50; font-size: 36px; margin-top: 20px;">Student Details</h1>
    <table>
        <thead>
            <tr>
                <th>Id</th>
                <th>Name</th>
                <th>Percentage</th>
                <th>Contact number</th>
            </tr>
        </thead>
        <tbody>
        <% 
            List<Student> studentList = (List<Student>) session.getAttribute("all");
            if (studentList != null) {
                for (Student s : studentList) {
        %>
            <tr>
                <td><%=s.getId() %></td>
                <td><%=s.getName() %></td>
                <td><%=s.getPercentage() %></td>
                <td><%=s.getPhno() %></td>
            </tr>
        <% 
                }
            } else {
        %>
            <tr>
                <td colspan="4">No student data found</td>
            </tr>
        <% 
            }
        %>
        </tbody>
    </table>
    <br>
    <div class="button-container">
		<a href="./button.jsp"><button class="submit-button">Homepage</button></a>
		<button class="print-button" onclick="window.print()">Print</button>
	</div></body>
</html>