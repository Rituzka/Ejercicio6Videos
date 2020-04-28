import java.util.ArrayList;
import java.util.List;

public class Video {
	
	String url;
	String title;
	List<String>tags = new ArrayList<String>();
	
	
	public Video(String title, String url, List<String>tags) {
		this.title = title;
		this.url = url;
		this.tags = tags;
	}

	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}
	

	public String getUrl() {
		return url;
	}


	public void setUrl(String url) {
		this.url = url;
	}


	public List<String> getTags() {
		return tags;
	}


	public void setTags(List<String> tags) {
		this.tags = tags;
	}
	
	
}
