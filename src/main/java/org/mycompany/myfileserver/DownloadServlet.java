package org.mycompany.myfileserver;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet (urlPatterns = "/DownloadServlet")

public class DownloadServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String path = "src/main/webapp/uploadfiles";
        File directory = new File(path);
        if (directory.isDirectory()) {
            String[] content = directory.list();
            if (content != null) {
                response.setContentType("charset=utf-8");
                PrintWriter out = response.getWriter();
                for (String eachFile : content) {
                    File file = new File(path + "/" + eachFile);
                    out.println(file.isDirectory() ? (eachFile + "is directory") : (eachFile + "is file"));
                }
                out.close();
            }
        }
    }
}