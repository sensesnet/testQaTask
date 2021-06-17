package task2;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DBPreparedData {

    private String dbName = "???";
    private String dbLink = "???";
    private String username = "???";
    private String password = "???";
    private String databaseClass = "???";

    private String SQL_SELECT = "SELECT (terminal_id, mobility_id, link_id) FROM public.terminal;";
    private String SQL_SELECT_BY_ID = "SELECT (terminal_id, mobility_id, link_id) FROM public.terminal WHERE terminal_id=?;";


    public Terminal getTerminalDataById(String id) {
        Terminal terminal = new Terminal();
        DBConnection connection = new DBConnection(dbName, dbLink, username, password, databaseClass);

        try (ResultSet rs = connection.select(SQL_SELECT_BY_ID, id)) {
            while (rs.next()) {
                terminal.setTid(rs.getString("terminal_id"));
                terminal.setLid(rs.getString("mobility_id"));
                terminal.setMid(rs.getString("link_id"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            connection.closeConnection();
        }
        return terminal;
    }

    public List<Terminal> getTerminalData() {
        List<Terminal> list = new ArrayList<>();
        DBConnection connection = new DBConnection(dbName, dbLink, username, password, databaseClass);

        try (ResultSet rs = connection.select(SQL_SELECT)) {
            while (rs.next()) {
                Terminal terminal = new Terminal();
                terminal.setTid(rs.getString("terminal_id"));
                terminal.setLid(rs.getString("mobility_id"));
                terminal.setMid(rs.getString("link_id"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            connection.closeConnection();
        }
        return list;
    }
}
