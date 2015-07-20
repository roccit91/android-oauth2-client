package org.sdf.danielsz;

public class OAuth2Client {

	private final static String DEFAULT_GRANT_TYPE = "password";

	private final String username;
	private final String password;
	private final String clientId;
	private final String clientSecret;
	private final String site;
	private final String googleAccessToken;

	public OAuth2Client(String username, String password, String clientId, String clientSecret, String site) {
		this.username = username;
		this.password = password;
		this.googleAccessToken = null;
		this.clientId = clientId;
		this.clientSecret = clientSecret;
		this.site = site;
	}

	public OAuth2Client(String googleAccessToken, String clientId, String clientSecret, String site) {
		this.username = null;
		this.password = null;
		this.googleAccessToken = googleAccessToken;
		this.clientId = clientId;
		this.clientSecret = clientSecret;
		this.site = site;
	}

	public String getUsername() {
		return username;
	}


	public String getPassword() {
		return password;
	}


	public String getClientId() {
		return clientId;
	}


	public String getClientSecret() {
		return clientSecret;
	}


	public String getSite() {
		return site;
	}

	public Token getAccessTokenFromGoogle(String grantType) {
		OAuth2Config oauthConfig = new OAuth2Config.OAuth2ConfigBuilder(googleAccessToken, clientId, clientSecret, site)
				.grantType(grantType).build();
		return OAuthUtils.getAccessToken(oauthConfig, true);
	}

	public Token getAccessToken(String grantType) {
		OAuth2Config oauthConfig = new OAuth2Config.OAuth2ConfigBuilder(username, password, clientId, clientSecret, site)
			.grantType(grantType).build();
		return OAuthUtils.getAccessToken(oauthConfig);
	}

	public Token getAccessToken() {
		return getAccessToken(DEFAULT_GRANT_TYPE);
	}
}
