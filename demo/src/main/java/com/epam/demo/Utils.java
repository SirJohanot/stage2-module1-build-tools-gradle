package com.epam.demo;

import com.epam.utils.StringUtils;

import java.util.List;

public class Utils {
    public static boolean isAllPositiveNumbers(List<String> args) {
        return args.stream()
                .map(StringUtils::isPositiveNumber)
                .reduce((a, b) -> a && b);
    }
}