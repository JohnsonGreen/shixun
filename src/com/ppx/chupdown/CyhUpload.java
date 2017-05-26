package com.ppx.chupdown;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.jsp.PageContext;
import java.io.*;
import java.util.Locale;
import java.util.UUID;

/**
 * Created by cyh on 2017/5/26.
 */
public class CyhUpload {

    private static final String POST_METHOD = "POST";   //限定只能POST上传
    public static final String MULTIPART = "multipart/";

    protected HttpServletRequest httpServletRequest;
    protected HttpServletResponse httpServletResponse;
    protected CyhFile file;

    public CyhUpload(){}

    public CyhUpload(PageContext pageContext){
        httpServletRequest = (HttpServletRequest) pageContext.getRequest();
        httpServletResponse = (HttpServletResponse) pageContext.getResponse();
    }


    //上传文件
    public CyhFile upload(String path)throws CyhUploadException{
       if( httpServletRequest.getContentLength() > 0){
            InputStream inputStream = null;
            OutputStream outputStream = null;
            try{
                inputStream = httpServletRequest.getInputStream();

                File  file = new File("G:/",geneUniqueName(".txt") );
                file.createNewFile();
                outputStream = new FileOutputStream(file);
                byte buffer[] = new byte[1024];      //设置文件上传缓冲1024个字节--1KB,也就是说集齐1024个字节后才往硬盘中写入
                int len = 0;
                while((len=inputStream.read(buffer)) > 0){  //返回值len为实际读到的字节数
                    outputStream.write(buffer,0,len);
                }
                inputStream.close();
                outputStream.flush();
                outputStream.close();
            }catch(IOException e){
               throw new CyhUploadException("File load fail !");
            }
       }
        return null;
    }

    //保存文件到指定位置
    public boolean save(String path)throws IOException{
        return false;
    }

    //判断是普通表单还是带文件上传的表单，带文件上传必须使用form-data
    public static final boolean isMultipartContent(HttpServletRequest request) {
        if (!POST_METHOD.equalsIgnoreCase(request.getMethod())) { return false; }
        if (request.getContentType() == null) { return false; }
        if (request.getContentType().toLowerCase(Locale.ENGLISH).startsWith(MULTIPART)) {return true;}
        return false;
    }


    //产生唯一文件名
    public String geneUniqueName(String suffix){
        return UUID.randomUUID()+suffix;
    }







}


