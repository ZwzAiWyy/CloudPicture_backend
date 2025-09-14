package com.zhuo.zhuopicturebackend.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.zhuo.zhuopicturebackend.model.dto.picture.PictureQueryRequest;
import com.zhuo.zhuopicturebackend.model.dto.picture.PictureReviewRequest;
import com.zhuo.zhuopicturebackend.model.dto.picture.PictureUploadByBatchRequest;
import com.zhuo.zhuopicturebackend.model.dto.picture.PictureUploadRequest;
import com.zhuo.zhuopicturebackend.model.entity.Picture;
import com.baomidou.mybatisplus.extension.service.IService;
import com.zhuo.zhuopicturebackend.model.entity.User;
import com.zhuo.zhuopicturebackend.model.vo.PictureVO;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;

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
     * @param pictureUploadRequest
     * @param loginUser
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
     * @param pictureQueryRequest
     * @return
     */
    QueryWrapper<Picture> getQueryWrapper(PictureQueryRequest pictureQueryRequest);

    /**
     * 图片审核
     *
     * @param pictureReviewRequest
     * @param loginUser
     */
    void doPictureReview(PictureReviewRequest pictureReviewRequest, User loginUser);

    /**
     * 填充审核参数
     *
     * @param picture
     * @param loginUser
     */
    void fillReviewParams(Picture picture, User loginUser);

    /**
     * 批量抓取和创建图片
     *
     * @param pictureUploadByBatchRequest
     * @param loginUser
     * @return 成功创建的图片数
     */
    Integer uploadPictureByBatch(
            PictureUploadByBatchRequest pictureUploadByBatchRequest,
            User loginUser
    );

}
