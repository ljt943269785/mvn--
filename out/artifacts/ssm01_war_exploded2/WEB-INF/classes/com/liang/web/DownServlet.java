package com.liang.web;


import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URLEncoder;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.liang.util.IOUtils;

public class DownServlet extends HttpServlet{

    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String filename = request.getParameter("file");

        response.setHeader("Content-Disposition", "attachment;filename="+URLEncoder.encode(filename,"utf-8"));
        response.setContentType(this.getServletContext().getMimeType(filename));//MIME类型

        InputStream in = new FileInputStream(this.getServletContext().getRealPath(filename));
        OutputStream out = response.getOutputStream();
        IOUtils.In2Out(in, out);
        IOUtils.close(in, null);
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }

}
