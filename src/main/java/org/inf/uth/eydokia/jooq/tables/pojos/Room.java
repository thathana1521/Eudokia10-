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
public class Room implements java.io.Serializable {

	private static final long serialVersionUID = -81957645;

	private java.lang.Integer  roomId;
	private java.lang.Boolean  disabled;
	private java.lang.String   name;
	private java.lang.String   description;
	private java.sql.Timestamp createTime;

	public Room() {}

	public Room(
		java.lang.Integer  roomId,
		java.lang.Boolean  disabled,
		java.lang.String   name,
		java.lang.String   description,
		java.sql.Timestamp createTime
	) {
		this.roomId = roomId;
		this.disabled = disabled;
		this.name = name;
		this.description = description;
		this.createTime = createTime;
	}

	public java.lang.Integer getRoomId() {
		return this.roomId;
	}

	public void setRoomId(java.lang.Integer roomId) {
		this.roomId = roomId;
	}

	public java.lang.Boolean getDisabled() {
		return this.disabled;
	}

	public void setDisabled(java.lang.Boolean disabled) {
		this.disabled = disabled;
	}

	public java.lang.String getName() {
		return this.name;
	}

	public void setName(java.lang.String name) {
		this.name = name;
	}

	public java.lang.String getDescription() {
		return this.description;
	}

	public void setDescription(java.lang.String description) {
		this.description = description;
	}

	public java.sql.Timestamp getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(java.sql.Timestamp createTime) {
		this.createTime = createTime;
	}
}
