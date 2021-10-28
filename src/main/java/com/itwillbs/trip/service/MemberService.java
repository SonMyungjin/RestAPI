package com.itwillbs.trip.service;

import com.itwillbs.trip.dto.MemberDTO;

public interface MemberService {

    void register(MemberDTO memberDTO);

    MemberDTO getMember(Long mno);

    void update(Long mno, MemberDTO memberDTO);

    void delete(Long mno);

}
