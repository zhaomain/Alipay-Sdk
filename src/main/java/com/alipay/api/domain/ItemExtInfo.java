package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商品扩展信息KV对象
 *
 * @author auto create
 * @since 1.0, 2019-07-31 14:55:03
 */
public class ItemExtInfo extends AlipayObject {

	private static final long serialVersionUID = 3857157243521114346L;

	/**
	 * 扩展信息的key
	 */
	@ApiField("ext_key")
	private String extKey;

	/**
	 * 扩展信息的值
	 */
	@ApiField("ext_value")
	private String extValue;

	public String getExtKey() {
		return this.extKey;
	}
	public void setExtKey(String extKey) {
		this.extKey = extKey;
	}

	public String getExtValue() {
		return this.extValue;
	}
	public void setExtValue(String extValue) {
		this.extValue = extValue;
	}

}