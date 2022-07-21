package ru.netology.i18n;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import ru.netology.entity.Country;

import java.util.stream.Stream;

public class TestLocalizationServiceImpl {

    @ParameterizedTest
    @MethodSource("source")
    void testLocal(Country country, String expected) {
        LocalizationService localizationService = new LocalizationServiceImpl();
        String actual = localizationService.locale(country);
        Assertions.assertEquals(expected, actual);
    }
    private static Stream<Arguments> source() {
        return Stream.of(
                Arguments.of(Country.RUSSIA, "Добро пожаловать"),
                Arguments.of(Country.USA, "Welcome")
        );
    }
}
