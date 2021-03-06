package com.heybro.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

public class Room implements Serializable {
    /**
     * 房间id
     */
    @Id
    @Column(name = "room_Id")
    private Integer roomId;

    /**
     * 房间名称
     */
    @Column(name = "room_name")
    private String roomName;

    /**
     * 房间人数 
     */
    @Column(name = "room_num")
    private Integer roomNum;

    /**
     * 打球模式
     */
    @Column(name = "room_mode")
    private String roomMode;

    /**
     * 最低等级（不限制为0）
     */
    @Column(name = "room_rate_low")
    private Integer roomRateLow;

    /**
     * 最高等级（不限制为0）
     */
    @Column(name = "room_rate_high")
    private Integer roomRateHigh;

    /**
     * 房间类型(打球0，比赛1)
     */
    @Column(name = "room_type")
    private Integer roomType;

    /**
     * 房间日期
     */
    @Column(name = "room_date")
    private Date roomDate;

    /**
     * 房间详情id
     */
    @Column(name = "room_info_id")
    private Integer roomInfoId;

    /**
     * 胜负队伍情况
     */
    @Column(name = "win_lose")
    private String winLose;

    /**
     * 房间密码设置(有1，无0)
     */
    @Column(name = "room_pass_set")
    private Integer roomPassSet;

    /**
     * 房间密码
     */
    @Column(name = "room_pass")
    private String roomPass;

    /**
     * 房间实际人数
     */
    @Column(name = "room_peo")
    private Integer roomPeo;

    /**
     * 经度
     */
    @Column(name = "room_lng")
    private String roomLng;

    /**
     * 纬度
     */
    @Column(name = "room_lat")
    private String roomLat;

    /**
     * 房主编码
     */
    @Column(name = "master_code")
    private String masterCode;

    /**
     * 房间所在城市
     */
    @Column(name = "room_city")
    private String roomCity;

    /**
     * 房间所在省
     */
    @Column(name = "room_province")
    private String roomProvince;

    /**
     * 房间所在区
     */
    @Column(name = "room_area")
    private String roomArea;

    private static final long serialVersionUID = 1L;

    /**
     * 获取房间id
     *
     * @return room_Id - 房间id
     */
    public Integer getRoomId() {
        return roomId;
    }

    /**
     * 设置房间id
     *
     * @param roomId 房间id
     */
    public void setRoomId(Integer roomId) {
        this.roomId = roomId;
    }

    /**
     * 获取房间名称
     *
     * @return room_name - 房间名称
     */
    public String getRoomName() {
        return roomName;
    }

    /**
     * 设置房间名称
     *
     * @param roomName 房间名称
     */
    public void setRoomName(String roomName) {
        this.roomName = roomName == null ? null : roomName.trim();
    }

    /**
     * 获取房间人数 
     *
     * @return room_num - 房间人数 
     */
    public Integer getRoomNum() {
        return roomNum;
    }

    /**
     * 设置房间人数 
     *
     * @param roomNum 房间人数 
     */
    public void setRoomNum(Integer roomNum) {
        this.roomNum = roomNum;
    }

    /**
     * 获取打球模式
     *
     * @return room_mode - 打球模式
     */
    public String getRoomMode() {
        return roomMode;
    }

    /**
     * 设置打球模式
     *
     * @param roomMode 打球模式
     */
    public void setRoomMode(String roomMode) {
        this.roomMode = roomMode == null ? null : roomMode.trim();
    }

    /**
     * 获取最低等级（不限制为0）
     *
     * @return room_rate_low - 最低等级（不限制为0）
     */
    public Integer getRoomRateLow() {
        return roomRateLow;
    }

    /**
     * 设置最低等级（不限制为0）
     *
     * @param roomRateLow 最低等级（不限制为0）
     */
    public void setRoomRateLow(Integer roomRateLow) {
        this.roomRateLow = roomRateLow;
    }

    /**
     * 获取最高等级（不限制为0）
     *
     * @return room_rate_high - 最高等级（不限制为0）
     */
    public Integer getRoomRateHigh() {
        return roomRateHigh;
    }

    /**
     * 设置最高等级（不限制为0）
     *
     * @param roomRateHigh 最高等级（不限制为0）
     */
    public void setRoomRateHigh(Integer roomRateHigh) {
        this.roomRateHigh = roomRateHigh;
    }

    /**
     * 获取房间类型(打球0，比赛1)
     *
     * @return room_type - 房间类型(打球0，比赛1)
     */
    public Integer getRoomType() {
        return roomType;
    }

    /**
     * 设置房间类型(打球0，比赛1)
     *
     * @param roomType 房间类型(打球0，比赛1)
     */
    public void setRoomType(Integer roomType) {
        this.roomType = roomType;
    }

    /**
     * 获取房间日期
     *
     * @return room_date - 房间日期
     */
    public Date getRoomDate() {
        return roomDate;
    }

    /**
     * 设置房间日期
     *
     * @param roomDate 房间日期
     */
    public void setRoomDate(Date roomDate) {
        this.roomDate = roomDate;
    }

