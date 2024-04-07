public class Main
{
    public static void main(String[] args)
    {
        try
        {
            Options options = new Options();
            options.SalonOptions();
        }
        catch (Exception e)
        {
            System.out.println("Какая-то ошибка:" + e);
        }
    }
}