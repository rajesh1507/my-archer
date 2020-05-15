/* rajesh.sahoo created on 22/04/20 10:49 AM inside the package - com.archer */
package com.archer;


enum Days{
    SUNDAY("1"), MONDAY("2"), TUESDAY("3"), WEDNESDAY("4"), THURSDAY("5"), FRIDAY("6"), SATURDAY("7");

    private String action;

    private Days(String action){
        this.action = action;
    }

    public String getDayNumber(){
        return this.action;
    }
    public void DaysInfo(){
        System.out.println("Days contained in a weeek.");
    }
}


public class ConstructorExampleWithEnum {
    Days day;
    public ConstructorExampleWithEnum(Days day){
        this.day = day;
    }

    public void dayIsLike(){
        switch (day){
            case MONDAY:
                System.out.println("Wake up its a new week.");
                break;
            case TUESDAY:
                System.out.println("Now you will get used to it.");
                break;
            case FRIDAY:
                System.out.println("Just one day left.");
                break;
            case SATURDAY:
                System.out.println("Party time.");
                break;
            default:
                System.out.println("You are no special.");
                break;
        }
    }

    public static void main(String[] args) {
        String today = "MONDAY";
        ConstructorExampleWithEnum c1 = new ConstructorExampleWithEnum(Days.valueOf(today));
        c1.dayIsLike();
        Days d2 = Days.MONDAY;
        d2.DaysInfo();
        Days arr[] = Days.values();
        for (Days day : arr){
            System.out.println(day + " : " + day.ordinal() + day.getDayNumber());    //Displays the elements with index.
        }
    }
}
