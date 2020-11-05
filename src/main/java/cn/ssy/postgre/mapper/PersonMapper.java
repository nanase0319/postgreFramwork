package cn.ssy.postgre.mapper;

import cn.ssy.postgre.model.entity.PersonDO;

import java.util.List;

/**
 * @author: sl
 * @since: 20/11/05 10:40
 */

public interface PersonMapper {
     void add(PersonDO personDO);
//
//     void delete(Integer id);
//
//     void update(PersonDO personDO);

     PersonDO findById(Integer id);

     List<PersonDO> findPersons();
}
