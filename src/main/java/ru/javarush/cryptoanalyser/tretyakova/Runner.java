package ru.javarush.cryptoanalyser.tretyakova;

import ru.javarush.cryptoanalyser.tretyakova.app.Application;
import ru.javarush.cryptoanalyser.tretyakova.controller.MainController;

public class Runner {
    public static void main(String[] args) {
        MainController mainController = new MainController();
        Application application = new Application(mainController);
        Results result = application.run(args);
        System.out.println(result);
    }
}
