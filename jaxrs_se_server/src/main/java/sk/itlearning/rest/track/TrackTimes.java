package sk.itlearning.rest.track;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TrackTimes {

	private List<TrackTimesUser> users = new ArrayList<>();

	class TrackTimesUser {
		private String name;
		private List<TrackTimesRecord> records = new ArrayList<>();

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public List<TrackTimesRecord> getRecords() {
			return records;
		}

		public void setRecords(List<TrackTimesRecord> records) {
			this.records = records;
		}
	}

	class TrackTimesRecord {
		private LocalDate date;
		private List<TrackTimesTask> tasks = new ArrayList<>();

		public List<TrackTimesTask> getTasks() {
			return tasks;
		}

		public void setTasks(List<TrackTimesTask> tasks) {
			this.tasks = tasks;
		}

		public LocalDate getDate() {
			return date;
		}

		public void setDate(LocalDate date) {
			this.date = date;
		}
	}

	class TrackTimesTask {
		private String name;
		private Date created;
		private int totalTime;
		private Boolean running = Boolean.FALSE;
		private List<TrackTimesInterval> intervals = new ArrayList<>();

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Date getCreated() {
			return created;
		}

		public void setCreated(Date created) {
			this.created = created;
		}

		public int getTotalTime() {
			return totalTime;
		}

		public void setTotalTime(int totalTime) {
			this.totalTime = totalTime;
		}

		public Boolean getRunning() {
			return running;
		}

		public void setRunning(Boolean running) {
			this.running = running;
		}

		public List<TrackTimesInterval> getIntervals() {
			return intervals;
		}

		public void setIntervals(List<TrackTimesInterval> intervals) {
			this.intervals = intervals;
		}
	}

	class TrackTimesInterval {
		private Date from;
		private Date to;

		public Date getFrom() {
			return from;
		}

		public void setFrom(Date from) {
			this.from = from;
		}

		public Date getTo() {
			return to;
		}

		public void setTo(Date to) {
			this.to = to;
		}
	}

	public List<TrackTimesUser> getUsers() {
		return users;
	}

	public void setUsers(List<TrackTimesUser> users) {
		this.users = users;
	}

}
