package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity //データの入れ物である「エンティティ（クラス）」であることを指定する
public class Book {
	@Id // 主キーであることを指定する
	@GeneratedValue // 主キーの値を自動採番する、基本@Idとセット
	private long id;
	private String title;
	private String detail;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	
	
}
