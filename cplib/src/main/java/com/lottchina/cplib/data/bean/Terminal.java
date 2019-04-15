package com.lottchina.cplib.data.bean;

import java.io.Serializable;

/**
 * @Author: Austin
 * @Date: 19-4-15
 * @Description: 终端
 */
public class Terminal implements Serializable {

    private Integer id;
    private String block_num;
    private String code;
    private String games;
    private Integer hard_type_id;
    private String hard_type;
    private String sale_num;
    private String sale_pass;
    private String ukey;
    private Integer enter_sep;
    private String game_config;
    private Integer user_status;
    private String robotInitPrefix;
    private Integer is_sale_online;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBlock_num() {
        return block_num;
    }

    public void setBlock_num(String block_num) {
        this.block_num = block_num;
    }

    public Integer getHard_type_id() {
        return hard_type_id;
    }

    public void setHard_type_id(Integer hard_type_id) {
        this.hard_type_id = hard_type_id;
    }

    public String getGames() {
        return games;
    }

    public void setGames(String games) {
        this.games = games;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getHard_type() {
        return hard_type;
    }

    public void setHard_type(String hard_type) {
        this.hard_type = hard_type;
    }

    public String getUkey() {
        return ukey;
    }

    public void setUkey(String ukey) {
        this.ukey = ukey;
    }

    public String getSale_num() {
        return sale_num;
    }

    public void setSale_num(String sale_num) {
        this.sale_num = sale_num;
    }

    public String getSale_pass() {
        return sale_pass;
    }

    public void setSale_pass(String sale_pass) {
        this.sale_pass = sale_pass;
    }

    public Integer getEnter_sep() {
        return enter_sep;
    }

    public void setEnter_sep(Integer enter_sep) {
        this.enter_sep = enter_sep;
    }

    public String getGame_config() {
        return game_config;
    }

    public void setGame_config(String game_config) {
        this.game_config = game_config;
    }


    public Integer getUser_status() {
        return user_status;
    }

    public void setUser_status(Integer user_status) {
        this.user_status = user_status;
    }

    public String getRobotInitPrefix() {
        return robotInitPrefix;
    }

    public void setRobotInitPrefix(String robotInitPrefix) {
        this.robotInitPrefix = robotInitPrefix;
    }

    public Integer getIs_sale_online() {
        return is_sale_online;
    }

    public void setIs_sale_online(Integer is_sale_online) {
        this.is_sale_online = is_sale_online;
    }


}