package rw.mint.keepclean;

import android.icu.text.RelativeDateTimeFormatter;
import android.media.Image;

import java.util.Date;

/**
 * Created by Shema on 8/22/2017.
 */

public class KeepCleanReport {
    Integer reportId;
    Date reportDate;
    RelativeDateTimeFormatter reportTime;
    String header;
    String body;
    String latitude;
    String longitude;
    Image image;
    String reporterPhoneNum;
    District district;

    public KeepCleanReport(Integer reportId, Date reportDate, RelativeDateTimeFormatter reportTime, String header, String body, String latitude, String longitude, Image image, String reporterPhoneNum, District district) {
        this.reportId = reportId;
        this.reportDate = reportDate;
        this.reportTime = reportTime;
        this.header = header;
        this.body = body;
        this.latitude = latitude;
        this.longitude = longitude;
        this.image = image;
        this.reporterPhoneNum = reporterPhoneNum;
        this.district = district;
    }

    public Integer getReportId() {
        return reportId;
    }

    public void setReportId(Integer reportId) {
        this.reportId = reportId;
    }

    public Date getReportDate() {
        return reportDate;
    }

    public void setReportDate(Date reportDate) {
        this.reportDate = reportDate;
    }

    public RelativeDateTimeFormatter getReportTime() {
        return reportTime;
    }

    public void setReportTime(RelativeDateTimeFormatter reportTime) {
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

    public String getReporterPhoneNum() {
        return reporterPhoneNum;
    }

    public void setReporterPhoneNum(String reporterPhoneNum) {
        this.reporterPhoneNum = reporterPhoneNum;
    }

    public District getDistrict() {
        return district;
    }

    public void setDistrict(District district) {
        this.district = district;
    }
}



