<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>File Upload and Download</title>
</head>
<body>
<center>
    <h1>File Upload</h1>
    <form method="post" action="UploadServlet"
        enctype="multipart/form-data">
        Select file to upload: <input type="file" name="file" size="60" /><br />
        <br /> <input type="submit" value="Upload" />
    </form>
    <h1>File Download</h1>
    <form  method="get" action="DownloadServlet"
            enctype="multipart/form-data">
            Select from list file to download: <input type="submit" value="Show list" size="60" /><br />
    </form>
    <a href="http://localhost:8888/DowloadServlet"></a>

</center>


</body>
</html>