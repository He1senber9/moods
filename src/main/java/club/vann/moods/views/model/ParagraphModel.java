/**
 * Copyright (C), 2015-2017
 * FileName: ParagraphModel
 * Author:   fanyun
 * Date:     2017/12/6 21:39
 * Description: 句子模型类
 */
package club.vann.moods.views.model;

import club.vann.moods.base.BaseModel;
import club.vann.moods.base.RequestParam;
import org.springframework.stereotype.Repository;

import java.util.Date;

/**
 *
 *
 * @author fanyun
 * @create 2017/12/6
 * @since 1.0.0
 */
public class ParagraphModel implements BaseModel {
    private String paragarph;
    private String author;
    private String publisher;
    private Date publishDate;

    public String getParagarph() {
        return paragarph;
    }

    public void setParagarph(String paragarph) {
        this.paragarph = paragarph;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public Date getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(Date publishDate) {
        this.publishDate = publishDate;
    }
}
