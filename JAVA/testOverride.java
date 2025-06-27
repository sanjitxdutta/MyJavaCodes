class parent{
    public void home(){
        System.out.println("Existing home.\n");
    }
    public void car(){
        System.out.println("Existing car.\n");
    }
}

class child extends parent{
    @override
    public void car(){
        System.out.println("New car.\n");
    }
}

public class testOverride {
    public static void main(String [] args){
        child c1 = new child();
        c1.home();
        c1.car();
    }
}
