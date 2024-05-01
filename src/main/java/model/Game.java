package model;

import enums.Judgement;
import utils.RandomNumberGenerator;

import java.util.ArrayList;
import java.util.List;

public class Game {

    private final String answer;
    private List<String> numberHistory = new ArrayList<>();
    private List<List<Judgement>> judgementHistory = new ArrayList<>();

    public Game() {
        this.answer = RandomNumberGenerator.generateRandomNumber();
    }

    public void addNumberHistory(String number) {
        numberHistory.add(number);
    }

    public void addJudgementHistory(List<Judgement> judgement) {
        judgementHistory.add(judgement);
    }

}