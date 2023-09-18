import java.sql.SQLException;

public class Exception {

   SQLException e;


   public Exception (SQLException e){
       this.e = e;
   }

    public String getMessage() {
        return "Fehler Text in die PreparedStatement. Fehlertext:" + "\n\n" + e;
    }

}