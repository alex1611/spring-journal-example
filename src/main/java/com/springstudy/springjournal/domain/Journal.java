package com.springstudy.springjournal.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Transient;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@Entity
public class Journal {

    @Id
    @GeneratedValue
    private Long id;
    private String title;
    private Date created;
    private String summary;

    @Transient
    private SimpleDateFormat format = new SimpleDateFormat("MM/dd/yy");

    public Journal(String title, String summary, String date) throws ParseException {
        this.title = title;
        this.summary = summary;
        this.created = format.parse(date);
    }

    public Journal() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }
    public String getCreatedAsShort(){
        return format.format(created);
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder("Journal Entry {");
        res.append("Id : ");
        res.append(id);
        res.append(",Title: ");
        res.append(title);
        res.append(",Summary: ");
        res.append(summary);
        res.append(",Created: ");
        res.append(getCreatedAsShort());
        res.append("}");
        return res.toString();
    }
}
