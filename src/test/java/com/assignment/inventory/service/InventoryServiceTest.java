package com.assignment.inventory.service;

import com.assignment.inventory.entity.Inventory;
import com.assignment.inventory.repository.InventoryRepository;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class InventoryServiceTest {

    @Mock
    private InventoryRepository inventoryRepository;

    @InjectMocks
    private InventoryService inventoryService;

    @Test
    public void test_getInventoryList() {
        Mockito.when(inventoryRepository.findAll()).thenReturn(getInventoryList());
        List<Inventory> response = inventoryService.getInventoryList();

        Mockito.verify(inventoryRepository, Mockito.times(1)).findAll();
        Assert.assertNotNull(response);

    }

    private List<Inventory> getInventoryList() {

        return Arrays.asList(Inventory.builder().id(1l).name("Inventory").sku("SKU-1").count(1).build());
    }

}
