package org.example;

import com.google.api.client.http.GenericUrl;
import com.google.api.client.http.HttpRequestFactory;
import com.google.api.client.http.javanet.NetHttpTransport;
import java.io.IOException;

public class Main {

  public static void main(String[] args) throws IOException {
    NetHttpTransport netHttpTransport = new NetHttpTransport();
    HttpRequestFactory requestFactory = netHttpTransport.createRequestFactory();
    while (true) {
      requestFactory.buildGetRequest(new GenericUrl("https://www.google.com"));
    }
  }
}