package com.cbstyle.item.validation;

import com.cbstyle.item.model.Category;
import com.cbstyle.item.model.ItemDto;
import org.apache.commons.lang3.StringUtils;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CategoryStyleValidator implements ConstraintValidator<ValidItemDto, ItemDto> {

    private transient ValidItemDto validItemDto;

    @Override
    public void initialize(ValidItemDto validItemDto) {
        this.validItemDto = validItemDto;
    }

    @Override
    public boolean isValid(ItemDto itemDto, ConstraintValidatorContext constraintValidatorContext) {

        // This case is handled separately within @NotBlank validation
        if (StringUtils.isBlank(itemDto.getCategory())) {
            return true;
        }

        Category category = Category.fromValue(itemDto.getCategory());
        // This case is handled separately within @StringEnumeration validation
        if (category == null) {
            return true;
        }

        switch (category) {
            case SHIRT:
                return validate(itemDto.getStyle(), ShirtStyle.class);

            case PANT:
                return validate(itemDto.getStyle(), PantStyle.class);

            case SHOE:
                return validate(itemDto.getStyle(), ShoeStyle.class);

            case DRESS:
                return validate(itemDto.getStyle(), DressStyle.class);

            default:
                return false;
        }
    }

    private boolean validate(String style, Class<? extends Enum<?>> enumClass) {
        final Object[] enumElements = enumClass.getEnumConstants();

        if (enumElements != null) {
            for (final Object enumElement : enumElements) {
                final String enumValue = enumElement.toString();
                if (enumValue.equals(style)
                        || this.validItemDto.ignoreCase() && enumValue.equalsIgnoreCase(style)) {
                    return true;
                }
            }
        }

        return false;
    }

}

