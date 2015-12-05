package com.windrises.app.tracetravel.dto;

/**
 * 
 * @author master
 *
 */
public class Category {
	/**
	 * category name
	 */
	private String title;
	/**
	 * category order number
	 */
	private int seq;
	/**
	 * view mode
	 * 1:list mode
	 * 2:calendar mode
	 */
	private int viewMode;
	
	/**
	 * 
	 * @param title
	 * @param seq
	 * @param viewMode
	 */
	public Category(String title,int seq,int viewMode){
		this.title = title;
		this.seq = seq;
		this.viewMode = viewMode;
	}

	/**
	 * 
	 * @return
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * 
	 * @return
	 */
	public int getSeq() {
		return seq;
	}

	/**
	 * 
	 * @return
	 */
	public int getViewMode() {
		return viewMode;
	}
}
