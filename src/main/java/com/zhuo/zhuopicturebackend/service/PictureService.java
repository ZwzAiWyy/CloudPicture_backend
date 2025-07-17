package com.zhuo.zhuopicturebackend.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.zhuo.zhuopicturebackend.model.dto.picture.PictureQueryRequest;
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
    PictureVO uploadPicture(MultipartFile multipartFile,
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
     * @param request 请求
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
}
