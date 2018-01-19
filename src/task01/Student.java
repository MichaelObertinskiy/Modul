package task01;

public class Student extends Person{

    private int mathematics;
    private int phisics;
    private int language;
    private int history;

    public Student(String name, String surname, int mathematics, int phisics, int language, int history) {
        super(name, surname);
        this.mathematics = mathematics;
        this.phisics = phisics;
        this.language = language;
        this.history = history;
    }

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

    public int getLanguage() {
        return language;
    }

    public void setLanguage(int language) {
        this.language = language;
    }

    public int getHistory() {
        return history;
    }

    public void setHistory(int history) {
        this.history = history;
    }
}


