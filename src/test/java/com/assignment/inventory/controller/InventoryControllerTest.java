package com.assignment.inventory.controller;

import com.assignment.inventory.InventoryApplication;
import lombok.extern.slf4j.Slf4j;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.core.io.ClassPathResource;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.init.ResourceDatabasePopulator;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import javax.sql.DataSource;
import java.net.URI;

@Slf4j
@ActiveProfiles("test")
@SpringBootTest(classes = InventoryApplication.class, webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
@ContextConfiguration
public class InventoryControllerTest {


    private static final TestRestTemplate REST = new TestRestTemplate();

    private String getRootUrl() {
        return "http://localhost:8080/api/v1/inventory";
    }

    @Test
    public void testGetInventoryList() {

        URI uri = URI.create(getRootUrl() + "/list");

        ResponseEntity<String> response = REST.getForEntity(uri, String.class);

        log.info("Response >> Test Case 1 >> {}", response);

        Assert.assertEquals(HttpStatus.OK, response.getStatusCode());

        Assert.assertNotNull(response.getBody());
    }
}
