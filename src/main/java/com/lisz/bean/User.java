package com.lisz.bean;

/**
 * 乱码问题解决：
 * 需要设置request和response的编码方式，可以自己动手写过滤器，也可以有现成的框架来实现
 * post：分别设置request和response的编码格式。
 *       在app中可能会有多个过滤器，一般没有顺序，如果设置了编码过滤器，必须将它放在最上面，保证编码过滤器优先执行
 * get：在tomcat的server.xml文件中，添加URIEncoding=utf-8。
 */
public class User {
	// Integer好，数据库写数据的时候int可能报NPE
	private Integer id;
	private String name;
	private Integer age;
	private String gender;
	private Address address;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "User{" +
				"id=" + id +
				", name='" + name + '\'' +
				", age=" + age +
				", gender='" + gender + '\'' +
				", address=" + address +
				'}';
	}
}
