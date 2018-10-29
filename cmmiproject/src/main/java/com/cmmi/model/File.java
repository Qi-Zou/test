package com.cmmi.model;

public class File {
    private Integer fileId;

    private Integer fileType;

    private String fileUrl;

    private String fileExplain;

    private Integer count;

    private String uploadId;

    private String uploadTime;

    @Override
    public String toString() {
        return "File{" +
                "fileId=" + fileId +
                ", fileType=" + fileType +
                ", fileUrl='" + fileUrl + '\'' +
                ", fileExplain='" + fileExplain + '\'' +
                ", count=" + count +
                ", uploadId='" + uploadId + '\'' +
                ", uploadTime='" + uploadTime + '\'' +
                '}';
    }

    public Integer getFileId() {
        return fileId;
    }

    public void setFileId(Integer fileId) {
        this.fileId = fileId;
    }

    public Integer getFileType() {
        return fileType;
    }

    public void setFileType(Integer fileType) {
        this.fileType = fileType;
    }

    public String getFileUrl() {
        return fileUrl;
    }

    public void setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl == null ? null : fileUrl.trim();
    }

    public String getFileExplain() {
        return fileExplain;
    }

    public void setFileExplain(String fileExplain) {
        this.fileExplain = fileExplain == null ? null : fileExplain.trim();
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public String getUploadId() {
        return uploadId;
    }

    public void setUploadId(String uploadId) {
        this.uploadId = uploadId == null ? null : uploadId.trim();
    }

    public String getUploadTime() {
        return uploadTime;
    }

    public void setUploadTime(String uploadTime) {
        this.uploadTime = uploadTime == null ? null : uploadTime.trim();
    }
}