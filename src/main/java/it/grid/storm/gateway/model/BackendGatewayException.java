package it.grid.storm.gateway.model;

public class BackendGatewayException extends RuntimeException {

  private static final long serialVersionUID = 1L;

  public BackendGatewayException(String message, Throwable cause) {
    super(message, cause);
  }

  public BackendGatewayException(String message) {
    super(message);
  }


}
