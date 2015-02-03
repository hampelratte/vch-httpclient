package de.berlios.vch.http.client;

import java.util.List;
import java.util.Map;

public class HttpResponse {
    private String content;

    private Map<String, List<String>> header;

    public HttpResponse(String content, Map<String, List<String>> header) {
        super();
        this.content = content;
        this.header = header;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Map<String, List<String>> getHeader() {
        return header;
    }

    public void setHeader(Map<String, List<String>> header) {
        this.header = header;
    }
}