    /**
     * 获取房间详情id
     *
     * @return room_info_id - 房间详情id
     */
    public Integer getRoomInfoId() {
        return roomInfoId;
    }

    /**
     * 设置房间详情id
     *
     * @param roomInfoId 房间详情id
     */
    public void setRoomInfoId(Integer roomInfoId) {
        this.roomInfoId = roomInfoId;
    }

    /**
     * 获取胜负队伍情况
     *
     * @return win_lose - 胜负队伍情况
     */
    public String getWinLose() {
        return winLose;
    }

    /**
     * 设置胜负队伍情况
     *
     * @param winLose 胜负队伍情况
     */
    public void setWinLose(String winLose) {
        this.winLose = winLose == null ? null : winLose.trim();
    }

    /**
     * 获取房间密码设置(有1，无0)
     *
     * @return room_pass_set - 房间密码设置(有1，无0)
     */
    public Integer getRoomPassSet() {
        return roomPassSet;
    }

    /**
     * 设置房间密码设置(有1，无0)
     *
     * @param roomPassSet 房间密码设置(有1，无0)
     */
    public void setRoomPassSet(Integer roomPassSet) {
        this.roomPassSet = roomPassSet;
    }

    /**
     * 获取房间密码
     *
     * @return room_pass - 房间密码
     */
    public String getRoomPass() {
        return roomPass;
    }

    /**
     * 设置房间密码
     *
     * @param roomPass 房间密码
     */
    public void setRoomPass(String roomPass) {
        this.roomPass = roomPass == null ? null : roomPass.trim();
    }

    /**
     * 获取房间实际人数
     *
     * @return room_peo - 房间实际人数
     */
    public Integer getRoomPeo() {
        return roomPeo;
    }

    /**
     * 设置房间实际人数
     *
     * @param roomPeo 房间实际人数
     */
    public void setRoomPeo(Integer roomPeo) {
        this.roomPeo = roomPeo;
    }

    /**
     * 获取经度
     *
     * @return room_lng - 经度
     */
    public String getRoomLng() {
        return roomLng;
    }

    /**
     * 设置经度
     *
     * @param roomLng 经度
     */
    public void setRoomLng(String roomLng) {
        this.roomLng = roomLng == null ? null : roomLng.trim();
    }

    /**
     * 获取纬度
     *
     * @return room_lat - 纬度
     */
    public String getRoomLat() {
        return roomLat;
    }

    /**
     * 设置纬度
     *
     * @param roomLat 纬度
     */
    public void setRoomLat(String roomLat) {
        this.roomLat = roomLat == null ? null : roomLat.trim();
    }

    /**
     * 获取房主编码
     *
     * @return master_code - 房主编码
     */
    public String getMasterCode() {
        return masterCode;
    }

    /**
     * 设置房主编码
     *
     * @param masterCode 房主编码
     */
    public void setMasterCode(String masterCode) {
        this.masterCode = masterCode == null ? null : masterCode.trim();
    }

    /**
     * 获取房间所在城市
     *
     * @return room_city - 房间所在城市
     */
    public String getRoomCity() {
        return roomCity;
    }

    /**
     * 设置房间所在城市
     *
     * @param roomCity 房间所在城市
     */
    public void setRoomCity(String roomCity) {
        this.roomCity = roomCity == null ? null : roomCity.trim();
    }

    /**
     * 获取房间所在省
     *
     * @return room_province - 房间所在省
     */
    public String getRoomProvince() {
        return roomProvince;
    }

    /**
     * 设置房间所在省
     *
     * @param roomProvince 房间所在省
     */
    public void setRoomProvince(String roomProvince) {
        this.roomProvince = roomProvince == null ? null : roomProvince.trim();
    }

    /**
     * 获取房间所在区
     *
     * @return room_area - 房间所在区
     */
    public String getRoomArea() {
        return roomArea;
    }

    /**
     * 设置房间所在区
     *
     * @param roomArea 房间所在区
     */
    public void setRoomArea(String roomArea) {
        this.roomArea = roomArea == null ? null : roomArea.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", roomId=").append(roomId);
        sb.append(", roomName=").append(roomName);
        sb.append(", roomNum=").append(roomNum);
        sb.append(", roomMode=").append(roomMode);
        sb.append(", roomRateLow=").append(roomRateLow);
        sb.append(", roomRateHigh=").append(roomRateHigh);
        sb.append(", roomType=").append(roomType);
        sb.append(", roomDate=").append(roomDate);
        sb.append(", roomInfoId=").append(roomInfoId);
        sb.append(", winLose=").append(winLose);
        sb.append(", roomPassSet=").append(roomPassSet);
        sb.append(", roomPass=").append(roomPass);
        sb.append(", roomPeo=").append(roomPeo);
        sb.append(", roomLng=").append(roomLng);
        sb.append(", roomLat=").append(roomLat);
        sb.append(", masterCode=").append(masterCode);
        sb.append(", roomCity=").append(roomCity);
        sb.append(", roomProvince=").append(roomProvince);
        sb.append(", roomArea=").append(roomArea);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}