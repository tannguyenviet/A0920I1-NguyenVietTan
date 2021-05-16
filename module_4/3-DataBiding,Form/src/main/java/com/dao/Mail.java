package com.dao;

public class Mail {
    private String language;
    private int pageSize;
    private String enableSpamFilter;
    private String Signature;

    public Mail(String language, int pageSize, String enableSpamFilter, String signature) {
        this.language = language;
        this.pageSize = pageSize;
        this.enableSpamFilter = enableSpamFilter;
        this.Signature = signature;
    }

    public Mail() {
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public String getEnableSpamFilter() {
        return enableSpamFilter;
    }

    public void setEnableSpamFilter(String enableSpamFilter) {
        this.enableSpamFilter = enableSpamFilter;
    }

    public String getSignature() {
        return Signature;
    }

    public void setSignature(String signature) {
        Signature = signature;
    }
}
