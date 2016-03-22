<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<link href="resources/css/lib/bootstrap.min.css" rel="stylesheet" />
<link href="resources/css/layout.css" rel="stylesheet" />
<title>后台管理系统</title>
</head>
<body>
  <div class="wrapper">
    <header class="main-header navbar navbar-inverse navbar-fixed-top">
              欢迎您,${user.name},${user.positions}
    </header>
    <aside class="col-sm-3 col-md-2 main-sidebar"></aside>
    <div class="content-wrapper">
      <div class="embed-responsive embed-responsive-16by9">
        <iframe class="embed-responsive-item" src=""></iframe>
      </div>
    </div>
  </div>
</body>

</html>