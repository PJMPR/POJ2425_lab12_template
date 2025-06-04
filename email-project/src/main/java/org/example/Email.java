package org.example;

import java.util.ArrayList;
import java.util.List;

public class Email {
    private String subject;
    private String body;
    private String footer;
    private List<String> attachments = new ArrayList<>();

    public Email() {
    }

    public Email(String subject, String body, String footer, List<String> attachments) {
        this.subject = subject;
        this.body = body;
        this.footer = footer;
        this.attachments = attachments;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getFooter() {
        return footer;
    }

    public void setFooter(String footer) {
        this.footer = footer;
    }

    public List<String> getAttachments() {
        return attachments;
    }

    public void setAttachments(List<String> attachments) {
        this.attachments = attachments;
    }
}

