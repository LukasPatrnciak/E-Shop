package com.lukaspatrnciak.eshop.data.item.service.comparator;

import com.lukaspatrnciak.eshop.data.item.domain.WithName;

import java.util.Comparator;

/*
 * Comparator<T> - trieda (interface), ktora porovnava dve instancie daneho objektu
 * @Singleton - navrhovy vzor, zabezpeci, ze mame vzdy iba jednu instanciu danej triedy
 *            - namiesto vytvarania novej instancie sa budeme dopytovat na getter danej instancie
 * Spring - existuje iba jedna servisa v celej beziacej aplikacii (nemozu sa spravat vzdy rovnako - ukladat nejake atributy)
 */
public class NameComparator implements Comparator<WithName> {
    private static NameComparator instance;

    private NameComparator() { // Nie je mozne to zavolat nikde inde
    }

    @Override
    public int compare(WithName firstName, WithName secondName) {
        return firstName.getName().compareTo(secondName.getName()); // Zoradenie podla mena, String ma metodu compareTo()
    }

    public static NameComparator getInstance() {
        if(instance == null) {
            instance = new NameComparator();
        }

        return instance;
    }

    public static void setInstance(NameComparator instance) {
        NameComparator.instance = instance;
    }
}
