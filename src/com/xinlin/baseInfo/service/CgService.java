package com.xinlin.baseInfo.service;

import java.util.Map;

import com.xinlin.app.base.BaseService;
import com.xinlin.app.entity.vo.Page;
import com.xinlin.baseInfo.entity.Cg;

/**
 * ClassName: CgService 
 * @Description: TODO
 * @author Chenxl
 * @date 2015-6-3
 */
public interface CgService extends BaseService<Map<String, Object>> {

	/**
	 * @Description: 分页查询品种管理表的信息
	 * @param @param map
	 * @param @return   
	 * @return String  
	 * @throws
	 * @author Chenxl
	 * @date 2015-6-3
	 */
	Page pageQuery(Cg cg);

}
