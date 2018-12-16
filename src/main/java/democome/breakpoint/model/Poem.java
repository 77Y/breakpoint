package democome.breakpoint.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "t_poem")
public class Poem {

	@Id
	private Long id;

	@Column(length = 64)
	private String title;

	@Column(length = 255)
	private String content;

	@ManyToOne
	private PoemAuthor author;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public PoemAuthor getAuthor() {
		return author;
	}

	public void setAuthor(PoemAuthor author) {
		this.author = author;
	}

}
