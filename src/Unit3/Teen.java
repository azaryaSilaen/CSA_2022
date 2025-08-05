package Unit3;/*
Author: Azarya Silaen
 */

public class Teen {

    private String firstName;
    private String lastName;
    private int grade;
    private boolean wantToText;

    public Teen (String firstName, String lastName, int grade, boolean wantToText) {
       this.firstName = firstName;
       this.lastName = lastName;
       this.grade = grade;
       this.wantToText = wantToText;
    }
    public Teen (String firstName, String lastName, int grade) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.grade = grade;
        wantToText = false;
    }

    @Override
    public String toString() {

        if (wantToText) {
            return firstName + " " + lastName + " is in grade " + grade + " and wants to send this text:";
        }
        else {
            return firstName + " " + lastName + " is in grade " + grade + " and don't wants to send this text:";

        }
    }
    public static String teenTalk (String text) {
        text = text.replaceAll("!", "!!");
        text = text.replaceAll("\\.", "!!");
        return text;
    }
}
