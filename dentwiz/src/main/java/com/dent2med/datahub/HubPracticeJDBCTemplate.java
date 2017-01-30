package com.dent2med.datahub;

/**
 * Created by bbates on 1/5/17.
 */
import java.sql.Timestamp;
import java.util.List;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;

@Component
public class HubPracticeJDBCTemplate implements HubPracticeDAO {
       private DataSource dataSource;
       private JdbcTemplate jdbcTemplateObject;
       private PlatformTransactionManager transactionManager;
       @Autowired
       public void setDataSource(DataSource dataSource) {
          this.dataSource = dataSource;
          this.jdbcTemplateObject = new JdbcTemplate(dataSource);
       }
    @Autowired
       public void setTransactionManager(
          PlatformTransactionManager transactionManager) {
          this.transactionManager = transactionManager;
       }

       public void create(Integer guid, String practiceId, String practiceUid, String practiceName, String practiceAddressLine1, String practiceAddressLine2, String practiceCity, String practiceState, String practiceZipCode, String practicePhone, String officeId, String accessKey, String syncUrl, Timestamp lastUpdate){


          TransactionDefinition def = new DefaultTransactionDefinition();
          TransactionStatus status = transactionManager.getTransaction(def);

          try {
             String SQL1 = "insert into HubPractice (guid) values (?)";
             jdbcTemplateObject.update( SQL1, guid);

             // Get the latest student id to be used in Marks table
           //  String SQL2 = "select max(id) from Student";
           //  int sid = jdbcTemplateObject.queryForInt( SQL2 );
         //     int sid=((Integer)jdbcTemplateObject.queryForObject(SQL2,Integer.class)).intValue();


             transactionManager.commit(status);
          } catch (DataAccessException e) {
             System.out.println("Error in creating record, rolling back");
             transactionManager.rollback(status);
             throw e;
          }
          return;
       }
    public void delete(Integer guid){

    }
    public void update(Integer guid, String practiceId, String practiceUid, String practiceName, String practiceAddressLine1, String practiceAddressLine2, String practiceCity, String practiceState, String practiceZipCode, String practicePhone, String officeId, String accessKey, String syncUrl, Timestamp lastUpdate){


     }
       public List<HubPractice> listHubPractice() {
          String SQL = "select * from HUB_PRACTICE";

          List <HubPractice> hubPractices = jdbcTemplateObject.query(SQL,
                                             new BeanPropertyRowMapper(HubPractice.class));
          return hubPractices;
       }

    public HubPractice getHubPractice(Integer guid) {
            String SQL = "select * from HUB_PRACTICE where HUB_PRACTICE.guid=?";

            List <HubPractice> hubPractices = jdbcTemplateObject.query(SQL,
                                               new BeanPropertyRowMapper(HubPractice.class),guid);
            return hubPractices.get(0);
         }


}
