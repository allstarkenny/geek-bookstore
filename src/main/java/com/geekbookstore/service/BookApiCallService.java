package com.geekbookstore.service;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.*;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.Map;

public class BookApiCallService {
    // https://openapi.naver.com/v1/search/book.xml?query=%EC%A3%BC%EC%8B%9D&display=10&start=1
    public JSONObject get(String url) throws Exception {
        RestTemplate restTemplate = new RestTemplate();

        HttpHeaders headers = new HttpHeaders();
        headers.add("X-Naver-Client-Id", "BmFvOpudRFwUOD0pKY9B");
        headers.add("X-Naver-Client-Secret", "5RAZgtaAZB");

        ResponseEntity<String> result = restTemplate.exchange(new URI(url),
                HttpMethod.GET,
                new HttpEntity<>(headers),
                new ParameterizedTypeReference<>(){});

        int code = result.getStatusCodeValue();
        String data = result.getBody();

        JSONParser jsonParser = new JSONParser();
        Object object = jsonParser.parse(data);
        JSONObject jsonObject = (JSONObject)object;
        return jsonObject;
    }
}
