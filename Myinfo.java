

public class MyInfo {

    public static int myInfoId = 10;
    public static String myInfoName = "Hello";
    public static boolean myInfoActive = true;
    public static double myInfoScore = 20.5;
    public static char myInfoGrade = 'A';

 
    private int infoId;
    private String infoName;
    private boolean infoActive;
    private double infoScore;
    private char infoGrade;

   
    public MyInfo(int infoId, String infoName, boolean infoActive, double infoScore, char infoGrade) {
        this.infoId = infoId;
        this.infoName = infoName;
        this.infoActive = infoActive;
        this.infoScore = infoScore;
        this.infoGrade = infoGrade;
    }

    
}


