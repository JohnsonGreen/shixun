<%@ page language="java" import="java.util.*" contentType="text/html;charset=UTF-8" pageEncoding="utf-8"%>
<html>
  <head>
    <title>上传页面</title>
  </head>
  <body>
  <form action="upload.jsp" method="post" enctype="multipart/form-data">
   <input type="file" name="pic" id="pic"/>
   <input type="submit" value="上传"/>
  </form>
  </body>
</html>
