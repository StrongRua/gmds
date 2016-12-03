package com.rua.pojo;

import java.io.Serializable;
/**
 * 文章
 * @author yui
 * @date 2016/12/4
 */
public class Article implements Serializable{
    private static final long serialVersionUID = 1L;
    
  	private Integer id;
  	private Integer article_id;
  	//文章名
  	private String name;
  	//文章路径
  	private String articleDir;
  	//权限
  	private String access;
  	//类型
  	private Integer type;
	//关注
  	private 	Integer favour;
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
	public Integer getArticle_id() {
		return article_id;
	}
	public void setArticle_id(Integer article_id) {
		this.article_id = article_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getArticleDir() {
		return articleDir;
	}
	public void setArticleDir(String articleDir) {
		this.articleDir = articleDir;
	}
	public String getAccess() {
		return access;
	}
	public void setAccess(String access) {
		this.access = access;
	}
	public Integer getType() {
		return type;
	}
	public void setType(Integer type) {
		this.type = type;
	}
	public Integer getFavour() {
		return favour;
	}
	public void setFavour(Integer favour) {
		this.favour = favour;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
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
        Article other = (Article) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
                && (this.getArticle_id() == null ? other.getArticle_id() == null : this.getArticle_id().equals(other.getArticle_id()))
                && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
                && (this.getArticleDir() == null ? other.getArticleDir() == null : this.getArticleDir().equals(other.getArticleDir()))
                && (this.getAccess() == null ? other.getAccess() == null : this.getAccess().equals(other.getAccess()))
                && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()))
                && (this.getFavour() == null ? other.getFavour() == null : this.getFavour().equals(other.getFavour()))
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
        result = prime * result + ((getArticle_id() == null) ? 0 : getArticle_id().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getArticleDir() == null) ? 0 : getArticleDir().hashCode());
        result = prime * result + ((getAccess() == null) ? 0 : getAccess().hashCode());
        result = prime * result + ((getFavour() == null) ? 0 : getFavour().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        result = prime * result + ((getCreateDate() == null) ? 0 : getCreateDate().hashCode());
        result = prime * result + ((getUpdateDate() == null) ? 0 : getUpdateDate().hashCode());
        result = prime * result + ((getDr() == null) ? 0 : getDr().hashCode());
        return result;
    }
}
