package rw.minaloc.mint.keepclean.model;

import java.util.Date;

/**
 * Created by Kamonyo on 23/08/2017.
 */

public class Cleaner {

    private Integer cleanerId;
    private String name;
    private String phoneNumber;
    private String email;
    private District district;
    private User creator;
    private Date creationDate;
    private User changedBy;
    private User retiredBy;
    private Date changeDate;
    private Date retireDate;

    public Cleaner(){}

    public Cleaner(String name, String phoneNumber, String email){
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public Integer getCleanerId() {
        return cleanerId;
    }

    public void setCleanerId(Integer cleanerId) {
        this.cleanerId = cleanerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public District getDistrict() {
        return district;
    }

    public void setDistrict(District district) {
        this.district = district;
    }

    public User getCreator() {
        return creator;
    }

    public void setCreator(User creator) {
        this.creator = creator;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public User getChangedBy() {
        return changedBy;
    }

    public void setChangedBy(User changedBy) {
        this.changedBy = changedBy;
    }

    public User getRetiredBy() {
        return retiredBy;
    }

    public void setRetiredBy(User retiredBy) {
        this.retiredBy = retiredBy;
    }

    public Date getChangeDate() {
        return changeDate;
    }

    public void setChangeDate(Date changeDate) {
        this.changeDate = changeDate;
    }

    public Date getRetireDate() {
        return retireDate;
    }

    public void setRetireDate(Date retireDate) {
        this.retireDate = retireDate;
    }
}
