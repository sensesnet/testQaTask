package task2;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Map;

public class JSONParser {

    private String jsonFilePath;
    private Map<String, Object> jsonToMap;

    public JSONParser(String jsonFilePath) {
        this.jsonFilePath = jsonFilePath;
    }

    public List<Terminal> parseJsonArray(String jsonBlock) throws  IOException {

        byte[] jsonData = Files.readAllBytes(Paths.get(jsonFilePath));
        ObjectMapper mapper = new ObjectMapper();
        return mapper.readValue(jsonData, new TypeReference<List<Terminal>>() {
        });
    }
}
