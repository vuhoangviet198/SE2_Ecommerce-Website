/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author sontriplelift
 */
public class Feedback {
    public String fname;
    public String fmail;
    public String fphone;
    public String content;

    public Feedback() {
    }

    public Feedback(String fname, String fmail, String fphone, String content) {
        this.fname = fname;
        this.fmail = fmail;
        this.fphone = fphone;
        this.content = content;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getFmail() {
        return fmail;
    }

    public void setFmail(String fmail) {
        this.fmail = fmail;
    }

    public String getFphone() {
        return fphone;
    }

    public void setFphone(String fphone) {
        this.fphone = fphone;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
    
}
