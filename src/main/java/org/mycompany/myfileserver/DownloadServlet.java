package org.mycompany.myfileserver;

import java.io.*;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

@WebServlet("/DownloadServlet")
public class DownloadServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String path = "src/main/webapp/uploadfiles";
        File directory = new File(path);
        if (directory.isDirectory()) {
            String[] content = directory.list();

            if (content != null) {
                response.setContentType("charset=utf-8");
                PrintWriter out = response.getWriter();
//                getServletContext().getRequestDispatcher("/download.jsp").forward(
//                        request, response);
                out.println(" <center><h1>Select file for download</h1></center>");
                for (String eachFile : content) {
                    File file = new File(path + "/" + eachFile);
                    out.println(file.isDirectory() ? ("<center>" + eachFile + " is directory</br>") : ("<center><a href=localhost:8888/DownloadServlet>" + eachFile + "</a></br><center>"));
                }
                out.close();
            }
        }
//        String filePath = path;
//        File downloadFile = new File(filePath);
//        FileInputStream inStream = new FileInputStream(downloadFile);
//
//        // if you want to use a relative path to context root:
//        String relativePath = getServletContext().getRealPath("");
//        System.out.println("relativePath = " + relativePath);
//
//        // obtains ServletContext
//        ServletContext context = getServletContext();
//
//        // gets MIME type of the file
//        String mimeType = context.getMimeType(filePath);
//        if (mimeType == null) {
//            // set to binary type if MIME mapping not found
//            mimeType = "application/octet-stream";
//        }
//        System.out.println("MIME type: " + mimeType);
//
//        // modifies response
//        response.setContentType(mimeType);
//        response.setContentLength((int) downloadFile.length());
//
//        // forces download
//        String headerKey = "Content-Disposition";
//        String headerValue = String.format("attachment; filename=\"%s\"", downloadFile.getName());
//        response.setHeader(headerKey, headerValue);
//
//        // obtains response's output stream
//        OutputStream outStream = response.getOutputStream();
//
//        byte[] buffer = new byte[4096];
//        int bytesRead = -1;
//
//        while ((bytesRead = inStream.read(buffer)) != -1) {
//            outStream.write(buffer, 0, bytesRead);
//        }
//
//        inStream.close();
//        outStream.close();
//    }

    }
}

