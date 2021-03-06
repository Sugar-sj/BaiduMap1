package com.example.baidumap;

import com.baidu.location.BDAbstractLocationListener;
import com.baidu.location.BDLocation;
import com.baidu.mapapi.map.MyLocationData;



public class MyLocationListener extends BDAbstractLocationListener {
    public MyLocationData locData =null;

    @Override
    public void onReceiveLocation(BDLocation location) {
        //mapView 销毁后不在处理新接收的位置
        if (location == null ){
            return;
        }
                locData = new MyLocationData.Builder()
                .accuracy(location.getRadius())
                // 此处设置开发者获取到的方向信息，顺时针0-360
                .direction(location.getDirection()).latitude(location.getLatitude())
                .longitude(location.getLongitude()).build();

    }
}
