/**
 * Copyright (C), 2015-2017
 * FileName: BaseBean
 * Author:   fanyun
 * Date:     2017/12/3 15:20
 * Description: 控件内基础Bean，框架内所有Bean都应该继承于该类。
 */
package club.vann.springframework.bean;

import java.util.List;

/**
 *
 *
 * @author fanyun
 * @create 2017/12/3
 * @since 1.0.0
 */
public class BaseBean {
    private String field;
    private List<Object> fieldList;

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public List<Object> getFieldList() {
        return fieldList;
    }

    public void setFieldList(List<Object> fieldList) {
        this.fieldList = fieldList;
    }

    public class Work{
        private String name;
        private int size;


        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getSize() {
            return size;
        }

        public void setSize(int size) {
            this.size = size;
        }
    }
}
