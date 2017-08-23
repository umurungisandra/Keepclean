package rw.minaloc.mint.keepclean.model;

import android.media.Image;

import java.util.Date;

/**
 * Created by Kamonyo on 23/08/2017.
 */

public class KeepCleanReport {

    private Integer reportId;
    private String reporterPhoneNumber;
    private Date reportDate;
    private Date reportTime;
    private String header;
    private String body;
    private String latitude;
    private String longitude;
    private Image image;
    private District district;

    public Integer getReportId() {
        return reportId;
    }

    public void setReportId(Integer reportId) {
        this.reportId = reportId;
    }

    public String getReporterPhoneNumber() {
        return reporterPhoneNumber;
    }

    public void setReporterPhoneNumber(String reporterPhoneNumber) {
        this.reporterPhoneNumber = reporterPhoneNumber;
    }

    public Date getReportDate() {
        return reportDate;
    }

    public void setReportDate(Date reportDate) {
        this.reportDate = reportDate;
    }

    public Date getReportTime() {
        return reportTime;
    }

    public void setReportTime(Date reportTime) {
        this.reportTime = reportTime;
    }

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    public District getDistrict() {
        return district;
    }

    public void setDistrict(District district) {
        this.district = district;
    }
}
