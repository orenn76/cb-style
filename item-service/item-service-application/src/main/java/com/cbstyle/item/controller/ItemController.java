package com.cbstyle.item.controller;

import com.cbstyle.common.crudcore.controller.BaseCrudController;
import com.cbstyle.common.crudcore.responses.ListResponse;
import com.cbstyle.item.model.Category;
import com.cbstyle.item.model.Item;
import com.cbstyle.item.model.ItemDto;
import com.cbstyle.item.service.ItemService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.validation.ValidationException;
import java.util.List;

@RestController
@RequestMapping("/item")
public class ItemController extends BaseCrudController<ItemDto, Item, ItemService> {

    @RequestMapping(value = "/", params = "category", method = RequestMethod.GET, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public ListResponse<ItemDto> readBy(@RequestParam String category) {
        Category cat = getCategory(category);
        List<ItemDto> items = service.readBy(cat);
        return new ListResponse<>(items);
    }

    private Category getCategory(String categoryParam) {
        if (StringUtils.isEmpty(categoryParam)) {
            throw new ValidationException("Invalid category param");
        }
        Category category = Category.fromValue(categoryParam);
        if (category == null){
            throw new ValidationException("Invalid category param");
        }

        return category;
    }


}