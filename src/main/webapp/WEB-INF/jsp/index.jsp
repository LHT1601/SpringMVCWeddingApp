<%-- 
    Document   : index
    Created on : Sep 15, 2021, 11:03:43 AM
    Author     : LHT
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib  prefix="spring" uri="http://www.springframework.org/tags" %>


<br>
<br>
<br>
<br>
<br>
<section class="dishes" id="dishes">

    <h3 class="sub-heading"> our wedding halls </h3>
    <h1 class="heading"> popular wedding halls </h1>

    <div class="box-container">
        <c:forEach var="w" items="${weddinghalls}">
            <div class="box animate__animated animate__bounceInLeft animate__delay-2s">
                <a href="#" class="fas fa-heart"></a>
                <a href="#" class="fas fa-eye"></a>

                <c:if test="${w.weddingHallImages != null && w.weddingHallImages.startWith('https')==true}">
                    <img src="<c:url value="${w.weddingHallImages}"/>" alt="${w.name}">
                </c:if>

                <c:if test="${w.weddingHallImages == null || w.weddingHallImages.startWith('https')==false}">
                    <img src="<c:url value="images/admin.png"/>" alt="${w.name}">
                </c:if>

                <h3>${w.name}</h3>
                <div class="stars">
                    <i class="fas fa-star"></i>
                    <i class="fas fa-star"></i>
                    <i class="fas fa-star"></i>
                    <i class="fas fa-star"></i>
                    <i class="fas fa-star-half-alt"></i>
                </div>
                <span>${w.weddingHallPrice}</span>
                <a href="#" class="btn">add to cart</a>
            </div>
        </c:forEach>
    </div>

</section>


<!-- <h1 class="text-center text-danger">Danh muc sanh cuoi</h1>



<br>
<br>
<br>
<br>
<br>
<br>
<form action="" class="d-flex">
    <input class="form-control me-2" type="text" name="kw" placeholder="Search" aria-label="Search"/>
    <input class="btn btn-outline-success" type="submit" value="tim kiem" />
</form>

<div class="row">
    <c:forEach var="w" items="${weddinghalls}">
        <div class="card col-md-4 bg-info">
            <div class="card-body">
                <img class="img-fluid" src="<c:url value="images/admin.png"/>" alt="${w.name}" />
            </div>
            <div class="card-footer ">Footer</div>
            <h3>${w.name}</h3>
            <p>${w.weddingHallPrice}</p>
        </div>
    </c:forEach>
</div> -->


<%--<ul>
    <c:forEach var="hall" items="${weddinghalls}">
        <li>${hall.id} ${hall.name}</li>
    </c:forEach>
</ul>--%>
        
        <%--<a href="<c:url value="/test" />">redirect/forward</a>
    
        <div>
            <img src="<c:url value="/images/admin.png" />" alt="images"/>
        </div>
        <h1>Hello Le Hai Trieu</h1>
        <h1>Hello ${name}</h1>
        
        <c:if test="${fullName != null}">
             <h1>${fullName}</h1>
        </c:if>
        
       
        
        <form:form method="post" action="/WeddingAppSpringMVC/hello-post" modelAttribute="user">
            <spring:message code="label.firstName" />
            <form:input path="firstName" />
            <spring:message code="label.lastName" />
            <form:input path="lastName" />
            <input type="submit" value="send" />
        </form:form>--%>
