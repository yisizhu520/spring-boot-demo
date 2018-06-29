package com.example.springbootdemo;

import org.junit.Before;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;

@SpringBootTest
public class WebControllerTest {

    private MockMvc mockMvc;

    @Before
    public void setUp() throws Exception {
//        mockMvc = MockMvcBuilders.standaloneSetup(new WebController()).build();
    }

    //省略部分代码
    @Test
    public void getUser() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.post("/getUser")).andDo(MockMvcResultHandlers.print());
    }

}