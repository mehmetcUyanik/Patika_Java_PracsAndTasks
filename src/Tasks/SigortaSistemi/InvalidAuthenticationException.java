package Tasks.SigortaSistemi;

public class InvalidAuthenticationException extends Exception{
    public InvalidAuthenticationException(String msg){
        super(msg);
        System.out.println("Invalid password!");
    }
}
