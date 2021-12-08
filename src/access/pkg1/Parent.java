package access.pkg1;

public class Parent {
    public String spublic="i m public ";
    private String sprivate="i m private";
    protected String sprotected="i m protected";
                String sdef="i m default";
    public static void main(String[] args) {
        Parent obj=new Parent();
        System.out.println("Within class -->>  "+obj.sprivate);
        System.out.println("Within class -->>  "+obj.spublic);
        System.out.println("Within class -->>  "+obj.sprotected);
        System.out.println("Within class -->>  "+obj.sdef);

    }
}
