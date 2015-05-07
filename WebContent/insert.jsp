

<%@ page import="com.sds.icto.emaillist.dao.EmailListDao"%>
<%@ page import="com.sds.icto.emaillist.vo.EmailListVo"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
request.setCharacterEncoding("utf-8");
	//이메일등록
	
	String firstName = request.getParameter( "fn" );
	String lastName = request.getParameter( "ln" );
	String email = request.getParameter ( "email" );
	
	EmailListVo vo = new EmailListVo();
	vo.setFirst_name(firstName);
	vo.setLast_name(lastName);
	vo.setEmail(email);
	
	EmailListDao dao = new EmailListDao();
	dao.insert(vo);
	
	response.sendRedirect("/EmailList");
	//page 이동기술 redirect

%>