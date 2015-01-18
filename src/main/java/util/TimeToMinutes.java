package util;

import com.sun.javafx.binding.StringFormatter;
import org.apache.commons.lang3.StringUtils;

/**
 * Created by Administrator on 2015/1/18.
 */
public class TimeToMinutes {

    /**
     * 根据给定的时间，转换成每天从0点开始的分钟数
     * @param time 时间，格式如 13:25
     * @return 从0点开始的分钟数
     */
    public static int toMinutes(String time) {
        String[] times = StringUtils.split(time, ":");

        if (times.length != 2) {
            throw new IllegalArgumentException("时间参数错误！");
        }

        try {
            return Integer.parseInt(times[0]) * 60 + Integer.parseInt(times[1]);
        }
        catch (NumberFormatException e) {
            throw new IllegalArgumentException("时间参数错误！");
        }
    }
}
