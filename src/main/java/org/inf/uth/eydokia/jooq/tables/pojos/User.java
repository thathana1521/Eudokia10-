/**
 * This class is generated by jOOQ
 */
package org.inf.uth.eydokia.jooq.tables.pojos;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.5.0"
	},
	comments = "This class is generated by jOOQ"
)
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class User implements java.io.Serializable {

	private static final long serialVersionUID = -2004741085;

	private java.lang.Integer  userId;
	private java.lang.Integer  roleId;
	private java.lang.String   email;
	private java.lang.String   fullName;
	private java.lang.String   phone;
	private java.lang.String   username;
	private java.lang.String   password;
	private java.lang.String   extraInfo;
	private java.sql.Timestamp createTime;

	public User() {}

	public User(
		java.lang.Integer  userId,
		java.lang.Integer  roleId,
		java.lang.String   email,
		java.lang.String   fullName,
		java.lang.String   phone,
		java.lang.String   username,
		java.lang.String   password,
		java.lang.String   extraInfo,
		java.sql.Timestamp createTime
	) {
		this.userId = userId;
		this.roleId = roleId;
		this.email = email;
		this.fullName = fullName;
		this.phone = phone;
		this.username = username;
		this.password = password;
		this.extraInfo = extraInfo;
		this.createTime = createTime;
	}

	public java.lang.Integer getUserId() {
		return this.userId;
	}

	public void setUserId(java.lang.Integer userId) {
		this.userId = userId;
	}

	public java.lang.Integer getRoleId() {
		return this.roleId;
	}

	public void setRoleId(java.lang.Integer roleId) {
		this.roleId = roleId;
	}

	public java.lang.String getEmail() {
		return this.email;
	}

	public void setEmail(java.lang.String email) {
		this.email = email;
	}

	public java.lang.String getFullName() {
		return this.fullName;
	}

	public void setFullName(java.lang.String fullName) {
		this.fullName = fullName;
	}

	public java.lang.String getPhone() {
		return this.phone;
	}

	public void setPhone(java.lang.String phone) {
		this.phone = phone;
	}

	public java.lang.String getUsername() {
		return this.username;
	}

	public void setUsername(java.lang.String username) {
		this.username = username;
	}

	public java.lang.String getPassword() {
		return this.password;
	}

	public void setPassword(java.lang.String password) {
		this.password = password;
	}

	public java.lang.String getExtraInfo() {
		return this.extraInfo;
	}

	public void setExtraInfo(java.lang.String extraInfo) {
		this.extraInfo = extraInfo;
	}

	public java.sql.Timestamp getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(java.sql.Timestamp createTime) {
		this.createTime = createTime;
	}
}
