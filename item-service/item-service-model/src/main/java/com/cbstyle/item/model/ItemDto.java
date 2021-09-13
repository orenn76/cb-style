package com.cbstyle.item.model;

import com.cbstyle.item.validation.StringEnumeration;
import com.cbstyle.item.validation.ValidItemDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.NotNull;

@Builder(toBuilder = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
@ValidItemDto
public class ItemDto {

    private static final String EMPTY_VALUE = "{emptyValueCode}";
    private static final String INVALID_VALUE_CODE = "{invalidValueCode}";

    private long id;

    @NotBlank(message = EMPTY_VALUE)
    @StringEnumeration(enumClass = Category.class, ignoreCase = false, message = INVALID_VALUE_CODE)
    private String category;

    @NotBlank(message = EMPTY_VALUE)
    private String color;

    @NotNull(message = EMPTY_VALUE)
    private Integer size;

    @NotBlank(message = EMPTY_VALUE)
    private String brand;

    @NotBlank(message = EMPTY_VALUE)
    private String style;

}
