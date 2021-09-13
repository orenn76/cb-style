package com.cbstyle.item.validation;

import org.apache.commons.lang3.StringUtils;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class StringEnumerationValidator implements ConstraintValidator<StringEnumeration, String> {

    private transient StringEnumeration stringEnumeration;

    /**
     * Initialize the validator.
     *
     * @param stringEnumeration StringEnumeration.
     */
    @Override
    public void initialize(final StringEnumeration stringEnumeration) {
        this.stringEnumeration = stringEnumeration;
    }

    /**
     * Validation implementation.
     *
     * @param value   value The value to be validated.
     * @param context ConstraintValidatorContext.
     * @return true if the value is included in the enum values, false otherwise.
     */
    @Override
    public boolean isValid(final String value, final ConstraintValidatorContext context) {

        // This case is handled saperately within @NotBlank validation
        if (StringUtils.isBlank(value)) {
            return true;
        }

        final Object[] enumElements = this.stringEnumeration.enumClass().getEnumConstants();

        if (enumElements != null) {
            for (final Object enumElement : enumElements) {
                final String enumValue = enumElement.toString();
                if (enumValue.equals(value)
                        || this.stringEnumeration.ignoreCase() && enumValue.equalsIgnoreCase(value)) {
                    return true;
                }
            }
        }

        return false;
    }
}
