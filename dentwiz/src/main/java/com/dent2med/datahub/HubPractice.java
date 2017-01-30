package com.dent2med.datahub;

import java.sql.Timestamp;

/**
 * Created by bbates on 1/5/17.
 */
public class HubPractice {

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        HubPractice that = (HubPractice) o;

        if (accessKey != null ? !accessKey.equals(that.accessKey) : that.accessKey != null) return false;
        if (!guid.equals(that.guid)) return false;
        if (lastUpdate != null ? !lastUpdate.equals(that.lastUpdate) : that.lastUpdate != null) return false;
        if (officeId != null ? !officeId.equals(that.officeId) : that.officeId != null) return false;
        if (practiceAddressLine1 != null ? !practiceAddressLine1.equals(that.practiceAddressLine1) : that.practiceAddressLine1 != null)
            return false;
        if (practiceAddressLine2 != null ? !practiceAddressLine2.equals(that.practiceAddressLine2) : that.practiceAddressLine2 != null)
            return false;
        if (practiceCity != null ? !practiceCity.equals(that.practiceCity) : that.practiceCity != null) return false;
        if (practiceId != null ? !practiceId.equals(that.practiceId) : that.practiceId != null) return false;
        if (practiceName != null ? !practiceName.equals(that.practiceName) : that.practiceName != null) return false;
        if (practicePhone != null ? !practicePhone.equals(that.practicePhone) : that.practicePhone != null)
            return false;
        if (practiceState != null ? !practiceState.equals(that.practiceState) : that.practiceState != null)
            return false;
        if (practiceUid != null ? !practiceUid.equals(that.practiceUid) : that.practiceUid != null) return false;
        if (practiceZipCode != null ? !practiceZipCode.equals(that.practiceZipCode) : that.practiceZipCode != null)
            return false;
        if (syncUrl != null ? !syncUrl.equals(that.syncUrl) : that.syncUrl != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = guid.hashCode();
        result = 31 * result + (practiceId != null ? practiceId.hashCode() : 0);
        result = 31 * result + (practiceUid != null ? practiceUid.hashCode() : 0);
        result = 31 * result + (practiceName != null ? practiceName.hashCode() : 0);
        result = 31 * result + (practiceAddressLine1 != null ? practiceAddressLine1.hashCode() : 0);
        result = 31 * result + (practiceAddressLine2 != null ? practiceAddressLine2.hashCode() : 0);
        result = 31 * result + (practiceCity != null ? practiceCity.hashCode() : 0);
        result = 31 * result + (practiceState != null ? practiceState.hashCode() : 0);
        result = 31 * result + (practiceZipCode != null ? practiceZipCode.hashCode() : 0);
        result = 31 * result + (practicePhone != null ? practicePhone.hashCode() : 0);
        result = 31 * result + (officeId != null ? officeId.hashCode() : 0);
        result = 31 * result + (accessKey != null ? accessKey.hashCode() : 0);
        result = 31 * result + (syncUrl != null ? syncUrl.hashCode() : 0);
        result = 31 * result + (lastUpdate != null ? lastUpdate.hashCode() : 0);
        return result;
    }

    public Integer getGuid() {
        return guid;
    }

    public void setGuid(Integer guid) {
        this.guid = guid;
    }

    public String getPracticeId() {
        return practiceId;
    }

    public void setPracticeId(String practiceId) {
        this.practiceId = practiceId;
    }

    public String getPracticeUid() {
        return practiceUid;
    }

    public void setPracticeUid(String practiceUid) {
        this.practiceUid = practiceUid;
    }

    public String getPracticeName() {
        return practiceName;
    }

    public void setPracticeName(String practiceName) {
        this.practiceName = practiceName;
    }

    public String getPracticeAddressLine1() {
        return practiceAddressLine1;
    }

    public void setPracticeAddressLine1(String practiceAddressLine1) {
        this.practiceAddressLine1 = practiceAddressLine1;
    }

    public String getPracticeAddressLine2() {
        return practiceAddressLine2;
    }

    public void setPracticeAddressLine2(String practiceAddressLine2) {
        this.practiceAddressLine2 = practiceAddressLine2;
    }

    public String getPracticeCity() {
        return practiceCity;
    }

    public void setPracticeCity(String practiceCity) {
        this.practiceCity = practiceCity;
    }

    public String getPracticeState() {
        return practiceState;
    }

    public void setPracticeState(String practiceState) {
        this.practiceState = practiceState;
    }

    public String getPracticeZipCode() {
        return practiceZipCode;
    }

    public void setPracticeZipCode(String practiceZipCode) {
        this.practiceZipCode = practiceZipCode;
    }

    public String getPracticePhone() {
        return practicePhone;
    }

    public void setPracticePhone(String practicePhone) {
        this.practicePhone = practicePhone;
    }

    public String getOfficeId() {
        return officeId;
    }

    public void setOfficeId(String officeId) {
        this.officeId = officeId;
    }

    public String getAccessKey() {
        return accessKey;
    }

    public void setAccessKey(String accessKey) {
        this.accessKey = accessKey;
    }

    public String getSyncUrl() {
        return syncUrl;
    }

    public void setSyncUrl(String syncUrl) {
        this.syncUrl = syncUrl;
    }

    public Timestamp getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Timestamp lastUpdate) {
        this.lastUpdate = lastUpdate;
    }
    public HubPractice(){

    }
    public HubPractice(Integer guid, String practiceId, String practiceUid, String practiceName, String practiceAddressLine1, String practiceAddressLine2, String practiceCity, String practiceState, String practiceZipCode, String practicePhone, String officeId, String accessKey, String syncUrl, Timestamp lastUpdate) {
        this.guid = guid;
        this.practiceId = practiceId;
        this.practiceUid = practiceUid;
        this.practiceName = practiceName;
        this.practiceAddressLine1 = practiceAddressLine1;
        this.practiceAddressLine2 = practiceAddressLine2;
        this.practiceCity = practiceCity;
        this.practiceState = practiceState;
        this.practiceZipCode = practiceZipCode;
        this.practicePhone = practicePhone;
        this.officeId = officeId;
        this.accessKey = accessKey;
        this.syncUrl = syncUrl;
        this.lastUpdate = lastUpdate;
    }

    private Integer guid;
    private String practiceId;
    private String practiceUid;
    private String practiceName;
    private String practiceAddressLine1;
    private String practiceAddressLine2;
    private String practiceCity;
    private String practiceState;
    private String practiceZipCode;
    private String practicePhone;
    private String officeId;
    private String accessKey;
    private String syncUrl;
    private Timestamp lastUpdate;

}
