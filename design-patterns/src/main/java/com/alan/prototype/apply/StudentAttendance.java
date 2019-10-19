package com.alan.prototype.apply;

import lombok.Data;

import java.io.*;
import java.util.Date;
import java.util.UUID;

/**
 * Created by Alan.W on 2019/10/19.
 */
@Data
public class StudentAttendance implements Cloneable, Serializable {

	private static final long serialVersionUID = -6049014742611955895L;

	// 考勤ID
	private String attendanceId;

	// 学生ID
	private String studentId;

	// 考勤日期
	private Date attendanceDate;

	// AM或PM
	private String attendancePeriod;

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return this.deepClone();
	}

	private Object deepClone() {
		ByteArrayOutputStream bos = null;
		ObjectOutputStream oos = null;
		ByteArrayInputStream bis = null;
		ObjectInputStream ois = null;
		try {
			bos = new ByteArrayOutputStream();
			oos = new ObjectOutputStream(bos);
			oos.writeObject(this);

			bis = new ByteArrayInputStream(bos.toByteArray());
			ois = new ObjectInputStream(bis);
			StudentAttendance studentAttendance = (StudentAttendance) ois.readObject();
			studentAttendance.setAttendanceId(UUID.randomUUID().toString());
			studentAttendance.setAttendancePeriod("PM");
			return studentAttendance;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} finally {
			try {
				if (bos != null) {
					bos.close();
				}
				if (oos != null) {
					oos.close();
				}
				if (bis != null) {
					bis.close();
				}
				if (ois != null) {
					ois.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
