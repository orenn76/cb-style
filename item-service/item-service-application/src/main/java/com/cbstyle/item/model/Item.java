package com.cbstyle.item.model;

import com.cbstyle.common.crudcore.model.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "item")
@Builder(toBuilder = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Item implements BaseEntity {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "category")
    private String category;

    @Column(name = "color")
    private String color;

    @Column(name = "size")
    private int size;

    @Column(name = "brand")
    private String brand;

    @Column(name = "style")
    private String style;

}
