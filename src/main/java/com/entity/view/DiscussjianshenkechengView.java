package com.entity.view;

import com.entity.DiscussjianshenkechengEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 健身课程评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-04-17 09:20:39
 */
@TableName("discussjianshenkecheng")
public class DiscussjianshenkechengView  extends DiscussjianshenkechengEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscussjianshenkechengView(){
	}
 
 	public DiscussjianshenkechengView(DiscussjianshenkechengEntity discussjianshenkechengEntity){
 	try {
			BeanUtils.copyProperties(this, discussjianshenkechengEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
