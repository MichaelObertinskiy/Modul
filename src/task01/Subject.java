package task01;

import java.util.Random;

public class Subject {

    int mathematics;
    int phisics;
    int chemistry;
    int language;

    public int getMathematics() {
        return mathematics;
    }

    public void setMathematics(int mathematics) {
        this.mathematics = mathematics;
    }

    public int getPhisics() {
        return phisics;
    }

    public void setPhisics(int phisics) {
        this.phisics = phisics;
    }

    public int getChemistry() {
        return chemistry;
    }

    public void setChemistry(int chemistry) {
        this.chemistry = chemistry;
    }

    public int getLanguage() {
        return language;
    }

    public void setLanguage(int language) {
        this.language = language;
    }

    public Subject(int mathematics, int phisics, int chemistry, int language) {

        this.mathematics = mathematics;
        this.phisics = phisics;
        this.chemistry = chemistry;
        this.language = language;
    }





}
