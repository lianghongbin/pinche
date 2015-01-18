package com.autohome.pinche.algorithm;

import com.autohome.pinche.exceptions.CalculateException;
import com.autohome.pinche.Endpoint;
import com.autohome.pinche.Range;

/**
 * Created by lianghongbin on 1/16/15.
 * Description：根据给定的一个点，以及一个距离，计算出该距离内的坐标经纬度范围
 */
public interface Boundary {

    /**
     * 计算给定坐标一定范围内的坐标点的经纬度范围
     * @param endpoint 给定坐标点
     * @param radius 距离范围
     * @return 经纬度范围
     * @throws CalculateException
     */
    public Range calculate(Endpoint endpoint, int radius) throws CalculateException;
}
