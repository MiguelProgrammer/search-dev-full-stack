package br.com.desafioavanade.searchdev.validation.exception;

public class AnalystException extends RuntimeException {
	/**
	 * Constructs a new runtime exception with {@code null} as its
	 * detail message.  The cause is not initialized, and may subsequently be
	 * initialized by a call to {@link #initCause}.
	 */
	public AnalystException() {
	}

	/**
	 * Constructs a new runtime exception with the specified detail message.
	 * The cause is not initialized, and may subsequently be initialized by a
	 * call to {@link #initCause}.
	 *
	 * @param message the detail message. The detail message is saved for
	 *                later retrieval by the {@link #getMessage()} method.
	 */
	public AnalystException(String message) {
		super(message);
	}

	/**
	 * Constructs a new runtime exception with the specified detail
	 * message, cause, suppression enabled or disabled, and writable
	 * stack trace enabled or disabled.
	 *
	 * @param message            the detail message.
	 * @param cause              the cause.  (A {@code null} value is permitted,
	 *                           and indicates that the cause is nonexistent or unknown.)
	 * @param enableSuppression  whether or not suppression is enabled
	 *                           or disabled
	 * @param writableStackTrace whether or not the stack trace should
	 *                           be writable
	 * @since 1.7
	 */
	public AnalystException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}
}
