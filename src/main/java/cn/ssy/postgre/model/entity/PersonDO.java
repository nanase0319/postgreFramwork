package cn.ssy.postgre.model.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * @author: sl
 * @since: 20/11/05 16:39
 */
@Data
@EqualsAndHashCode
@Accessors(chain = true)
public class PersonDO {

    private Long id;
    private String name;
    private Integer age;
}
