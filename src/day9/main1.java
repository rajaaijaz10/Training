package day9;

public class main1  {
    // Enums
    public enum enumDemo {
        SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;
        int id;

        public void display() {
            System.out.println(day9.enumDemo.SUNDAY);

        }

    }

        public static void main(String[] args) {
       for(enumDemo ob: enumDemo.values())
           System.out.println(ob);

    }

}
