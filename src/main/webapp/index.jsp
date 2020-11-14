<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
  <head>
    <meta charset="UTF-8">
    <title>Group 13 Login</title>
  </head>
  
  <body>
    <h1>Welcome To Group 13's Login Page!</h1>
    <s:form action="login">
        <s:textfield name="username" label="Username: " />
        <s:password name="userpass" label="Password: " />
        <s:submit value="Login" />
    </s:form>
  </body>
</html>