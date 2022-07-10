package ru.javarush.cryptoanalyser.tretyakova.constans;

public class Strings {
    private static final String rus = "йцукенгшщзхъфывапролджэячсмитьбю";
    private static final String eng = "qwertyuiopasdfghjklzxcvbnm";
    private static final String cyphers = "1234567890";
    private  static final String symbols = "[];/@!?:{}";

    private static final String alphabet = rus + rus.toUpperCase() + eng + eng.toUpperCase() + cyphers + symbols;
}
