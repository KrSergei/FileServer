<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
   pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>File Download</title>
</head>
<body>
<center>
    <h1>Select file for download</h1>
    <form method="post" action="DownloadServlet"
        enctype="multipart/form-data">
     <script>
      for (String eachFile : content) {
                         File file = new File(path + "/" + eachFile);
                         out.println(file.isDirectory() ? (eachFile + "is directory") : ("<a href=localhost:8888/DownloadServlet>" + eachFile + "</a></br>"));
                     }
     </script>
    </form>

</center>
</body>
</html>