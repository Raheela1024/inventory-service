package com.assignment.inventory.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Raheela Aslam.
 */

@NoArgsConstructor
@AllArgsConstructor
@Data
public class InventoryDto {

    private Long id;
    private String sku;
    private String name;
    private int count;
}
