package cn.popo.news.core.entity.form;

import lombok.Data;

/**
 * @Author  Administrator
 * @Date    2018/5/25 18:06
 * @Desc    回复参数
 */

@Data
public class ReplyForm {
    /**
     * 评论的id
     */
    private String commId;

    /**
     * 被回复者的id
     */
    private String cid;

    /**
     * 回复者id
     */
    private String rid;

    /**
     * 回复内容
     */
    private String replyInfo;
}
