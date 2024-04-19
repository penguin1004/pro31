package com.bookshop01.goods.vo;

import java.sql.Date;

public class ProductVO {
	private int goodsId; 
	private String goodsSort;
	private String goodsTitle; 
	private int    goodsPrice; 
	private String goodsStatus;
	private String goodsIntro;
	private Date goodsCredate;
	private Date createdAt;
	private String createdUser;
	private Date updatedAt;
	private String updatedUser;
	
	private String filename;
	

	
	// 	private int goods_delivery_price;
	// private Date goods_delivery_date;
	// private int    goods_point;
	// private Date   goods_credate;
	
	public String getFilename() {
		return filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}

	public Date getGoodsCredate() {
		return goodsCredate;
	}

	public void setGoodsCredate(Date goodsCredate) {
		this.goodsCredate = goodsCredate;
	}


	public ProductVO() {
	}

	public int getGoodsId() {
		return goodsId;
	}

	public void setGoodsId(int goodsId) {
		this.goodsId = goodsId;
	}

	public String getGoodsTitle() {
		return goodsTitle;
	}

	public void setGoodsTitle(String goodsTitle) {
		this.goodsTitle = goodsTitle;
	}

	public String getGoodsSort() {
		return goodsSort;
	}

	public void setGoodsSort(String goodsSort) {
		this.goodsSort = goodsSort;
	}

	public int getGoodsPrice() {
		return goodsPrice;
	}

	public void setGoodsPrice(int goodsPrice) {
		this.goodsPrice = goodsPrice;
	}

	public String getGoodsStatus() {
		return goodsStatus;
	}

	public void setGoodsStatus(String goodsStatus) {
		this.goodsStatus = goodsStatus;
	}

	public String getGoodsIntro() {
		return goodsIntro;
	}

	public void setGoodsIntro(String goodsIntro) {
		this.goodsIntro = goodsIntro;
	}

	/*
	 * public Date getGoods_credate() { return goods_credate; }
	 * 
	 * public void setGoods_credate(Date goods_credate) { this.goods_credate =
	 * goods_credate; }
	 */

	public Date getCreatedAt() {
		return createdAt;
	}



	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}



	public String getCreatedUser() {
		return createdUser;
	}



	public void setCreatedUser(String createdUser) {
		this.createdUser = createdUser;
	}



	public Date getUpdatedAt() {
		return updatedAt;
	}



	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}



	public String getUpdatedUser() {
		return updatedUser;
	}



	public void setUpdatedUser(String updatedUser) {
		this.updatedUser = updatedUser;
	}
}
