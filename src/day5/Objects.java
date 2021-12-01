package day5;

public class  Objects{

    public static void main(String[] data) {
        System.out.println("intial rate " + bill.rate);
        bill.rate = 22;
        bill obj = new bill();
        int total = obj.total(12);
        System.out.println("Total " + total);
        System.out.println("New Rate "+obj.rate);

    }

}

class bill {

    static int rate = 11;
    String name;

    int total(int qty) {
//		int num1=21;
//		int num2=22;
        return qty * rate;
    }

}