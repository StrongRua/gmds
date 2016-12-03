package com.rua.pojo;

import java.util.Date;
import java.io.Serializable;

/**
 * 用户
 * @author yui
 *
 */
public class User implements Serializable{
    private static final long serialVersionUID = 1L;
	//用户id
	private Integer id;
	//登陆名
	private String login_id;
	//用户昵称
	private String name;
    //密码
    private String password;
    //盐
    private String salt;
    //邮件
    private String email;    
    //电话
    private String phone;
    //性别（0未知，1男，2女）
    private Integer gender;
    //头像地址
    private String headLogo;
    //权限等级
    private Integer level;
    //关注
    private Integer attention;
    //经验
    private Integer  exp;
    //QQ号
    private String qq;
    //年龄
    private Integer age;
	//生日
    private Date birthDate;
	//创建时间
    private String remark;

	private Integer createDate;
    //更新时间
    private Integer updateDate;   
    //删除标志
    private Boolean dr;
    
    public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getLogin_id() {
		return login_id;
	}
	public void setLogin_id(String login_id) {
		this.login_id = login_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getSalt() {
		return salt;
	}
	public void setSalt(String salt) {
		this.salt = salt;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public Integer getGender() {
		return gender;
	}
	public void setGender(Integer gender) {
		this.gender = gender;
	}
	public String getHeadLogo() {
		return headLogo;
	}
	public void setHeadLogo(String headLogo) {
		this.headLogo = headLogo;
	}
	public Integer getLevel() {
		return level;
	}
	public void setLevel(Integer level) {
		this.level = level;
	}
	public Integer getAttention() {
		return attention;
	}
	public void setAttention(Integer attention) {
		this.attention = attention;
	}
	public Integer getExp() {
		return exp;
	}
	public void setExp(Integer exp) {
		this.exp = exp;
	}
	public String getQq() {
		return qq;
	}
	public void setQq(String qq) {
		this.qq = qq;
	}
	public Date getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
    public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}

	public Integer getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Integer createDate) {
		this.createDate = createDate;
	}
	public Integer getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(Integer updateDate) {
		this.updateDate = updateDate;
	}
	public Boolean getDr() {
		return dr;
	}
	public void setDr(Boolean dr) {
		this.dr = dr;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
    public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	
	@Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        User other = (User) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
                && (this.getLogin_id() == null ? other.getLogin_id() == null : this.getLogin_id().equals(other.getLogin_id()))
                && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
                && (this.getPhone() == null ? other.getPhone() == null : this.getPhone().equals(other.getPhone()))
                && (this.getSalt() == null ? other.getSalt() == null : this.getSalt().equals(other.getSalt()))
                && (this.getPassword() == null ? other.getPassword() == null : this.getPassword().equals(other.getPassword()))
                && (this.getHeadLogo() == null ? other.getHeadLogo() == null : this.getHeadLogo().equals(other.getHeadLogo()))
                && (this.getEmail() == null ? other.getEmail() == null : this.getEmail().equals(other.getEmail()))
                && (this.getQq()== null ? other.getQq() == null : this.getQq().equals(other.getQq()))
                && (this.getExp()== null ? other.getExp() == null : this.getExp().equals(other.getExp()))
                && (this.getAge()== null ? other.getAge() == null : this.getAge().equals(other.getAge()))
                && (this.getAttention()== null ? other.getAttention() == null : this.getAttention().equals(other.getAttention()))
                && (this.getLevel()== null ? other.getLevel() == null : this.getLevel().equals(other.getLevel()))
                && (this.getBirthDate() == null ? other.getBirthDate() == null : this.getBirthDate().equals(other.getBirthDate()))
                && (this.getGender() == null ? other.getGender() == null : this.getGender().equals(other.getGender()))
                && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()))
                && (this.getCreateDate() == null ? other.getCreateDate() == null : this.getCreateDate().equals(other.getCreateDate()))
                && (this.getUpdateDate() == null ? other.getUpdateDate() == null : this.getUpdateDate().equals(other.getUpdateDate()))
                && (this.getDr() == null ? other.getDr() == null : this.getDr().equals(other.getDr()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getLogin_id() == null) ? 0 : getLogin_id().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getPhone() == null) ? 0 : getPhone().hashCode());
        result = prime * result + ((getSalt() == null) ? 0 : getSalt().hashCode());
        result = prime * result + ((getPassword() == null) ? 0 : getPassword().hashCode());
        result = prime * result + ((getAttention() == null) ? 0 : getAttention().hashCode());
        result = prime * result + ((getHeadLogo() == null) ? 0 : getHeadLogo().hashCode());
        result = prime * result + ((getEmail() == null) ? 0 : getEmail().hashCode());
        result = prime * result + ((getLevel() == null) ? 0 : getLevel().hashCode());
        result = prime * result + ((getAge() == null) ? 0 : getAge().hashCode());
        result = prime * result + ((getBirthDate() == null) ? 0 : getBirthDate().hashCode());
        result = prime * result + ((getExp() == null) ? 0 : getExp().hashCode());
        result = prime * result + ((getQq() == null) ? 0 : getQq().hashCode());
        result = prime * result + ((getGender() == null) ? 0 : getGender().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        result = prime * result + ((getCreateDate() == null) ? 0 : getCreateDate().hashCode());
        result = prime * result + ((getUpdateDate() == null) ? 0 : getUpdateDate().hashCode());
        result = prime * result + ((getDr() == null) ? 0 : getDr().hashCode());
        return result;
    }
}
