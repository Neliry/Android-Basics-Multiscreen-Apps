public class ReportCard {
    private String name;
    private int historyGrade;
    private int englishGrade ;
    private int mathGrade;
    private int biologyGrade;
    private int chemistryGrade;

    public ReportCard(String name, int historyGrade, int englishGrade, int mathGrade, int biologyGrade, int chemistryGrade){
        this.name=name;
        this.historyGrade=historyGrade;
        this.englishGrade=englishGrade;
        this.mathGrade=mathGrade;
        this.biologyGrade=biologyGrade;
        this.chemistryGrade=chemistryGrade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHistoryGrade() {
        return historyGrade;
    }

    public void setHistoryGrade(int grade) {
        historyGrade = grade;
    }

    public int getEnglishGrade() {
        return englishGrade;
    }

    public void setEnglishGrade(int grade) {
        englishGrade = grade;
    }

    public int getMathGrade() {
        return mathGrade;
    }

    public void setMathGrade(int grade) {
        mathGrade = grade;
    }

    public int getBiologyGrade() {
        return biologyGrade;
    }

    public void setBiologyGrade(int grade) {
        biologyGrade = grade;
    }

    public int getChemistryGrade() {
        return chemistryGrade;
    }

    public void setChemistryGrade(int grade) {
        chemistryGrade = grade;
    }

    @Override
    public String toString() {
        String report="Name: "+name+"; "+
                "History grade: "+historyGrade+"; "+
                "English grade: "+englishGrade+"; "+
                "Math grade: "+mathGrade+"; "+
                "Biology grade: "+biologyGrade+"; "+
                "Chemistry grade: "+chemistryGrade+" .";
        return report;
    }

}
