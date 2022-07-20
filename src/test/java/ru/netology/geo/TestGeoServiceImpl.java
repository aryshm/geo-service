package ru.netology.geo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import ru.netology.entity.Country;
import ru.netology.entity.Location;

public class TestGeoServiceImpl {

    @Test
    void test_by_ip() {
        Location expected = new Location("Moscow", Country.RUSSIA, "Lenina", 15);
        GeoService geoService = Mockito.spy(GeoServiceImpl.class);
        Assertions.assertEquals(expected, geoService.byIp("172.0.32.11"));
    }
}
