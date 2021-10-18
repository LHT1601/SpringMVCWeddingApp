<%-- 
    Document   : header
    Created on : Sep 20, 2021, 7:45:28 PM
    Author     : LHT
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>


<header>

    <a href="#" class="logo"><i class="fas fa-utensils"></i>hatri.</a>

    <nav class="navbar">
        <a class="active" href="#home">Trang chủ</a>
        <a href="./dishes.html">sảnh cưới</a>
        <a href="./about.html">dich vụ</a>
        <a href="#menu">món ăn</a>
        <a href="#review">đăng nhập</a>
        <a href="#order">giỏ hàng</a>
    </nav>

    <div class="icons">
        <i class="fas fa-bars" id="menu-bars"></i>
        <i class="fas fa-search" id="search-icon"></i>
        <a href="#" class="fas fa-heart"></a>
        <a href="#" class="fas fa-shopping-cart"></a>
    </div>

</header>

<form action="" id="search-form">
    <input type="search" name="kw" placeholder="search here..." name="" id="search-box">
    <label for="search-box" class="fas fa-search"></label>
    <i class="fas fa-times" id="close"></i>
</form>

<%--<nav class="navbar navbar-expand-lg navbar-light bg-light">
  <div class="container-fluid">
    <a class="navbar-brand" href="/">Hatri</a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarSupportedContent">
      <ul class="navbar-nav me-auto mb-2 mb-lg-0">
        <li class="nav-item">
          <a class="nav-link active" aria-current="page" href="#">Trang chủ</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="#">Sảnh cưới</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="#">Dịch vụ</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="#">Thực đơn</a>
        </li>
        <li class="nav-item dropdown">
          <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-bs-toggle="dropdown" aria-expanded="false">
            Dropdown
          </a>
          <ul class="dropdown-menu" aria-labelledby="navbarDropdown">
            <li><a class="dropdown-item" href="#">Action</a></li>
            <li><a class="dropdown-item" href="#">Another action</a></li>
            <li><hr class="dropdown-divider"></li>
            <li><a class="dropdown-item" href="#">Something else here</a></li>
          </ul>
        </li>
        <li class="nav-item">
          <a class="nav-link disabled" href="#" tabindex="-1" aria-disabled="true">Disabled</a>
        </li>
        
         <li class="nav-item">
             <a class="nav-link" href="<c:url value="/cart" />">Gio hang</a>
        </li>
      </ul>
        <form action="" class="d-flex">
          <input class="form-control me-2" type="text" placeholder="Search" aria-label="Search">
        <button class="btn btn-outline-success" type="submit">Search</button>
      </form>
    </div>
  </div>
</nav>--%>
