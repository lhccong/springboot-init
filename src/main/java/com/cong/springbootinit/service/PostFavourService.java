package com.cong.springbootinit.service;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.cong.springbootinit.model.entity.Post;
import com.cong.springbootinit.model.entity.PostFavour;
import com.cong.springbootinit.model.entity.User;

/**
 * 帖子收藏服务
 * # @author <a href="https://github.com/lhccong">程序员聪</a>
 */
public interface PostFavourService extends IService<PostFavour> {

    /**
     * 做帖子好
     * 帖子收藏
     *
     * @param postId    帖子 ID
     * @param loginUser 登录用户
     * @return int
     */
    int doPostFavour(long postId, User loginUser);

    /**
     * 按页面列出收藏夹
     * 分页获取用户收藏的帖子列表
     *
     * @param page         页
     * @param queryWrapper 查询包装器
     * @param favourUserId 支持用户 ID
     * @return {@link Page}<{@link Post}>
     */
    Page<Post> listFavourPostByPage(IPage<Post> page, Wrapper<Post> queryWrapper,
            long favourUserId);

    /**
     * 做帖子偏爱内部
     * 帖子收藏（内部服务）
     *
     * @param userId 用户 ID
     * @param postId 帖子 ID
     * @return int
     */
    int doPostFavourInner(long userId, long postId);
}
