package encapsulation;

public class Encapscalling {
    public static void main(String[] args) {
    	
        Encaps e = new Encaps(); 
        e.setMethod(7, 8.2);
        System.out.println(e.getMethod());
        System.out.println(e.getMethod2());
    }
}
