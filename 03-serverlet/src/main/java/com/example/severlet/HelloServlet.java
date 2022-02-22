package com.example.severlet;

import java.io.*;
import java.util.Scanner;

import jakarta.servlet.Servlet;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletOutputStream;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(urlPatterns = {"/res"})
public class HelloServlet extends HttpServlet {
    private String message;

    @Override
    public void init() {
        message = "Hello World!";
    }

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String type = request.getParameter("type");
        switch (type) {
            case "html":
                getHtml(response);
                break;
            case "json":
                getJson(response);
                break;
            case "img":
                getImg(request, response);
                break;
            default:
                break;
        }


    }

    private void getHtml(HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + message + "</h1>");
        out.println("<img src=\"image/111.jpg\">");
        out.println("</body></html>");
        out.flush();
        out.close();
    }

    private void getJson(HttpServletResponse response) throws IOException {
        response.setContentType("application/json");
        PrintWriter out = response.getWriter();
        String json = "{\"姓名\":\"张三\",\"年龄\": 23,\"学校\":\"南京工业职业技术大学\"" +
                "}";
        out.println(json);
        out.flush();
        out.close();
    }

    private void getImg(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("image/jpg");
        String path = request.getServletContext().getRealPath("");
        File file = new File(path + "image/111.jpg");
        InputStream in = new FileInputStream(file);
        int read = 0;
        ServletOutputStream out = response.getOutputStream();
        while ((read = in.read()) != -1) {
            out.write(read);
        }
        out.flush();
        out.close();
    }

    public void destroy() {
    }
}