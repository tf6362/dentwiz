package com.dent2med.datahub;

import java.sql.Timestamp;
import java.util.List;

/**
 * Created by bbates on 1/5/17.
 */
public interface HubPracticeDAO {
    public HubPractice getHubPractice(Integer guid);
    public void delete(Integer guid);
    public void update(Integer guid, String practiceId, String practiceUid, String practiceName, String practiceAddressLine1, String practiceAddressLine2, String practiceCity, String practiceState, String practiceZipCode, String practicePhone, String officeId, String accessKey, String syncUrl, Timestamp lastUpdate);
    public void create(Integer guid, String practiceId, String practiceUid, String practiceName, String practiceAddressLine1, String practiceAddressLine2, String practiceCity, String practiceState, String practiceZipCode, String practicePhone, String officeId, String accessKey, String syncUrl, Timestamp lastUpdate);
    public List<HubPractice> listHubPractice();

}
