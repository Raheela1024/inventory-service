package com.assignment.inventory.mapper;

import com.assignment.inventory.dto.InventoryDto;
import com.assignment.inventory.entity.Inventory;
import org.mapstruct.Mapper;

import java.util.List;
/**
 * @author Raheela Aslam.
 */

/**
 * Mapper class to map {@link com.assignment.inventory.entity.Inventory} to {@link com.assignment.inventory.dto.InventoryDto}
 */
@Mapper(componentModel = "spring")
public interface InventoryMapper {


    /**
     * Maps a {@link Inventory} to a{@link InventoryDto}
     *
     * @param inventory an instance of {@link Inventory}
     * @return an instance of {@link InventoryDto}
     */
    InventoryDto map(Inventory inventory);

    /**
     * Maps a list of {@link Inventory} to a list of {@link InventoryDto}
     *
     * @param inventoryList a list {@link Inventory}
     * @return a list of {@link InventoryDto}
     */
    List<InventoryDto> mapToInventoryDtoList(List<Inventory> inventoryList);
}
