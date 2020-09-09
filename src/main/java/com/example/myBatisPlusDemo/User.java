package com.example.myBatisPlusDemo;

import com.baomidou.mybatisplus.annotation.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    /**
     * id生成策略
     * public enum IdType {
     *   AUTO(0), // 数据库id自增
     *   NONE(1), // 未设置主键
     *   INPUT(2), // 手动输入
     *   ID_WORKER(3), // 默认的方式,全局唯一id
     *   UUID(4), // 全局唯一id uuid
     *   ID_WORKER_STR(5); //ID_WORKER 字符串表示法
     * }
     *
     */
    @TableId(type = IdType.AUTO)
    private Long id;
    private String name;
    private Integer age;
    private String email;
//    @TableField(fill = FieldFill.INSERT)
    private Date gmtCreate;
//    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Date gmtModified;
    @Version //乐观锁Version注解
    private Integer version;
    @TableLogic //逻辑删除
    private Integer deleted;
}
