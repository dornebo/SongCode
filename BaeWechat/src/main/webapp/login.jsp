<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html>
<html lang="en">
   <head>
       <meta charset="utf-8">
       <title>Login</title>
       <meta name="viewport" content="width=device-width, initial-scale=1.0">
       <meta name="description" content="">
       <meta name="author" content="">
       <!-- CSS -->
       <link rel="stylesheet" href="static/assets/css/reset.css">
       <link rel="stylesheet" href="static/assets/css/supersized.css">
       <link rel="stylesheet" href="static/assets/css/style.css">
       <!-- HTML5 shim, for IE6-8 support of HTML5 elements -->
       <!--[if lt IE 9]>
           <script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
       <![endif]-->
   </head>
<body>
	<div class="page-container">
	    <h1>Login</h1>
	    <form action="" method="post" id="loginForm">
            <input type="text" name="username" class="username" id="username" placeholder="请输入您的用户名！">
            <input type="password" name="password" class="password" id="password" placeholder="请输入您的用户密码！">
            <!-- <input type="combobox" class="combobox" name="combobox" class="combobox" placeholder="请输入验证码！"> -->
            <button type="submit" class="submit_button" onclick="severCheck();">登录</button>
            <div class="error"><span>+</span></div>
        </form>
	    <div class="connect">
	    </div>
	</div>
  	<!-- Javascript -->
    <script src="static/assets/js/jquery-1.8.2.min.js" type="text/javascript"></script>
    <script src="static/assets/js/supersized.3.2.7.min.js" type="text/javascript"></script>
    <script src="static/assets/js/supersized-init.js" type="text/javascript"></script>
    <script src="static/assets/js/scripts.js" type="text/javascript"></script>
    <!-- 内部Javascript -->
    <script type="text/javascript">
  	//服务器校验
	function severCheck(){
		var loginname = $("#username").val();
		var password = $("#password").val();
		$.ajax({
			type: "POST",
			url: 'login_login',
	    	data: $('#loginForm').serialize(),
			dataType:'json',
			cache: false,
			success: function(data){
				if("success" == data.result){
					window.location.href="index.jsp";
				}else if("usererror" == data.result){
					$("#loginname").tips({
						side : 1,
						msg : "用户名或密码有误",
						bg : '#FF5080',
						time : 15
					});
					$("#loginname").focus();
				}
			}
		});
	}
    </script>
</body>
</html>