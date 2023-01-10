package DatabaseFakeJson;

public class WrongCredentialsException extends RuntimeException
{
    public WrongCredentialsException()
    {
        super("Wrong credentials");
    }
}
