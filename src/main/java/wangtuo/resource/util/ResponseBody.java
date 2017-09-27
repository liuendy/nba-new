package wangtuo.resource.util;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

public class ResponseBody<T> implements Serializable {
	private static final long serialVersionUID = 1L;

	@JsonInclude(Include.NON_NULL)
	private String message;

	@JsonInclude(Include.NON_NULL)
	private T t;

	public ResponseBody(String message, T t) {
		super();
		this.message = message;
		this.t = t;
	}

	public ResponseBody(T o) {
		if(o instanceof String) {
			this.message=(String)o;
		}
		else {
			this.t=o;
		}
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}

	@Override
	public String toString() {
		return "ResponseBody [message=" + message + ", t=" + t + "]";
	}
}
