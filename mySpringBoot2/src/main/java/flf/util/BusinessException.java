/**
 * 
 */
package flf.util;

import java.io.Serializable;

/**
 * ҵ���߼��쳣
 * @author Kevin
 *
 */public class BusinessException extends RuntimeException implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -4041018927087144085L;

	public BusinessException() {
		super();
	}

	public BusinessException(String message, Throwable cause,
			boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public BusinessException(String message, Throwable cause) {
		super(message, cause);
	}

	public BusinessException(String message) {
		super(message);
	}

	public BusinessException(Throwable cause) {
		super(cause);
	}
	
}
