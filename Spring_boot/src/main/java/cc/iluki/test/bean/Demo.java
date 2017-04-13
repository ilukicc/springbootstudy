package cc.iluki.test.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * 测试实体类
 * @author lk
 *
 */
@Entity
@Table(name="demo")
public class Demo {

	@Id@GeneratedValue
	private long id;//主键
	@Column(name="name",length=30)
	private String name;//测试名称
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}