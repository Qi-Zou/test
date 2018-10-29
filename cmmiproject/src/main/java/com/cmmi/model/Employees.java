package com.cmmi.model;

public class Employees {
    private String jobNumber;

    private String name;

    private Integer type;

    private String password;

    private String phone;

    private Integer feedbackId;

    @Override
    public String toString() {
        return "Employees{" +
                "jobNumber='" + jobNumber + '\'' +
                ", name='" + name + '\'' +
                ", type=" + type +
                ", password='" + password + '\'' +
                ", phone='" + phone + '\'' +
                ", feedbackId=" + feedbackId +
                '}';
    }

    public String getJobNumber() {
        return jobNumber;
    }

    public void setJobNumber(String jobNumber) {
        this.jobNumber = jobNumber == null ? null : jobNumber.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public Integer getFeedbackId() {
        return feedbackId;
    }

    public void setFeedbackId(Integer feedbackId) {
        this.feedbackId = feedbackId;
    }
}