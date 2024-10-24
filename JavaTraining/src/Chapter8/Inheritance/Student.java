package Chapter8.Inheritance;

public class Student {
    private String stName;
    private String stNumber;
    private int testMark, assignment1, assignment2;
    private String results;

    public Student(String stName, String stNumber, int testMark, int assignment1, int assignment2, String results) {
        this.stName = stName;
        this.stNumber = stNumber;
        this.testMark = testMark;
        this.assignment1 = assignment1;
        this.assignment2 = assignment2;
        this.results = results;
    }

    public String getStName() {
        return stName;
    }

    public void setStName(String stName) {
        this.stName = stName;
    }
    public String getStNumber() {
        return "ST-" + stNumber;
    }

    public void setStNumber(String stNumber) {
        this.stNumber = stNumber;
    }

    public int getTestMark() {
        return testMark;
    }

    public void setTestMark(int testMark) {
        this.testMark = testMark;
    }

    public int getAssignment1() {
        return assignment1;
    }

    public void setAssignment1(int assignment1) {
        this.assignment1 = assignment1;
    }

    public int getAssignment2() {
        return assignment2;
    }

    public void setAssignment2(int assignment2) {
        this.assignment2 = assignment2;
    }

    public String getResults() {
        return results;
    }

    public void setResults(String results) {
        this.results = results;
    }

    public void displayDetails(){
        System.out.println("Name: " + getStName() +
                "\nStudent No: " + getStNumber() +
                "\nTest Mark: " + getTestMark() +
                "\nAssignment 1: " + getAssignment1() +
                "\nAssignment 2: " + getAssignment2() +
                "\nResults: " + getResults());
    }
}
