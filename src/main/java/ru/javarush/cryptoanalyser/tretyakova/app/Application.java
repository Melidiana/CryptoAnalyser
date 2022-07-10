package ru.javarush.cryptoanalyser.tretyakova.app;

import ru.javarush.cryptoanalyser.tretyakova.Results;
import ru.javarush.cryptoanalyser.tretyakova.controller.MainController;

import java.util.Arrays;

public class Application {
    private final MainController mainController;

    public Application(MainController mainController) {
        this.mainController = mainController;
    }

    public Results run(String[] args) {
        String command = args[0];
        String[] parameters = Arrays.copyOfRange(args,1, args.length);
        Results results = mainController.execute(command, parameters);
        return results;
    }
}
