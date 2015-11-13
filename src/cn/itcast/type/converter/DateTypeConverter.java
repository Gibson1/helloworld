package cn.itcast.type.converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

import com.opensymphony.xwork2.conversion.impl.DefaultTypeConverter;

public class DateTypeConverter extends DefaultTypeConverter {

	@Override
	public Object convertValue(Map<String, Object> context, Object value, Class toType) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");
		try {
			if(toType == Date.class){	//当字符串向date转换时
				String[] params = (String[]) value;	//Request.getParameterValues()
				return dateFormat.parse(params[0]);
			}else if(toType == String.class){	//当字符串向string转换时
				Date date = (Date)value;
				return dateFormat.format(date);
			}
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return null;
	}

}
