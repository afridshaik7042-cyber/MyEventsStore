package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * AuthResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-02-09T18:00:15.764766+05:30[Asia/Calcutta]")
public class AuthResponse {

  private String token;

  private Integer expireTime;

  public AuthResponse token(String token) {
    this.token = token;
    return this;
  }

  /**
   * Get token
   * @return token
  */
  
  @Schema(name = "token", example = "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJ1c2VyIn0.signature", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("token")
  public String getToken() {
    return token;
  }

  public void setToken(String token) {
    this.token = token;
  }

  public AuthResponse expireTime(Integer expireTime) {
    this.expireTime = expireTime;
    return this;
  }

  /**
   * Get expireTime
   * @return expireTime
  */
  
  @Schema(name = "expireTime", example = "3500", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("expireTime")
  public Integer getExpireTime() {
    return expireTime;
  }

  public void setExpireTime(Integer expireTime) {
    this.expireTime = expireTime;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuthResponse authResponse = (AuthResponse) o;
    return Objects.equals(this.token, authResponse.token) &&
        Objects.equals(this.expireTime, authResponse.expireTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(token, expireTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthResponse {\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    expireTime: ").append(toIndentedString(expireTime)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

