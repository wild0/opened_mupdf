package com.artifex.mupdfdemo.ext;

import android.graphics.PointF;

public class PointFExt extends PointF {
	int color = 0xFFFF0000;
	int page = -1;
	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public PointFExt(int page, float x, float y, int color, float thickness){
		super(x, y);
		this.page = page;
		this.color = color;
		this.thickness = thickness;
	}
	
	public int getColor() {
		return color;
	}
	public void setColor(int color) {
		this.color = color;
	}
	public float getThickness() {
		return thickness;
	}
	public void setThickness(float thickness) {
		this.thickness = thickness;
	}
	float thickness = 10.0f;
}
