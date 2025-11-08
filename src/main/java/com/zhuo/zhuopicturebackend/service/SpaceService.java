package com.zhuo.zhuopicturebackend.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.zhuo.zhuopicturebackend.model.dto.space.SpaceAddRequest;
import com.zhuo.zhuopicturebackend.model.dto.space.SpaceQueryRequest;
import com.zhuo.zhuopicturebackend.model.entity.Space;

import com.baomidou.mybatisplus.extension.service.IService;

import com.zhuo.zhuopicturebackend.model.entity.User;
import com.zhuo.zhuopicturebackend.model.vo.SpaceVO;

import javax.servlet.http.HttpServletRequest;

/**
 * @author zhuo
 * @description 针对表【space(空间)】的数据库操作Service
 * @createDate 2025-09-22 16:42:22
 */
public interface SpaceService extends IService<Space> {

    /**
     * 创建空间
     *
     * @param spaceAddRequest 创建空间请求
     * @param user 当前用户
     * @return
     */
    long addSpace(SpaceAddRequest spaceAddRequest, User  user);

    /**
     * 校验空间
     *
     * @param space 空间对象
     * @param add   是否为创建
     */
    void validSpace(Space space, boolean add);


    /**
     * 获取空间封装类(单条)
     *
     * @param space   空间对象
     * @param request 请求
     * @return spaceVO
     */
    SpaceVO getSpaceVO(Space space, HttpServletRequest request);

    /**
     * 分页获取空间封装类（分页）
     *
     * @param spacePage 空间分页对象
     * @param request   请求
     * @return spaceVOPage
     */
    Page<SpaceVO> getSpaceVOPage(Page<Space> spacePage, HttpServletRequest request);

    /**
     * 获取查询条件
     *
     * @param spaceQueryRequest
     * @return
     */
    QueryWrapper<Space> getQueryWrapper(SpaceQueryRequest spaceQueryRequest);

    /**
     * 根据空间级别填充空间对象
     *
     * @param space
     */
    void fillSpaceBySpaceLevel(Space space);

    /**
     * 校验权限
     * @param loginUser 当前用户
     * @param space 空间对象
     */
    void checkSpaceAuth(User loginUser, Space space);

}
