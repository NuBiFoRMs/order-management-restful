package com.nubiform.idus.api.member.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;

@ActiveProfiles("test")
@SpringBootTest
@AutoConfigureMockMvc
class MemberControllerTest {

    @Autowired
    MockMvc mockMvc;

    @Test
    public void member() throws Exception {
        mockMvc.perform(get("/api/v1/member/member")
                .contentType(MediaType.APPLICATION_JSON))
                .andDo(print());
    }

    @Test
    public void members() throws Exception {
        mockMvc.perform(get("/api/v1/member/members")
                .contentType(MediaType.APPLICATION_JSON))
                .andDo(print());
    }
}