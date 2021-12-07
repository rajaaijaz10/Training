package day9;

public class enumExternal {
    public static void main(String[] args) {
        enumDemo day=enumDemo.SUNDAY;
        switch (day){
        case SUNDAY:
        System.out.println("This is Sunday");
        break;
        case FRIDAY:
            System.out.println("This is Friday");
            break;
        default:
           System.out.println("invalid");

        }
    }

}
