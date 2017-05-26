
<%@ page import="com.ppx.chupdown.*,java.util.*,com.jspsmart.upload.*" pageEncoding="UTF-8" contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>上传文件</title>
</head>
<body>
  <%


      /*
      CyhUpload up = new CyhUpload(pageContext);

      try{
          up.save("pic");
      }catch( CyhUploadException e){
          e.printStackTrace();
      }
     */


      try{


          SmartUpload smart = new SmartUpload();
          smart.initialize(pageContext);
          smart.upload();
          //把文件保存到同目录的pic文件夹中,与index.jsp同目录
          smart.save("./pic");
      }catch (Exception e){
         e.printStackTrace();
      }



  %>
  <a href="index.jsp">返回</a>
</body>
</html>
