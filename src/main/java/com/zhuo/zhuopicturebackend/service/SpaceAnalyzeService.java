package com.zhuo.zhuopicturebackend.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zhuo.zhuopicturebackend.model.dto.space.analyze.*;
import com.zhuo.zhuopicturebackend.model.entity.Space;
import com.zhuo.zhuopicturebackend.model.entity.User;
import com.zhuo.zhuopicturebackend.model.vo.space.analyze.*;

import java.util.List;

public interface SpaceAnalyzeService extends IService<Space> {

    /**
     * 获取空间使用情况分析
     * @param spaceUsageAnalyzeRequest 请求参数
     * @param loginUser 登录用户
     * @return SpaceUsageAnalyzeResponse 分析结果
     */
    SpaceUsageAnalyzeResponse getSpaceUsageAnalyze(SpaceUsageAnalyzeRequest spaceUsageAnalyzeRequest, User loginUser);


    /**
     * 获取空间图片分类使用情况分析
     * @param spaceCategoryAnalyzeRequest 请求参数
     * @param loginUser 登录用户
     * @return List<SpaceCategoryAnalyzeResponse> 分类使用情况列表
     */
    List<SpaceCategoryAnalyzeResponse> getSpaceCategoryAnalyze(SpaceCategoryAnalyzeRequest spaceCategoryAnalyzeRequest, User loginUser);

    /**
     * 获取空间图片标签使用情况分析
     * @param spaceTagAnalyzeRequest 请求参数
     * @param loginUser 登录用户
     * @return List<SpaceTagAnalyzeResponse> 标签使用情况列表
     */
    List<SpaceTagAnalyzeResponse> getSpaceTagAnalyze(SpaceTagAnalyzeRequest spaceTagAnalyzeRequest, User loginUser);

    /**
     * 获取空间图片大小使用情况分析
     * @param spaceSizeAnalyzeRequest 请求参数
     * @param loginUser 登录用户
     * @return List<SpaceSizeAnalyzeResponse> 大小使用情况列表
     */
    List<SpaceSizeAnalyzeResponse> getSpaceSizeAnalyze(SpaceSizeAnalyzeRequest spaceSizeAnalyzeRequest, User loginUser);

    /**
     * 获取空间用户上传行为分析
     * @param spaceUserAnalyzeRequest 请求参数
     * @param loginUser 登录用户
     * @return List<SpaceUserAnalyzeResponse> 用户使用情况列表
     */
    List<SpaceUserAnalyzeResponse> getSpaceUserAnalyze(SpaceUserAnalyzeRequest spaceUserAnalyzeRequest, User loginUser);

    /**
     * 获取空间使用排行分析（仅管理员）
     * @param spaceRankAnalyzeRequest 请求参数
     * @param loginUser 登录用户
     * @return List<Space> 排行列表
     */
    List<Space> getSpaceRankAnalyze(SpaceRankAnalyzeRequest spaceRankAnalyzeRequest, User loginUser);
}
