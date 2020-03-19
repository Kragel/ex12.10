package t_12_errorHandingWithExceptions.ex10;

public class App {

    public static void main(String[] args)
    {
        f();
    }

    public static void f()
    {
        try
        {
            g();
        }
        catch (NullPointerException e)
        {
            throw new RuntimeException();
        }

    }

    public static void g()
    {
        throw null;
    }

}
