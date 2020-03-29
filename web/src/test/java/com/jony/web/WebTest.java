package com.jony.web;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.mock.http.server.reactive.MockServerHttpResponse;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(value = {"classpath*:applicationContext*.xml","classpath*:spring-mvc.xml"})
@WebAppConfiguration
public class WebTest {
    @Autowired
    private WebApplicationContext context ;

    private MockMvc mockMvc;
    private MockHttpServletRequest request;
    private MockServerHttpResponse response;

    @Before
    public void before(){
        //        加载容器
        mockMvc = MockMvcBuilders.webAppContextSetup(context).build();
    }

    @Test
    public void test(){
        try {
            ResultActions resultActions = mockMvc.perform(MockMvcRequestBuilders.get("/index"));
            MvcResult result = resultActions.andReturn();
            String r = result.getResponse().getContentAsString();
            System.out.println(r);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
