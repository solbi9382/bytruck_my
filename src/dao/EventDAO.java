package dao;

import java.util.List;
import vo.Event;

public interface EventDAO {
	public List<Event>selectEvent(int no) throws Exception;
}