<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en" xmlns:th="http://www.thymeleaf.org">
<html>
<head>
<meta charset="ISO-8859-1">
  <link rel="stylesheet" href="">
  <link rel="stylesheet" href="/Css/button.css">
  <script src="/JS/deleteAll.js"></script>
  
<title>StudentData</title>
</head>
<body>

<p class="attractive-sentence">Welcome to<span class="highlight">DataBase</span>! Management</p>


<div class="button-container">
  <a href="/Add.jsp"><button class="center-button">Add Student</button></a>
  <a href="./delete.jsp"><button class="center-button">Delete Student</button></a>
  <a href="/updateById.jsp"><button class="center-button">Update Student</button></a>
  <a href="./getById.jsp"> <button class="center-button">getBidId</button></a>
  <form action="delall"> <button class="center-button">Delete All</button></form>
  <form action="getalld"><a href="./getAll.jsp"><button class="center-button">GetAll</button></a></form>
</div>	
</body>
</html>  
<!-- <form action="delall" onclick="deleteAll(); return false;"> <button class="center-button">Delete All</button></form> -->