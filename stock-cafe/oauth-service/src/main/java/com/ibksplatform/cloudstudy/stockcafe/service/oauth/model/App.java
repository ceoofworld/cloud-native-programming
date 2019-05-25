package com.ibksplatform.cloudstudy.stockcafe.service.oauth.model;

import org.springframework.util.StringUtils;

public class App {

    private Long id;
    private String appKey;
    private String appSecret;
    private String scopes = StringUtils.arrayToCommaDelimitedString(new String[] {"openid"});
    private String authorizedGrantTypes = StringUtils.arrayToCommaDelimitedString(
            new String[] {"authorization_code", "refresh_token", "password"}
    );
    private String authorities = StringUtils.arrayToCommaDelimitedString(
            new String[] {"ROLE_UESER", "ROLE_ADMIN"}
    );
    private String autoApproveScopes = StringUtils.arrayToCommaDelimitedString(
            new String[] {".*"}
    );

    public Long getId() {
        return id;
    }

    public String getAppKey() {
        return appKey;
    }

    public String getAppSecret() {
        return appSecret;
    }

    public String getScopes() {
        return scopes;
    }

    public String getAuthorizedGrantTypes() {
        return authorizedGrantTypes;
    }

    public String getAuthorities() {
        return authorities;
    }

    public String getAutoApproveScopes() {
        return autoApproveScopes;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setAppKey(String appKey) {
        this.appKey = appKey;
    }

    public void setAppSecret(String appSecret) {
        this.appSecret = appSecret;
    }

    public void setScopes(String scopes) {
        this.scopes = scopes;
    }

    public void setAuthorizedGrantTypes(String authorizedGrantTypes) {
        this.authorizedGrantTypes = authorizedGrantTypes;
    }

    public void setAuthorities(String authorities) {
        this.authorities = authorities;
    }

    public void setAutoApproveScopes(String autoApproveScopes) {
        this.autoApproveScopes = autoApproveScopes;
    }
}
