package io.training.boot.features.gorm.mapper;

import io.training.boot.features.gorm.groovy.Person;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface PersonMapper {

    @Select("select * from people")
    List<Person> findAllPersonMybatis();

}
