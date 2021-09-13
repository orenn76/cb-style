package com.cbstyle.item.repository;

import com.cbstyle.common.crudcore.repository.BaseRepository;
import com.cbstyle.item.model.Item;
import com.cbstyle.item.model.ItemDto;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ItemRepository extends BaseRepository<Item> {

    List<Item> findByCategory(String category);

}
