/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.com.boha.monitor.library.dto;

import java.io.Serializable;
import java.util.List;

/**
 *
 * @author aubreyM
 */
public class CityDTO implements Serializable {

    private Double latitude;
    private Double longitude;
    private static final long serialVersionUID = 1L;
    private Integer cityID;
    private String cityName;
    private List<TownshipDTO> townshipList;
    private ProvinceDTO provinceID;

    public CityDTO() {
    }

    public CityDTO(Integer cityID) {
        this.cityID = cityID;
    }

    public CityDTO(Integer cityID, String cityName, double latitude, double longitude) {
        this.cityID = cityID;
        this.cityName = cityName;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public Integer getCityID() {
        return cityID;
    }

    public void setCityID(Integer cityID) {
        this.cityID = cityID;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public List<TownshipDTO> getTownshipList() {
        return townshipList;
    }

    public void setTownshipList(List<TownshipDTO> townshipList) {
        this.townshipList = townshipList;
    }

  
    public ProvinceDTO getProvinceID() {
        return provinceID;
    }

    public void setProvinceID(ProvinceDTO provinceID) {
        this.provinceID = provinceID;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

}
