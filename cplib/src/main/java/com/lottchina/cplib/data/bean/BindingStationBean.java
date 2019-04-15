package com.lottchina.cplib.data.bean;

import java.io.Serializable;
import java.util.List;

/**
 * Author: Austin
 * Date: 19-4-15
 * Description: 绑定 Station
 */
public class BindingStationBean implements Serializable {

    /**
     * addr : 北京市丰台区南四环西路辅路
     * card_no : 41092219890307495X
     * descrip : 微彩内部测试
     * dist : 12233175
     * face_pic_id : 8
     * games : {"100":1,"101":1,"200":1,"201":1,"202":1,"203":1,"205":1,"207":1,"301":1,"401":1,"402":1,"601":1}
     * id : 4
     * is_info_open : 0
     * lantitude : 39.829559326171875
     * longitude : 116.29912567138672
     * name : 勇超
     * nickname : 国民彩票店
     * notice :
     * sale_id : 5107853
     * sale_pic_id : 7
     * self_c_id : 3
     * tel_phone : 18039364720
     * terminals : [{"code":"1111222222","games":"201,202,301,200,203,205,207,401,402,601","id":2},{"code":"1346497643215","games":"201,202,301,200,203,205,207,401,402,601,100,101","id":16}]
     * username : 18039364720
     * weixin_account_id :
     * weixin_account_pic_id : -1
     * weixin_account_url : https://u.wechat.com/EJhHk_pjfpkWqVwu_7uf4Pc
     * weixin_rec_url :
     * zfb_id :
     */

    private String addr;
    private String card_no;
    private String descrip;
    private int dist;
    private int face_pic_id;
    private GamesBean games;
    private int id;
    private int is_info_open;
    private double lantitude;
    private double longitude;
    private String name;
    private String nickname;
    private String notice;
    private String sale_id;
    private int sale_pic_id;
    private int self_c_id;
    private String tel_phone;
    private String username;
    private String weixin_account_id;
    private int weixin_account_pic_id;
    private String weixin_account_url;
    private String weixin_rec_url;
    private String zfb_id;
    private List<Terminal> terminals;

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public String getCard_no() {
        return card_no;
    }

    public void setCard_no(String card_no) {
        this.card_no = card_no;
    }

    public String getDescrip() {
        return descrip;
    }

    public void setDescrip(String descrip) {
        this.descrip = descrip;
    }

    public int getDist() {
        return dist;
    }

    public void setDist(int dist) {
        this.dist = dist;
    }

    public int getFace_pic_id() {
        return face_pic_id;
    }

    public void setFace_pic_id(int face_pic_id) {
        this.face_pic_id = face_pic_id;
    }

    public GamesBean getGames() {
        return games;
    }

    public void setGames(GamesBean games) {
        this.games = games;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIs_info_open() {
        return is_info_open;
    }

    public void setIs_info_open(int is_info_open) {
        this.is_info_open = is_info_open;
    }

    public double getLantitude() {
        return lantitude;
    }

    public void setLantitude(double lantitude) {
        this.lantitude = lantitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getNotice() {
        return notice;
    }

    public void setNotice(String notice) {
        this.notice = notice;
    }

    public String getSale_id() {
        return sale_id;
    }

    public void setSale_id(String sale_id) {
        this.sale_id = sale_id;
    }

    public int getSale_pic_id() {
        return sale_pic_id;
    }

    public void setSale_pic_id(int sale_pic_id) {
        this.sale_pic_id = sale_pic_id;
    }

    public int getSelf_c_id() {
        return self_c_id;
    }

    public void setSelf_c_id(int self_c_id) {
        this.self_c_id = self_c_id;
    }

    public String getTel_phone() {
        return tel_phone;
    }

    public void setTel_phone(String tel_phone) {
        this.tel_phone = tel_phone;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getWeixin_account_id() {
        return weixin_account_id;
    }

    public void setWeixin_account_id(String weixin_account_id) {
        this.weixin_account_id = weixin_account_id;
    }

    public int getWeixin_account_pic_id() {
        return weixin_account_pic_id;
    }

    public void setWeixin_account_pic_id(int weixin_account_pic_id) {
        this.weixin_account_pic_id = weixin_account_pic_id;
    }

    public String getWeixin_account_url() {
        return weixin_account_url;
    }

    public void setWeixin_account_url(String weixin_account_url) {
        this.weixin_account_url = weixin_account_url;
    }

    public String getWeixin_rec_url() {
        return weixin_rec_url;
    }

    public void setWeixin_rec_url(String weixin_rec_url) {
        this.weixin_rec_url = weixin_rec_url;
    }

    public String getZfb_id() {
        return zfb_id;
    }

    public void setZfb_id(String zfb_id) {
        this.zfb_id = zfb_id;
    }

    public List<Terminal> getTerminals() {
        return terminals;
    }

    public void setTerminals(List<Terminal> terminals) {
        this.terminals = terminals;
    }

    @Override
    public String toString() {
        return "BindingStationBean{" +
                "addr='" + addr + '\'' +
                ", card_no='" + card_no + '\'' +
                ", descrip='" + descrip + '\'' +
                ", dist=" + dist +
                ", face_pic_id=" + face_pic_id +
                ", games=" + games +
                ", id=" + id +
                ", is_info_open=" + is_info_open +
                ", lantitude=" + lantitude +
                ", longitude=" + longitude +
                ", name='" + name + '\'' +
                ", nickname='" + nickname + '\'' +
                ", notice='" + notice + '\'' +
                ", sale_id='" + sale_id + '\'' +
                ", sale_pic_id=" + sale_pic_id +
                ", self_c_id=" + self_c_id +
                ", tel_phone='" + tel_phone + '\'' +
                ", username='" + username + '\'' +
                ", weixin_account_id='" + weixin_account_id + '\'' +
                ", weixin_account_pic_id=" + weixin_account_pic_id +
                ", weixin_account_url='" + weixin_account_url + '\'' +
                ", weixin_rec_url='" + weixin_rec_url + '\'' +
                ", zfb_id='" + zfb_id + '\'' +
                ", terminals=" + terminals +
                '}';
    }
}
