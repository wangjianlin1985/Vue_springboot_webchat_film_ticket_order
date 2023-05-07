package com.moke.wp.wx_weimai.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.moke.wp.wx_weimai.entity.CommentApprove;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentApproveMapper extends BaseMapper<CommentApprove> {
    @Select("select * from t_comment_approve where comment_id=#{commentId} and user_id=#{userId}")
    CommentApprove getByTwoId(@Param("commentId") Integer commentId, @Param("userId")Integer userId);

    @Delete("delete from t_comment_approve where comment_id=#{commentId} and user_id=#{userId}")
    void deleteByTwoId(@Param("commentId") Integer commentId, @Param("userId") Integer userId);
}
