package com.example.securityconfigissue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@SpringBootTest(properties = {"spring.autoconfigure.exclude=org.springframework.boot.autoconfigure.security.servlet.SecurityFilterAutoConfiguration, org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration", "debug=true"})
@AutoConfigureMockMvc
public class SecurityConfigIssueApplicationTests {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void shouldBeAbleToAccessIndex() throws Exception {
        mockMvc.perform(get("/")).andExpect(status().isOk());
    }

}
