package com.reavture.controllers;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

// import java.io.IOException;
// import java.io.InputStream;
// import java.io.InputStreamReader;
// import java.io.Reader;

public class EmployeeController implements HttpHandler {

  @Override
  public void handle(HttpExchange exchange) throws IOException {
    // TODO Auto-generated method stub
    String verb = exchange.getRequestMethod();

    switch (verb) {
      case "POST":
        postRequest(exchange);
        break;
      default:
        break;
    }
  }

  private void postRequest(HttpExchange exchange) throws IOException {
    //inputstream has abunch of bytes so it is not a string
    InputStream is = exchange.getRequestBody();

    //We need to convert the Input Stream into a String
    //Stringbuilder is like amutable version of a string
    StringBuilder textBuilder = new StringBuilder();
    //Converts our binary to letters
    //try_resource block will automatically close the resource within the parenthesis
    try (
      //Bufferedreader helps us to read the inputstream
      Reader reader = new BufferedReader(
        new InputStreamReader(
          is,
          Charset.forName(StandardCharsets.UTF_8.name())
        )
      )
    ) {
      int c = 0;
      //read() method from BufferReader will give a -1 if there are no more letters left
      //TLDR keep reading each letter until there are none left
      while ((c = reader.read()) != -1) {
        //append() method adds the letter to your text
        textBuilder.append((char) c);
      }
    }
    System.out.println(textBuilder.toString());

    exchange.sendResponseHeaders(200, textBuilder.toString().getBytes().length);

    OutputStream os = exchange.getResponseBody();
    os.write(textBuilder.toString().getBytes());
    os.close();
  }
}
