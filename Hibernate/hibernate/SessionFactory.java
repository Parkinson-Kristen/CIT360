package webbcalendar.java.hibernate;

public interface SessionFactory {

	void close();

	Session getCurrentSession();

}
