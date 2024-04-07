import java.sql.*;
public class ConnectionDB
{
    public ConnectionDB() throws SQLException {}
    protected String url = "jdbc:mysql://localhost/cards?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=Europe/Moscow";//!!!!!!!!!!!!!!!!!!!!!
    protected String user = "root";
    protected String pass = "Whoiam89%who";
    protected Connection connection = DriverManager.getConnection(url,user,pass);
    public void Connection()
    {
        try
        {
            Class.forName("сom.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();
            try
            {
                Connection connection = DriverManager.getConnection(url,user,pass);
            }
            catch (Exception e)
            {
                System.out.println("Ошибка установления соединения с БД:" + e);
            }
        }
        catch (Exception e)
        {
            System.out.println("Ошибка взаимодействия с драйвером:" + e);
        }
    }
}