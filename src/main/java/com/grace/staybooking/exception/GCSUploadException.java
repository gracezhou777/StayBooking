package com.grace.staybooking.exception;

public class GCSUploadException extends RuntimeException {
  public GCSUploadException(String message) {
    super(message);
  }
}