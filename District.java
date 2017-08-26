package rw.mint.keepclean;

import android.os.Parcelable;

import java.util.Date;

/**
 * Created by Shema on 8/22/2017.
 */

public class District {
    Integer cleanerId;
    String name;
    String phoneNum;
    String email;
    District district;
    Date  creationDate;
    Date changeDate;
    Date retireDate;
    User creator;
    User changedBy;
    User retiredBy;


    public District(Integer cleanerId, String name, String phoneNum, String email, District district) {
        this.cleanerId = cleanerId;
        this.name = name;
        this.phoneNum = phoneNum;
        this.email = email;
        this.district = district;
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

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
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

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
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

    public User getCreator() {
        return creator;
    }

    public void setCreator(User creator) {
        this.creator = creator;
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
}
