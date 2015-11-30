package com.zhc.myt.MytCommon;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class ReturnPage<T> implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -5011282729698657196L;
	// totalElements: 0,//所有数据的条目
	// totalPages: 0,//设置分页的总页数,
	// size: 0,//每一页的条目数,
	// number: 0,//当前页号,
	// content: [],//分页数据内容,
	// sort: {},//排序,
	// last: true,//末页,
	// numberOfElements: 0,//当前页的数据条目数
	// first: false//首页
	private Integer totalElements;
	private Integer totalPages;
	private Integer size;
	private Integer number;
	private List<T> content;
	private Map<String, String> sort;
	private Boolean last;
	private Boolean first;
	private Integer numberOfElements;

	public Integer getTotalElements() {
		return totalElements;
	}

	public void setTotalElements(Integer totalElements) {
		this.totalElements = totalElements;
	}

	public Integer getTotalPages() {
		return totalPages;
	}

	public void setTotalPages(Integer totalPages) {
		this.totalPages = totalPages;
	}

	public Integer getSize() {
		return size;
	}

	public void setSize(Integer size) {
		this.size = size;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public List<T> getContent() {
		return content;
	}

	public void setContent(List<T> content) {
		this.content = content;
	}

	public Map<String, String> getSort() {
		return sort;
	}

	public void setSort(Map<String, String> sort) {
		this.sort = sort;
	}

	public Boolean getLast() {
		return last;
	}

	public void setLast(Boolean last) {
		this.last = last;
	}

	public Boolean getFirst() {
		return first;
	}

	public void setFirst(Boolean first) {
		this.first = first;
	}

	public Integer getNumberOfElements() {
		return numberOfElements;
	}

	public void setNumberOfElements(Integer numberOfElements) {
		this.numberOfElements = numberOfElements;
	}

	public ReturnPage(Integer count, Integer pageNumber, Integer pageSize,
			List<T> content) {
		// 计算是否最后一页
		this.last = false;
		this.first = true;
		this.size = pageSize;
		this.number = pageNumber - 1;
		this.totalPages = 1;// 总页数
		this.totalElements = count;// 总数据
		long y = count % pageSize;
		this.totalPages = count / pageSize;
		if (y != 0) {
			totalPages += 1;
		}
		if (pageNumber != 1) {
			first = false;
		}
		if (this.number.equals(this.totalPages - 1)) {
			last = true;
		}
		this.content = content;
	}

}
