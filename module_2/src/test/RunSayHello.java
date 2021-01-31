package test;

public class RunSayHello extends SayHello{

    private void sayHi(){
        System.out.println("SAYYYYYYYYYYYYYYYYYY HIIII ben RunSayHello");
    }

    public static void main(String[] args) {
        RunSayHello runSayHello = new RunSayHello();
            runSayHello.sayHi();
    }
}
