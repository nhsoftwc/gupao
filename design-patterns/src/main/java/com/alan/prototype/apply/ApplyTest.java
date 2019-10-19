package com.alan.prototype.apply;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

/**
 * Created by Alan.W on 2019/10/19.
 */
public class ApplyTest {

	public static void main(String[] args) throws CloneNotSupportedException {
		List<StudentAttendance> attendanceList = new ArrayList<>();
		StudentAttendance attendance = new StudentAttendance();
		attendance.setAttendanceId(UUID.randomUUID().toString());
		attendance.setStudentId("111");
		attendance.setAttendanceDate(new Date());
		attendance.setAttendancePeriod("AM");
		attendanceList.add(attendance);

		// 方式一：属于浅克隆，无法达到克隆出新对象的效果
//		List<StudentAttendance> attendancePMList = (List<StudentAttendance>) ((ArrayList<StudentAttendance>) attendanceAMList).clone();
//		for (StudentAttendance studentAttendance : attendancePMList) {
//			studentAttendance.setAttendanceId(UUID.randomUUID().toString());
//			studentAttendance.setAttendancePeriod("PM");
//		}
//		attendanceAMList.addAll(attendancePMList);
//		System.out.println(attendanceAMList);

		// 方式二：可以达到效果，但是太low
//		List<StudentAttendance> attendancePMList = new ArrayList<>();
//		for (StudentAttendance attendanceAM : attendanceList) {
//			StudentAttendance attendancePM = new StudentAttendance();
//			attendancePM.setAttendanceId(UUID.randomUUID().toString());
//			attendancePM.setStudentId(attendanceAM.getStudentId());
//			attendancePM.setAttendanceDate(attendanceAM.getAttendanceDate());
//			attendancePM.setAttendancePeriod("PM");
//			attendancePMList.add(attendancePM);
//		}
//		attendanceList.addAll(attendancePMList);
//		System.out.println(attendanceList);

		// 方式三：在方式二的基础上进行改进，使用原型模式的深克隆
		List<StudentAttendance> attendancePMList = new ArrayList<>();
		for (StudentAttendance attendanceAM : attendanceList) {
			StudentAttendance attendancePM = (StudentAttendance) attendanceAM.clone();
			attendancePMList.add(attendancePM);
		}
		attendanceList.addAll(attendancePMList);
		System.out.println(attendanceList);
	}

}
