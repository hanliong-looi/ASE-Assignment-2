<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login success</title>
    </head>
    <body>
        <h1>Successful login.</h1>
        <p>Welcome, <s:property value="username" /></p>
        <p><a href="<s:url action='index'/>">Back</a></p>
    </body>
</html>