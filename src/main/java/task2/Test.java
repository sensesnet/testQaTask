package task2;

import static org.mockito.Mockito.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Test {


    public static void main(String[] args) throws IOException {

        List<Terminal> terminalDataFormJson =
                new JSONParser("src//main//resources//test.json")
                        .parseJsonArray("Terminals");

        List<String> result = new ArrayList<>();

        terminalDataFormJson.forEach(terminalJson -> {
            Terminal terminalDb = new DBPreparedData().getTerminalDataById(terminalJson.getTid());
            if (!terminalJson.equals(terminalDb))
                result.add("Error: Actual val from DB: [" + terminalDb.toString() + "] " +
                        "is NOT equals expected json data: [" + terminalJson.toString() + "]");
            else
                result.add("Info: Actual val from DB: [" + terminalDb.toString() + "] " +
                        "is equal with expected json data: [" + terminalJson.toString() + "]");
        });

        System.out.println(result);

    }
}
