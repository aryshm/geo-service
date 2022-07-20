package ru.netology.i18n;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import ru.netology.entity.Country;

public class TestLocalizationServiceImpl {

    @Test
    void testLocal() {
        LocalizationService localizationService = Mockito.spy(LocalizationServiceImpl.class);
        Assertions.assertEquals("Добро пожаловать", localizationService.locale(Country.RUSSIA));
    }

}
