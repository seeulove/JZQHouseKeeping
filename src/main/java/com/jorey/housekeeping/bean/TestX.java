package com.jorey.housekeeping.bean;

public class TestX {
    private Integer testxId;

    private String testxName;

    private Integer testxTid;

    public Integer getTestxId() {
        return testxId;
    }

    public void setTestxId(Integer testxId) {
        this.testxId = testxId;
    }

    public String getTestxName() {
        return testxName;
    }

    public void setTestxName(String testxName) {
        this.testxName = testxName == null ? null : testxName.trim();
    }

    public Integer getTestxTid() {
        return testxTid;
    }

    public void setTestxTid(Integer testxTid) {
        this.testxTid = testxTid;
    }
}