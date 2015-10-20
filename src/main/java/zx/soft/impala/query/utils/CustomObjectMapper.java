package zx.soft.impala.query.utils;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;

import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * 自定义的ObjectMapper类，用于处理时间格式
 *
 * @author wanggang
 *
 */
public class CustomObjectMapper extends ObjectMapper {

	private static final long serialVersionUID = -3341366863221844412L;

	public static DateFormat sinaDateFormat = new SimpleDateFormat("EEE MMM dd HH:mm:ss zzz yyyy", Locale.US);

	public CustomObjectMapper() {
		super();
		setDateFormat(sinaDateFormat);
	}

}
