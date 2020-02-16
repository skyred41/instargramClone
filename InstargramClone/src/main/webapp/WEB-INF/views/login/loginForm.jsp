<%@page import="java.math.BigInteger"%>
<%@page import="java.security.SecureRandom"%>
<%@page import="java.net.URLEncoder"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<%
  String clientId = "CSlGh90l95NVgKzm7iVB";//애플리케이션 클라이언트 아이디값";
  String redirectURI = URLEncoder.encode("http://localhost:8080/login/naverLogin", "UTF-8");
  SecureRandom random = new SecureRandom();
  String state = new BigInteger(130, random).toString();
  String apiURL = "https://nid.naver.com/oauth2.0/authorize?response_type=code";
  apiURL += "&client_id=" + clientId;
  apiURL += "&redirect_uri=" + redirectURI;
  apiURL += "&state=" + state;
  session.setAttribute("outh_state", state);
%>
<body>
	<h1>LoginForm</h1>
	
	<ul>
		<li><a>페이스북으로 로그인</a><li>
		<li><a href="<%= apiURL %>"><img height="50" src="http://static.nid.naver.com/oauth/small_g_in.PNG"/></a><li>
		
	</ul>
	
</body>
</html>