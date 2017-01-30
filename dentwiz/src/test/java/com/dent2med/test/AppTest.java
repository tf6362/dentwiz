package com.dent2med.test;

/**
 * Created by bbates on 1/13/17.
 */



import com.dent2med.datahub.HubPracticeController;
import com.dent2med.datahub.HubPracticeDAO;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpSession;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestContext;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

/**
 * Unit test for simple App.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({ "file:src/main/webapp/WEB-INF/HelloWeb-servlet.xml" })
@WebAppConfiguration
public class AppTest
    extends TestCase
{
    @Autowired WebApplicationContext wac;
        @Autowired
        MockHttpSession session;
        @Autowired
        MockHttpServletRequest request;
    public AppTest( )
     {
         super(  );
     }



    private MockMvc mockMvc;


    /**
     * Rigourous Test :-)
     */




        @Before
        public void setup() {
            this.mockMvc = MockMvcBuilders.webAppContextSetup(this.wac).build();
        }



    @org.junit.Test
    public void testApp() throws Exception
    {

         this.mockMvc.perform(get("/listHubPractice").session(session)
         .accept(MediaType.TEXT_HTML))
         .andExpect(status().isOk())
         .andExpect(view().name("hubPracticeList"));
    }
}