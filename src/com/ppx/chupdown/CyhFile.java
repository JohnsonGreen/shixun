package com.ppx.chupdown;


import java.io.File;

/**
 * Created by cyh on 2017/5/26.
 */
public class CyhFile {

    private String fileName;
    private String uniqueName;
    private int fileSize;
    private String contenetType;
    private String suffix;


    public String getSuffix() { return suffix; }

    public void setSuffix(String suffix) { this.suffix = suffix; }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getUniqueName() {
        return uniqueName;
    }

    public void setUniqueName(String uniqueName) {
        this.uniqueName = uniqueName;
    }

    public int getFileSize() {
        return fileSize;
    }

    public void setFileSize(int fileSize) {
        this.fileSize = fileSize;
    }

    public String getContenetType() {
        return contenetType;
    }

    public void setContenetType(String contenetType) {
        this.contenetType = contenetType;
    }
}
