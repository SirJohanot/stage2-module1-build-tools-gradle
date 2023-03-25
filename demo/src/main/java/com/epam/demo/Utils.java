package com.epam.demo;

import com.epam.utils.StringUtils;

import java.util.List;
import java.util.Optional;

public class Utils {
    public static Optional<Boolean> isAllPositiveNumbers(List<String> args) {
        return args.stream()
                .map(StringUtils::isPositiveNumber)
                .reduce((a, b) -> a && b);
    }
}