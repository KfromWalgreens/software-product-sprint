// Copyright 2019 Google LLC
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     https://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.google.sps.servlets;
import com.google.gson.Gson;
import java.io.IOException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.*; 

/** Servlet that returns some example content. TODO: modify this file to handle comments data */
@WebServlet("/data")
public class DataServlet extends HttpServlet {

  @Override
  public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
    String v1 = "test number 1";
    String v2 = "test number 2";
    String v3 = "test number 3";

    ArrayList<String> wat = new ArrayList<>();
    wat.add(v1);
    wat.add(v2);
    wat.add(v3);

    // Convert the server stats to JSON
    String json = convertToJson(wat);

    // Send the JSON as the response
    response.setContentType("application/json;");
    response.getWriter().println(json);
    


   // response.setContentType("text/html;");
    //response.getWriter().println("<h1>Hello Kennedy!</h1>");
  }

  private String convertToJson(ArrayList<String> wat) {
    String json = "{";
    json += "\"test 1\": ";
    json += "\"" + wat.get(0) + "\"";
    json += ", ";
    json += "\"test 2\": ";
    json += "\"" + wat.get(1) + "\"";
    json += ", ";
    json += "\"test 3\": ";
    json += wat.get(2);
    json += "}";
    return json;
  }
}
