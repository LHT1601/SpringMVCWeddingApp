<%-- 
    Document   : weddinghall
    Created on : Sep 22, 2021, 7:10:58 PM
    Author     : LHT
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<section class="order" id="order">
    <br> 
    <br> 
    <br> 
    <br> 
    <h3 class="sub-heading"> order now </h3>
    <h1 class="heading"> free and fast </h1>
    
    <c:url value="/admin/weddinghalls" var="action" />
    
    <c:if test="${errMgs != null}">
        <div class="alert alert-danger">${errMgs}</div>
    </c:if>
    
    <form:form method="post" action="${action}" modelAttribute="weddinghall" enctype="multipart/form-data">
        <form:errors path="*" cssClass="alert alert-danger" element="div" />

        <div class="inputBox">
            <div class="input">
                <span for="name">ten</span>
                <form:input type="text" id="name" path="name" placeholder="enter your name" />
                <form:errors path="name" cssClass="alert alert-danger" element="div" />
            </div>
            
            <div class="input">
                <span for="description">mo ta</span>
                <textarea name="" placeholder="enter your message" path="description" id="description" cols="30" rows="10"></textarea>
                <form:errors path="description" cssClass="alert alert-danger" element="div" />
            </div>
        </div>                               
        
        <div class="inputBox">
            <div class="input">
                <span for="price">gia</span>
                <form:input type="text" id="price" path="weddingHallPrice" placeholder="enter food name" />  
                <form:errors path="weddingHallPrice" cssClass="alert alert-danger" element="div" /> 
            </div>
            
            <div class="input">
                <span for="file">anh</span>
                <form:input type="file" id="file" path="file" placeholder="enter image" />
            </div>
        </div>   
            
        <input type="submit" value="add now" class="btn" />

    </form:form>

</section> 



 