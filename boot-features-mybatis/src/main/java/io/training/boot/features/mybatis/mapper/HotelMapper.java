package io.training.boot.features.mybatis.mapper;

import org.apache.ibatis.annotations.Mapper;

import io.training.boot.features.mybatis.domain.Hotel;

@Mapper
public interface HotelMapper {

	Hotel selectByCityId(int city_id);

}