/**
 * This class is generated by jOOQ
 */
package org.inf.uth.eydokia.jooq.tables.records;

/**
 * VIEW
 */
@javax.annotation.Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.5.0"
	},
	comments = "This class is generated by jOOQ"
)
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class RoomEntryRecord extends org.jooq.impl.TableRecordImpl<org.inf.uth.eydokia.jooq.tables.records.RoomEntryRecord> implements org.jooq.Record15<java.lang.String, java.lang.String, java.sql.Time, java.sql.Time, java.lang.String, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Byte, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer> {

	private static final long serialVersionUID = -309369390;

	/**
	 * Setter for <code>eydokia.room_entry.room_name</code>.
	 */
	public void setRoomName(java.lang.String value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>eydokia.room_entry.room_name</code>.
	 */
	public java.lang.String getRoomName() {
		return (java.lang.String) getValue(0);
	}

	/**
	 * Setter for <code>eydokia.room_entry.full_name</code>.
	 */
	public void setFullName(java.lang.String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>eydokia.room_entry.full_name</code>.
	 */
	public java.lang.String getFullName() {
		return (java.lang.String) getValue(1);
	}

	/**
	 * Setter for <code>eydokia.room_entry.start_time</code>.
	 */
	public void setStartTime(java.sql.Time value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>eydokia.room_entry.start_time</code>.
	 */
	public java.sql.Time getStartTime() {
		return (java.sql.Time) getValue(2);
	}

	/**
	 * Setter for <code>eydokia.room_entry.end_time</code>.
	 */
	public void setEndTime(java.sql.Time value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>eydokia.room_entry.end_time</code>.
	 */
	public java.sql.Time getEndTime() {
		return (java.sql.Time) getValue(3);
	}

	/**
	 * Setter for <code>eydokia.room_entry.name</code>.
	 */
	public void setName(java.lang.String value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>eydokia.room_entry.name</code>.
	 */
	public java.lang.String getName() {
		return (java.lang.String) getValue(4);
	}

	/**
	 * Setter for <code>eydokia.room_entry.entry_id</code>.
	 */
	public void setEntryId(java.lang.Integer value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>eydokia.room_entry.entry_id</code>.
	 */
	public java.lang.Integer getEntryId() {
		return (java.lang.Integer) getValue(5);
	}

	/**
	 * Setter for <code>eydokia.room_entry.entry_room_id</code>.
	 */
	public void setEntryRoomId(java.lang.Integer value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>eydokia.room_entry.entry_room_id</code>.
	 */
	public java.lang.Integer getEntryRoomId() {
		return (java.lang.Integer) getValue(6);
	}

	/**
	 * Setter for <code>eydokia.room_entry.entry_user_id</code>.
	 */
	public void setEntryUserId(java.lang.Integer value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>eydokia.room_entry.entry_user_id</code>.
	 */
	public java.lang.Integer getEntryUserId() {
		return (java.lang.Integer) getValue(7);
	}

	/**
	 * Setter for <code>eydokia.room_entry.entry_schedule_id</code>.
	 */
	public void setEntryScheduleId(java.lang.Integer value) {
		setValue(8, value);
	}

	/**
	 * Getter for <code>eydokia.room_entry.entry_schedule_id</code>.
	 */
	public java.lang.Integer getEntryScheduleId() {
		return (java.lang.Integer) getValue(8);
	}

	/**
	 * Setter for <code>eydokia.room_entry.status</code>.
	 */
	public void setStatus(java.lang.Byte value) {
		setValue(9, value);
	}

	/**
	 * Getter for <code>eydokia.room_entry.status</code>.
	 */
	public java.lang.Byte getStatus() {
		return (java.lang.Byte) getValue(9);
	}

	/**
	 * Setter for <code>eydokia.room_entry.user_id</code>.
	 */
	public void setUserId(java.lang.Integer value) {
		setValue(10, value);
	}

	/**
	 * Getter for <code>eydokia.room_entry.user_id</code>.
	 */
	public java.lang.Integer getUserId() {
		return (java.lang.Integer) getValue(10);
	}

	/**
	 * Setter for <code>eydokia.room_entry.schedule_id</code>.
	 */
	public void setScheduleId(java.lang.Integer value) {
		setValue(11, value);
	}

	/**
	 * Getter for <code>eydokia.room_entry.schedule_id</code>.
	 */
	public java.lang.Integer getScheduleId() {
		return (java.lang.Integer) getValue(11);
	}

	/**
	 * Setter for <code>eydokia.room_entry.schedule_schedule_type_id</code>.
	 */
	public void setScheduleScheduleTypeId(java.lang.Integer value) {
		setValue(12, value);
	}

	/**
	 * Getter for <code>eydokia.room_entry.schedule_schedule_type_id</code>.
	 */
	public java.lang.Integer getScheduleScheduleTypeId() {
		return (java.lang.Integer) getValue(12);
	}

	/**
	 * Setter for <code>eydokia.room_entry.schedule_type_id</code>.
	 */
	public void setScheduleTypeId(java.lang.Integer value) {
		setValue(13, value);
	}

	/**
	 * Getter for <code>eydokia.room_entry.schedule_type_id</code>.
	 */
	public java.lang.Integer getScheduleTypeId() {
		return (java.lang.Integer) getValue(13);
	}

	/**
	 * Setter for <code>eydokia.room_entry.room_id</code>.
	 */
	public void setRoomId(java.lang.Integer value) {
		setValue(14, value);
	}

	/**
	 * Getter for <code>eydokia.room_entry.room_id</code>.
	 */
	public java.lang.Integer getRoomId() {
		return (java.lang.Integer) getValue(14);
	}

	// -------------------------------------------------------------------------
	// Record15 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row15<java.lang.String, java.lang.String, java.sql.Time, java.sql.Time, java.lang.String, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Byte, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer> fieldsRow() {
		return (org.jooq.Row15) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row15<java.lang.String, java.lang.String, java.sql.Time, java.sql.Time, java.lang.String, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Byte, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer> valuesRow() {
		return (org.jooq.Row15) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field1() {
		return org.inf.uth.eydokia.jooq.tables.RoomEntry.ROOM_ENTRY.ROOM_NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field2() {
		return org.inf.uth.eydokia.jooq.tables.RoomEntry.ROOM_ENTRY.FULL_NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.sql.Time> field3() {
		return org.inf.uth.eydokia.jooq.tables.RoomEntry.ROOM_ENTRY.START_TIME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.sql.Time> field4() {
		return org.inf.uth.eydokia.jooq.tables.RoomEntry.ROOM_ENTRY.END_TIME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field5() {
		return org.inf.uth.eydokia.jooq.tables.RoomEntry.ROOM_ENTRY.NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field6() {
		return org.inf.uth.eydokia.jooq.tables.RoomEntry.ROOM_ENTRY.ENTRY_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field7() {
		return org.inf.uth.eydokia.jooq.tables.RoomEntry.ROOM_ENTRY.ENTRY_ROOM_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field8() {
		return org.inf.uth.eydokia.jooq.tables.RoomEntry.ROOM_ENTRY.ENTRY_USER_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field9() {
		return org.inf.uth.eydokia.jooq.tables.RoomEntry.ROOM_ENTRY.ENTRY_SCHEDULE_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Byte> field10() {
		return org.inf.uth.eydokia.jooq.tables.RoomEntry.ROOM_ENTRY.STATUS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field11() {
		return org.inf.uth.eydokia.jooq.tables.RoomEntry.ROOM_ENTRY.USER_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field12() {
		return org.inf.uth.eydokia.jooq.tables.RoomEntry.ROOM_ENTRY.SCHEDULE_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field13() {
		return org.inf.uth.eydokia.jooq.tables.RoomEntry.ROOM_ENTRY.SCHEDULE_SCHEDULE_TYPE_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field14() {
		return org.inf.uth.eydokia.jooq.tables.RoomEntry.ROOM_ENTRY.SCHEDULE_TYPE_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field15() {
		return org.inf.uth.eydokia.jooq.tables.RoomEntry.ROOM_ENTRY.ROOM_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value1() {
		return getRoomName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value2() {
		return getFullName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.sql.Time value3() {
		return getStartTime();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.sql.Time value4() {
		return getEndTime();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value5() {
		return getName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value6() {
		return getEntryId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value7() {
		return getEntryRoomId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value8() {
		return getEntryUserId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value9() {
		return getEntryScheduleId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Byte value10() {
		return getStatus();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value11() {
		return getUserId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value12() {
		return getScheduleId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value13() {
		return getScheduleScheduleTypeId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value14() {
		return getScheduleTypeId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value15() {
		return getRoomId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public RoomEntryRecord value1(java.lang.String value) {
		setRoomName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public RoomEntryRecord value2(java.lang.String value) {
		setFullName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public RoomEntryRecord value3(java.sql.Time value) {
		setStartTime(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public RoomEntryRecord value4(java.sql.Time value) {
		setEndTime(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public RoomEntryRecord value5(java.lang.String value) {
		setName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public RoomEntryRecord value6(java.lang.Integer value) {
		setEntryId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public RoomEntryRecord value7(java.lang.Integer value) {
		setEntryRoomId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public RoomEntryRecord value8(java.lang.Integer value) {
		setEntryUserId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public RoomEntryRecord value9(java.lang.Integer value) {
		setEntryScheduleId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public RoomEntryRecord value10(java.lang.Byte value) {
		setStatus(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public RoomEntryRecord value11(java.lang.Integer value) {
		setUserId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public RoomEntryRecord value12(java.lang.Integer value) {
		setScheduleId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public RoomEntryRecord value13(java.lang.Integer value) {
		setScheduleScheduleTypeId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public RoomEntryRecord value14(java.lang.Integer value) {
		setScheduleTypeId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public RoomEntryRecord value15(java.lang.Integer value) {
		setRoomId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public RoomEntryRecord values(java.lang.String value1, java.lang.String value2, java.sql.Time value3, java.sql.Time value4, java.lang.String value5, java.lang.Integer value6, java.lang.Integer value7, java.lang.Integer value8, java.lang.Integer value9, java.lang.Byte value10, java.lang.Integer value11, java.lang.Integer value12, java.lang.Integer value13, java.lang.Integer value14, java.lang.Integer value15) {
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached RoomEntryRecord
	 */
	public RoomEntryRecord() {
		super(org.inf.uth.eydokia.jooq.tables.RoomEntry.ROOM_ENTRY);
	}

	/**
	 * Create a detached, initialised RoomEntryRecord
	 */
	public RoomEntryRecord(java.lang.String roomName, java.lang.String fullName, java.sql.Time startTime, java.sql.Time endTime, java.lang.String name, java.lang.Integer entryId, java.lang.Integer entryRoomId, java.lang.Integer entryUserId, java.lang.Integer entryScheduleId, java.lang.Byte status, java.lang.Integer userId, java.lang.Integer scheduleId, java.lang.Integer scheduleScheduleTypeId, java.lang.Integer scheduleTypeId, java.lang.Integer roomId) {
		super(org.inf.uth.eydokia.jooq.tables.RoomEntry.ROOM_ENTRY);

		setValue(0, roomName);
		setValue(1, fullName);
		setValue(2, startTime);
		setValue(3, endTime);
		setValue(4, name);
		setValue(5, entryId);
		setValue(6, entryRoomId);
		setValue(7, entryUserId);
		setValue(8, entryScheduleId);
		setValue(9, status);
		setValue(10, userId);
		setValue(11, scheduleId);
		setValue(12, scheduleScheduleTypeId);
		setValue(13, scheduleTypeId);
		setValue(14, roomId);
	}
}
