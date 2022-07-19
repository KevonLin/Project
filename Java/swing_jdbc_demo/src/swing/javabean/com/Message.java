package swing.javabean.com;

import java.util.Date;

public class Message {
	private int id;
	private String name;
	private Date addtime;
	public Message(){
		
	}
	
	
	public Message(int id, Date addtime) {
		super();
		this.id = id;
		this.addtime = addtime;
	}

	

	public Message(int id, String name, Date addtime) {
		super();
		this.id = id;
		this.name = name;
		this.addtime = addtime;
	}


	public Message(String name, Date addtime) {
		super();
		this.name = name;
		this.addtime = addtime;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}
	
	

}
