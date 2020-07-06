package com.assignment.inventory.service;

import com.assignment.inventory.entity.Inventory;
import com.assignment.inventory.repository.InventoryRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Raheela Aslam.
 */
@Service
@AllArgsConstructor
public class InventoryService implements IInventoryService {

    private final InventoryRepository inventoryRepository;


    /**
     * @see {@link IInventoryService}
     */

    @Override
    public List<Inventory> getInventoryList() {
        return inventoryRepository.findAll();
    }
}
