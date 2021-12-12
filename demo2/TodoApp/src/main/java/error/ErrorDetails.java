package error;

import java.util.Date;

public class ErrorDetails {
	private String message;
	private String url;
	private Date timestamp;
	
	public ErrorDetails() {
		super();
		this.timestamp = new Date();
	}
	
	public ErrorDetails(String message, String url) {
		this();
		this.message = message;
		this.url = url;
	}

	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public Date getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}
}
