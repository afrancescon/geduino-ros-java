package sun.net.www.protocol.rosrpc;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

public class RosrpcURLConnection extends URLConnection {

	public RosrpcURLConnection(URL url) {
		super(url);
	}

	@Override
	public void connect() throws IOException {
		throw new UnsupportedOperationException(
				"The connect() method is not supported");
	}

	@Override
	public Object getContent() throws IOException {
		throw new UnsupportedOperationException(
				"The getContent() method is not supported");
	}

	@Override
	public InputStream getInputStream() throws IOException {
		throw new UnsupportedOperationException(
				"The getInputStream() method is not supported");
	}

}
