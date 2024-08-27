package servlet_request_response;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/VideoFileResponse")
public class VideoFileResponse extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Setting MIME Type
		response.setContentType("video/mp4");

		// Getting the byte stream to send the response
		ServletOutputStream outputStream = response.getOutputStream();

		// Reading the video file through InputStream
		String path = getServletContext().getRealPath("herosplender.mp4");
		File file = new File(path);
		FileInputStream inputStream = new FileInputStream(file);
		byte[] b = new byte[(int) file.length()];
		inputStream.read(b);

		outputStream.write(b);
		outputStream.flush();

		outputStream.close();
		inputStream.close();
	}

}
