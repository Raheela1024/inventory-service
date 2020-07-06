package com.assignment.inventory.controller;

import com.assignment.inventory.dto.InventoryDto;
import com.assignment.inventory.mapper.InventoryMapper;
import com.assignment.inventory.service.InventoryService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Raheela Aslam.
 */

@RestController
@RequestMapping("/api/v1/inventory")
@CrossOrigin("*")
@AllArgsConstructor
public class InventoryController {

    private final InventoryService inventoryService;

    private final InventoryMapper inventoryMapper;

    /**
     * To retrieve all inventory list
     *
     * @return an instance of {@link List<InventoryDto>}
     */
    @GetMapping("/list")
    public List<InventoryDto> getInventoryList() {
        return inventoryMapper.mapToInventoryDtoList(inventoryService.getInventoryList());
    }

}
