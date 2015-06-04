package org.sdf.danielsz;

import java.net.URI;

public class OAuthException extends RuntimeException {
    private int code;
    private URI uri;

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
}