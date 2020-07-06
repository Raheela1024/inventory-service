package com.assignment.inventory.entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author Raheela Aslam.
 */
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "inventory")
public class Inventory implements Serializable {


    private static final long serialVersionUID = 4482301659896415651L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String sku;
    private String name;
    private int count;
}
