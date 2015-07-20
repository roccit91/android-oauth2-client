package org.sdf.danielsz;

import java.net.URI;
import java.util.Map;

public class OAuthException extends RuntimeException {
    private int code;
    private URI uri;
    private Map<String, Object> jsonResponse;

    public OAuthException() {
    }

    public OAuthException(String message) {
        super(message);
    }

    public void setCode(int code) {
        this.code = code;
    }

    public void setUri(URI uri) {
        this.uri = uri;
    }

    public int getCode() {
        return code;
    }

    public URI getUri() {
        return uri;
    }

    public Map<String, Object> getJsonResponse() {
        return jsonResponse;
    }

    public void setJsonResponse(Map<String, Object> jsonResponse) {
        this.jsonResponse = jsonResponse;
    }
}