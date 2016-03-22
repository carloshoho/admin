<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>后台管理系统</title>

<link href="resources/css/lib/bootstrap.min.css" rel="stylesheet" />
<script type="text/javascript" src="resources/js/lib/jquery-1.12.1.min.js"></script>

<link href="resources/css/login.css" rel="stylesheet" />
</head>
<body>
  <div class="container">
    <form id="form" class="form-signin" method="post">
      <h2 class="form-signin-heading">请登陆</h2>
      <input type="text" id="userId" name="userId" class="form-control" placeholder="请输入工号" required autofocus /> 
      <input type="password" id="password" name="password" class="form-control" class="form-control" placeholder="请输入密码" required />
      <button id="btn-submit" class="btn btn-primary btn-block">登陆</button>
    </form>
  </div>
  <script type="text/javascript">
      $(function() {
        $("#btn-submit").click(function(event) {
          event.preventDefault();
          var url = '<c:url value="/"/>';
          $.ajax({
            url : url,
            type : "POST",
            dataType : 'json',
            data : $("#form").serialize(),
            success : function(result) {
              console.log(result);
              alert(result);
              if (result.success) {
                $("#btn-submit").val("登陆成功，正在跳转。。。");
                window.location.href = '<c:url value="/welcome"/>';
              } else {
				
              }
            },
            error : function(xhr, resp, text) {
              console.log(xhr, resp, text);
            }
          });
        });
      });
    </script>
</body>
</html>