package com.itwillbs.trip.service;

import com.itwillbs.trip.domain.MemberVO;
import com.itwillbs.trip.dto.MemberDTO;
import com.itwillbs.trip.mapper.MemberMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class MemberServiceImpl implements MemberService {

    private final MemberMapper memberMapper;

    @Transactional
    public void register(MemberDTO memberDTO) {
        MemberVO memberVO = memberDTO.toVO();
        memberMapper.insert(memberVO);
    }

    @Override
    public MemberDTO getMember(Long mno) {
        MemberVO memberVO = memberMapper.read(mno);
        return MemberDTO.of(memberVO);
    }

    @Override
    public void update(Long mno, MemberDTO memberDTO) {
        memberDTO.setMno(mno);
        memberMapper.update(memberDTO);
    }

    @Override
    public void delete(Long mno) {
        memberMapper.delete(mno);
    }

}
