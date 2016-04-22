package test;

import org.hibernate.Session;

import orm.Course;
import orm.Student;
import orm.StudentDAO;

public class DataInsert {
	public void dataInsert(){
		Student stu1 = new Student("liuchuang", "Male");
		Student stu2 = new Student("hongyan", "Female");
		Course c1 = new Course(stu1,"C++","C++ Primer");
		Course c2 = new Course(stu1,"Java SE","Java SE Core");
		Course c3 = new Course(stu1,"MongoDB","DataBase");
		Course c4 = new Course(stu2,"Java EE","Java Web");
		StudentDAO dao = new StudentDAO();
		Session stuSession = dao.getSession();
		stuSession.beginTransaction();
		dao.attachDirty(stu1);
		dao.attachDirty(stu2);
		stuSession.getTransaction().commit();
		stuSession.close();
		
	}
	
	public static void main(String[] args) {
		new DataInsert().dataInsert();
	}
}
