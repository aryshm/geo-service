package ru.netology.geo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import ru.netology.entity.Country;
import ru.netology.entity.Location;

import java.util.stream.Stream;

public class TestGeoServiceImpl {

    @ParameterizedTest
    @MethodSource("source")
    void test_by_ip(String ip, Location expected) {
        GeoService geoService = new GeoServiceImpl();
        Location actual = geoService.byIp(ip);
        Assertions.assertEquals(expected.getCountry(), actual.getCountry());
    }
    private static Stream<Arguments> source() {
        return Stream.of(
                Arguments.of("172.0.32.11",
                        new Location("Moscow", Country.RUSSIA, "Lenina", 15)),
                Arguments.of("96.44.183.149",
                        new Location("New York", Country.USA, " 10th Avenue", 32))
        );
    }
}
