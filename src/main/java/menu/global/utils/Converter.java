package menu.global.utils;

import java.util.Arrays;
import java.util.List;

public class Converter {
    private static final String DELIMITER = ",";

    public Converter() {
    }

    public static List<String> splitDelimiter(final String value) {
        return Arrays.stream(value.split(DELIMITER))
                .map(String::trim)
                .toList();
    }
}
