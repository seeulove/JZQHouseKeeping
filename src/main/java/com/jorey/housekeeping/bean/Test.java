package com.jorey.housekeeping.bean;

public class Test {
    private Integer testId;

    private String testName;

    private String testGender;

    private String testEmail;

    public Integer getTestId() {
        return testId;
    }

    public void setTestId(Integer testId) {
        this.testId = testId;
    }

    public String getTestName() {
        return testName;
    }

    public void setTestName(String testName) {
        this.testName = testName == null ? null : testName.trim();
    }

    public String getTestGender() {
        return testGender;
    }

    public void setTestGender(String testGender) {
        this.testGender = testGender == null ? null : testGender.trim();
    }

    public String getTestEmail() {
        return testEmail;
    }

    public void setTestEmail(String testEmail) {
        this.testEmail = testEmail == null ? null : testEmail.trim();
    }
}