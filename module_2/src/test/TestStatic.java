package test;

public class TestStatic {
    static String aa ="sagasga";
    static void Add(){
        System.out.println("Hello");
    }
    static {
        aa+="fasga";
        Add();
        final String a = "sagasg";
    }
}
