package io.github.cinzfurz.cinzapi.json;

import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

public class JsonHelper {
    public static JsonElement parse(String json) {
        return JsonParser.parseString(json);
    }
}
