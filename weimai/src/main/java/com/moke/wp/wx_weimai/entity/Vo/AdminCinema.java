package com.moke.wp.wx_weimai.entity.Vo;

import org.springframework.data.elasticsearch.core.geo.GeoPoint;

import com.moke.wp.wx_weimai.entity.Cinema;

public class AdminCinema extends Cinema {
    private String brandName;

    public AdminCinema(Cinema cinema){
        this.setId(cinema.getId());
        this.setNm(cinema.getNm());
        this.setAddr(cinema.getAddr());
        this.setEndorse(cinema.getEndorse());
        this.setAllowrefund(cinema.getAllowrefund());
        this.setBrandId(cinema.getBrandId());
        GeoPoint location = new GeoPoint(cinema.getLatitude().doubleValue(),cinema.getLongitude().doubleValue());
        this.setLocation(location);
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }
}
