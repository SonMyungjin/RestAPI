package com.itwillbs.trip.mapper;

import com.itwillbs.trip.domain.MemberVO;
import com.itwillbs.trip.dto.MemberDTO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MemberMapper {

    void insert(MemberVO memberVO);

    MemberVO read(Long mno);

    void update(MemberDTO memberDTO);

    void delete(Long mno);

}
