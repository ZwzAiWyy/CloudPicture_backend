package com.zhuo.zhuopicturebackend.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.zhuo.zhuopicturebackend.model.dto.picture.*;
import com.zhuo.zhuopicturebackend.model.entity.Picture;
import com.baomidou.mybatisplus.extension.service.IService;
import com.zhuo.zhuopicturebackend.model.entity.User;
import com.zhuo.zhuopicturebackend.model.vo.PictureVO;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @author zhuo
 * @description 针对表【picture(图片)】的数据库操作Service
 * @createDate 2025-07-10 21:24:29
 */
public interface PictureService extends IService<Picture> {

    /**
     * 校验图片
     *
     * @param picture 图片对象
     */
    void validPicture(Picture picture);

    /**
     * 上传图片
     *
     * @param multipartFile
     * @param pictureUploadRequest 图片上传请求
     * @param loginUser 登录用户
     * @return
     */
    PictureVO uploadPicture(Object inputSource,
                            PictureUploadRequest pictureUploadRequest,
                            User loginUser);


    /**
     * 获取图片封装类(单条)
     *
     * @param picture 图片对象
     * @param request 请求
     * @return pictureVO
     */
    PictureVO getPictureVO(Picture picture, HttpServletRequest request);

    /**
     * 分页获取图片封装类（分页）
     *
     * @param picturePage 图片分页对象
     * @param request     请求
     * @return pictureVOPage
     */
    Page<PictureVO> getPictureVOPage(Page<Picture> picturePage, HttpServletRequest request);

    /**
     * 获取查询条件
     *
     * @param pictureQueryRequest 图片查询请求
     * @return
     */
    QueryWrapper<Picture> getQueryWrapper(PictureQueryRequest pictureQueryRequest);

    /**
     * 图片审核
     *
     * @param pictureReviewRequest 图片审核请求
     * @param loginUser  登录用户
     */
    void doPictureReview(PictureReviewRequest pictureReviewRequest, User loginUser);

    /**
     * 填充审核参数
     *
     * @param picture  图片
     * @param loginUser 登录用户
     */
    void fillReviewParams(Picture picture, User loginUser);

    /**
     * 批量抓取和创建图片
     *
     * @param pictureUploadByBatchRequest 图片批量上传请求
     * @param loginUser  登录用户
     * @return 成功创建的图片数
     */
    Integer uploadPictureByBatch(
            PictureUploadByBatchRequest pictureUploadByBatchRequest,
            User loginUser
    );

    /**
     * 清除图片文件
     *
     * @param oldPicture 旧图片
     */
    void clearPictureFile(Picture oldPicture);

    /**
     * 删除图片
     *
     * @param pictureId 图片id
     * @param loginUser 登录用户
     */
    void deletePicture(long pictureId, User loginUser);

    /**
     * 更新图片
     *
     * @param pictureEditRequest 图片编辑请求
     * @param loginUser 登录用户
     */
    void editPicture(PictureEditRequest pictureEditRequest, User loginUser);

    /**
     *  校验空间图片的权限
     *
     * @param loginUser 登录用户
     * @param picture  图片
     */
    void checkPictureAuth(User loginUser, Picture picture);

    /**
     * 根据颜色搜索图片
     *
     * @param spaceId 空间id
     * @param picColor 图片颜色
     * @param loginUser 登录用户
     * @return
     */
    List<PictureVO> searchPictureByColor(Long spaceId,String picColor,User loginUser);

    /**
     * 批量修改图片
     * @param pictureEditByBatchRequest 图片批量修改请求
     * @param loginUser 登录用户
     */
    void editPictureByBatch(PictureEditByBatchRequest pictureEditByBatchRequest, User loginUser);

}
