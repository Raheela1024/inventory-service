package com.assignment.inventory.repository;

import com.assignment.inventory.entity.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Raheela Aslam.
 */
@Repository
public interface InventoryRepository extends JpaRepository<Inventory, Long> {
}
