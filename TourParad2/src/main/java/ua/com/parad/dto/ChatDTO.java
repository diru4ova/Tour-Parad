package ua.com.parad.dto;

public class ChatDTO {
	
	private int id;
	private String theme;
	private String shortText;
	
	public ChatDTO() {
		// TODO Auto-generated constructor stub
	}

	public ChatDTO(int id, String theme, String shortText) {
		super();
		this.id = id;
		this.theme = theme;
		this.shortText = shortText;
	}

	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTheme() {
		return theme;
	}

	public void setTheme(String theme) {
		this.theme = theme;
	}
	
	public String getShortText() {
		return shortText;
	}

	public void setShortText(String shortText) {
		this.shortText = shortText;
	}

	@Override
	public String toString() {
		return "ChatDTO [id=" + id + ", theme=" + theme + "]";
	}
	
	

}
