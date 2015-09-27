package in.buzzzz.util;

import java.util.List;
import java.util.Map;

/**
 * Created by intelligrape on 27/9/15.
 */
public class ObjectUtils {

    public static boolean isEmptyMap(Map map) {
        return (isEmptyObject(map) || map.isEmpty());
    }

    public static boolean isNotEmptyMap(Map map) {
        return (!isEmptyMap(map));
    }

    public static boolean isEmptyString(String object) {
        return (isEmptyObject(object) || "".equals(object));
    }

    public static boolean isNotEmptyString(String string) {
        return !(isEmptyString(string));
    }

    public static boolean isEmptyObject(Object object) {
        return (object == null);
    }

    public static boolean isNotEmptyObject(Object object) {
        return (!isEmptyObject(object));
    }

    public static boolean isEmptyList(List list) {
        return (isEmptyObject(list) || list.isEmpty());
    }

    public static boolean isNotEmptyList(List list) {
        return !isEmptyList(list);
    }

    public static Long nullSafeParseLong(String longString) {
        Long number = 0L;
        if (isNotEmptyString(longString)) {
            try{
                number = Long.parseLong(longString);
            }catch (Exception e) {
                number = 0L;
            }
        }
        return number;
    }
}
