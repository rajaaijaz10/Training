package access.pkg1;

public class diffClassSamePack extends Parent{
    public static void main(String[] args) {
        Parent obj=new Parent();
//        System.out.println("Different class -->>  "+obj.sprivate); //not accessable
        System.out.println("Different class same pack -->>  "+obj.spublic);
        System.out.println("Different class same pack -->>  "+obj.sprotected);
        System.out.println("Different class same pack -->>  "+obj.sdef);
    }
}
