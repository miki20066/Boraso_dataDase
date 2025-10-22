import java.sql.SQLException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Database db=null;
        try {
            db= new Database();
        } catch (SQLException e) {
            System.err.println("errore di connesione al database"+e.getMessage());
            System.exit(1);

        }

        System.out.println(db.selectAll());

    }
}