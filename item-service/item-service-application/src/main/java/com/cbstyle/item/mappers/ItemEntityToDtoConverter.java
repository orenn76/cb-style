package com.cbstyle.item.mappers;

import com.cbstyle.common.crudcore.mappers.Converter;
import com.cbstyle.item.model.Item;
import com.cbstyle.item.model.ItemDto;
import org.springframework.stereotype.Component;

@Component
public class ItemEntityToDtoConverter implements Converter<Item, ItemDto> {

    @Override
    public ItemDto convert(Item source) {
        return ItemDto.builder()
                .id(source.getId())
                .category(source.getCategory())
                .color(source.getColor())
                .size(source.getSize())
                .brand(source.getBrand())
                .style(source.getStyle())
                .build();
    }

}
