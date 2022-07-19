package jdbc.exception;

/**
 * 数据库异常基类
 *
 * @author byx
 */
public class DbException extends RuntimeException {
    /**
	 * 
	 */
	private static final long serialVersionUID = -5924628170763291159L;

	public DbException(String msg) {
        super(msg);
    }

    public DbException(String msg, Throwable cause) {
        super(msg, cause);
    }
}
