package wrapper.wrapper;

import java.io.PrintWriter;

public class CustomizedWriter extends PrintWriter{
	PrintWriter out;

	public CustomizedWriter(PrintWriter out) {
		super(out);
		this.out = out;
	}

	@Override
	public void println(String data) {
		System.out.println("CustomizedWriter.println()");
		if(data.isBlank()) {
			//replace blank data with <br> tags
			out.println("<br>");
		} else {
			out.println(data);
		}
	}

}
