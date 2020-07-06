package com.assignment.inventory.service;

import com.assignment.inventory.dto.InventoryDto;
import com.assignment.inventory.entity.Inventory;

import java.util.List;

/**
 * @author Raheela Aslam.
 */
public interface IInventoryService {

    /**
     * To retrieve all inventory list
     *
     * @return an instance of {@link List< InventoryDto >}
     */
    List<Inventory> getInventoryList();
}
